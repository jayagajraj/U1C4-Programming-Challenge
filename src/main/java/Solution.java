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
        int lens1 = s1.length();
        int lens2 = s2.length();
        if (lens1 + lens2 > 0){
            if (lens2 == 0){
                return s1; }
            if (lens1 == 0){
                return s2;}
            if ( s1.substring(lens1-1, lens1).equals(s2.substring(0,1))) {
            return s1 + s2.substring(1);}}
         else 
            return (s1.substring(0) + s2.substring(0));
        return s1+s2;
        
        }

    public String withoutX(String s1) {
        //implement code here
        int len = s1.length();
        if ((s1.substring(0,1).equals("x")) && (s1.substring(len -1).equals("x"))){
            return s1.substring(1,len-1);
        }
        if (s1.substring(0,1).equals("x")) {
            //remove the first character
            return s1.substring(1);
        }
        if (s1.substring(len - 1).equals("x")) {
            //remove last character
            String lastchar = s1.substring(0, len-1);
            return lastchar; }
        return s1; }

    public String fizzString(String s1) {
        //implement code here
       int lenOfs1 = s1.length();
    
       if ((s1.substring(0,1).equals("f")) && (s1.substring( (lenOfs1-1), lenOfs1).equals("b"))) {
        return "FizzBuzz";
       } 
       if (s1.substring(0,1).equals("f")){
        return "Fizz";
       } if (s1.substring( (lenOfs1-1), lenOfs1).equals("b")) {
        return "Buzz";
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
