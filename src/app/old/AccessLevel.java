package app.old;

public class AccessLevel {


    public String canAccess(int[] rights, int minPermission) {
        char[] access = new char[rights.length];
        if (rights.length == 0)
            return "";

        for (int i = 0; i < rights.length; i++) {
            access[i] = (rights[i] < minPermission) ? 'D' : 'A';
        }
        return new String(access);
    }

    public static void main(String[] args) {

        //test 1
      //  int[] u = {0, 1, 2, 3, 4, 5};
     //   int p = 2;

        //test 2
     //   int[] u = {5,3,2,10,0};
     //        int p = 20;
        //test 3
       // int[] u =  {};
       //     int p = 20;
        //test 4
        int[] u = {34,78,9,52,11,1};
         int p = 49;

        AccessLevel accessLevel = new AccessLevel();
        System.out.println(accessLevel.canAccess(u, p));

    }
}
