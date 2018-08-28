package app.old;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class UniqueDigits {


    public int count(int n) {

        if (n == 1)
            return 0;

        if (n == 9)
            return 9;

        int counter = 0;
        for (int i = 10; i <= n-1; i++) {
            if (isUniq(i))
                counter++;
        }

        return counter+9;
    }

    private boolean isUniq(int number) {
        Set<Integer> digits = new HashSet<>();
        int n = number;
        while (n > 0) {
            int digit = n % 10;
            if(digits.contains(digit))
                return false;
            digits.add(digit);
            n = n / 10;
        }
        return true;

    }

    public static void main(String[] args) {
    UniqueDigits uniqueDigits = new UniqueDigits();
long s = System.currentTimeMillis();
        System.out.println("res="+uniqueDigits.count(10000));
        System.out.println((System.currentTimeMillis()-s));
    }
}
