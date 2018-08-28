package thrd;

public class Deadlock {
    public static void main(String[] args) {
        Integer src1 = 100;
        Integer src2 = 100;
        new Thread(()-> {
            synchronized (src1) {
                System.out.println("Lock 1  "+ Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (src2) {
                    System.out.println("Lock 2  "+ Thread.currentThread().getName());
                }
            }
        }).start();

        new Thread(()-> {
            synchronized (src2) {
                System.out.println("Lock 2  "+ Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (src1) {
                    System.out.println("Lock 1  "+ Thread.currentThread().getName());
                }
            }
        }).start();
    }
}
