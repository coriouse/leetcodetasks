package app.old;

public class SolutionFrogJmp {

    public int solution(int X, int Y, int D) {
        return Double.valueOf(Math.ceil((Y - X) / (double) D)).intValue();
    }


    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        SolutionFrogJmp solutionFrogJmp = new SolutionFrogJmp();
        System.out.println(solutionFrogJmp.solution(X,Y,D));
    }
}
