public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        //implement code here
        int len = x.length();
        if ( len < 2) {
            return false;
        }
        if( (x.substring(len-2).equals("ly"))) {
            return true;
        }
            return false;
        }


    public String conCat(String s1, String s2) {
        //implement code here
        int lenS1 = s1.length();
        int lenS2 = s2.length();
        while (lenS1 + lenS2 > 0) {
            
         if ( s1.substring(lenS1-1, lenS1).equals(s2.substring(0,1))) {
            return s1 + s2.substring(1);
        }
        else {
            return s1 + s2;
        }
        }
        return "";
    }

    public String withoutX(String s1) {
        //implement code here
        if (s1.substring(0,1).equals("x")) {
        String newS1 = s1.substring(1);
        int newS1Len = newS1.length();
        if (newS1.substring(newS1Len).equals("x")){

        String betS1 = newS1.substring(0,newS1Len-1);
        return betS1;
        }
        }
        return (String) s1.substring(1);
    }

    public String fizzString(String s1) {
        //implement code here
       int lenOfs1 = s1.length();
    
        if (s1.substring(0,1).equals("f")){
        return "Fizz";
       } if (s1.substring( (lenOfs1-1), lenOfs1).equals("b")) {
        return "Buzz";
       } if ((s1.substring(0,1).equals("f")) && (s1.substring( (lenOfs1-1), lenOfs1).equals("b"))) {
        return "FizzBuzz";
       }
       else {
        return s1;
       }
       }


    public String fizzString2(int x) {
        //implement code here
        int mod3 = x % 3;
        int mod5 = x % 5;
        int both = mod3+mod5;
        if (mod3 == 0){
            return "Fizz!";
        }
        if(mod5 == 0){
            return "Buzz!";
        }
        if (both == 0){
            return "FizzBuzz!";
        }
        return x + "!";
    }

}
