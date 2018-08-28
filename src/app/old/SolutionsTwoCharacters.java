package app.old;

public class SolutionsTwoCharacters {


    public static void main(String[] args) {
        //String s = "bjabeabeefeabgf";
       // String s = "beabeefeabafbabeabmababambm";
        // String s = "aaaabbbbcccc";
      //  String s = "beabeefeab";
        String s = "bfababaf";
        int c = 0;
        int[] lsit = new int[196];
        for (int i = 0; i < s.length(); i++) {
            int ceq = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    //   System.out.println("!EQ = "+s.charAt(i)+" != "+s.charAt(j));
                    ceq = 0;
                } else {
                    lsit[(int) s.charAt(i)] = lsit[(int) s.charAt(i)] + 1;
                    ceq++;
                    // System.out.println("EQ="+s.charAt(i)+" == "+s.charAt(j));

                }
                if (ceq > 1) {
                    //System.out.println("ceq=" + ceq);
                    ceq = 0;
                    lsit[(int) s.charAt(i)] = -1;
                    break;
                }

            }


            /*if((s.length() - ceq)) {
                sb.append(s.charAt(i));
            }*/
            //   System.out.println(ceq);


            //System.out.println(s.charAt(i));

        }



        int count = 0;
        char first = 0;
        char second = 0;
        int marker = 0;
        int exchFlag = 0;
        for(int i = 0;i<s.length();i++) {
         //  if(lsit[(int)s.charAt(i)] > 1) {
                if(marker == 0){
                    first = s.charAt(i);
                    marker = 1;
                    count++;
                } else {
                    if (first != s.charAt(i)) {
                        count++;
                        exchFlag++;
                    } else if(first == s.charAt(i) && exchFlag == 1) {
                        count++;
                        first = s.charAt(i);
                        exchFlag = 0;

                    }



                    }
                }
         //   }

        System.out.println("count="+count);
        }


    }

