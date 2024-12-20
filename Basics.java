public class Basics {
    public static void main(String args[]) {
        System.out.println("Hello");

        //  variable declare
        int a = 8, b = 9;
        // Calling the getSum method and printing the result
        int Sum = getSum(a, b);
        System.out.println("Sum of a: " + a + " and b: " + b + " is " + Sum);
        
        // calling the cigarParty method and printing the result
        boolean cigarPartySuccess = cigarParty( 50,false);
        System.out.println(cigarPartySuccess);
    };


    public static int getSum(int a, int b) {
        return a + b;
    };

    /* 
    When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
    cigarParty(30, false) → false
    cigarParty(50, false) → true
    cigarParty(70, true) → true
    */

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if((cigars >= 40 && cigars <= 60) && !isWeekend) {
            return true;
        } else if  (cigars <= 40 && isWeekend) {
            return true;
        } else {
            return false;
        }
    }
}