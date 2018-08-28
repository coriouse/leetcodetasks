package app.old;

import java.util.Stack;

public class StackLostBracket {


    private String txt;

    public StackLostBracket(String txt) {
        this.txt = txt;
    }


    public boolean check() {
        Stack stack = new Stack();

        for (int i = 0; i < txt.length(); i++) {
                switch(txt.charAt(i)) {
                    case '{':
                        stack.add(txt.charAt(i));
                        break;
                    case '}':
                        if(stack.isEmpty())
                            return false;

                            char ch = (char) stack.pop();

                            if (txt.charAt(i) == ch)
                                return false;

                     break;
                }
        }
        return true;

    }


    public static void main(String[] args) {

        String txt = "{sd{fg}";

        StackLostBracket stackLostBracket = new StackLostBracket(txt);
        System.out.println(stackLostBracket.check());
    }

}
