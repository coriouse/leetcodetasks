package app.old;

public class SolutionCamelCase {
    public static void main(String[] args) {

        String str = "saveChangesInTheEditor";

        int count = 0;
        for(int i = 0;i<str.length();i++) {
            if(i == 0) {
                count++;
            }

            if((int)str.charAt(i)>= 65 && (int)str.charAt(i)<= 90) {
                count++;
            }
        }

        System.out.println(count);

    }
}
