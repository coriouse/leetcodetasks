package app.old;

import java.util.Stack;

public class SolutionBinaryGaps {



        public int solution(int N) {


            Stack<Integer> num = new Stack<>();

            while (N != 0) {
                int d = N % 2;
                N /= 2;
                num.add(d);
            }

            int counter = 0;
            int max = 0;
            boolean isGap = false;
            while(!num.isEmpty()) {
             int d = num.pop();
                if (d == 1) {
                    if (counter > max) {
                        max = counter;
                    }
                    isGap = true;
                    counter = 0;
                } else {
                    counter++;
                    isGap = false;
                }
            }

            System.out.println();
            return max;

        }

    public static void main(String[] args) {

            SolutionBinaryGaps sb = new SolutionBinaryGaps();
        System.out.println(sb.solution(15   ));

    }



}
