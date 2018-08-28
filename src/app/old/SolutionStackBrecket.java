package app.old;

import java.util.Stack;

public class SolutionStackBrecket {


    String isBalanced(String s) {
        Stack<Character> stack = new Stack();


        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            switch (ch) {


                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stack.empty()) {
                        char out = stack.pop();
                        if (ch == '}' && out != '{' ||
                                ch == ']' && out != '[' ||
                                ch == ')' && out != '(') {
                            return "NO";
                        }
                    }
                    break;

            }
        }

        return stack.empty() ? "YES" : "NO";
    }

    public static void main(String[] args) {

        String t1 = "{[()]}";
        String t0 = "{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{";
        String t2 = "{[(])}";
        String t3 = "{{[[(())]]}}";
    SolutionStackBrecket solutionStackBrecket = new SolutionStackBrecket();
        System.out.println(solutionStackBrecket.isBalanced(t0));

    }
}
