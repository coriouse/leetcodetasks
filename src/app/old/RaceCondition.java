package app.old;


public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        final Integer[] counter = {0};

        new Thread(()-> {
            for(int i = 0;i< 1_000;i++) {
                synchronized (counter) {
                    counter[0]++;
                }
            }




        }).start();

        new Thread(()-> {
            for(int i = 0;i< 1_000;i++) {
                synchronized (counter) {
                    counter[0]--;
                }
            }
        }).start();
    Thread.sleep(1000);
        System.out.println(counter[0]);

    }

}




