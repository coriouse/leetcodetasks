package app.old;

public class SolutionPrimeAndComposite {

    public static void main(String[] args) {


        int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};


        for(int i = 0;i<A.length;i++) {

            int count = 0;
            for(int j = 0;j<A.length;j++) {
                    if(A[i] % A[j] == 0) {
                        count++;
                    }
            }

            System.out.println(A[i]+"="+count);


        }


    }

    static int simpleArraySum(int n, int[] ar) {
        int sum = 0;
        for(int i = 0;i<ar.length;i++) {
            sum += ar[i];
        }
        return sum;
    }
}
