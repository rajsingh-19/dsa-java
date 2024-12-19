public class Basics {
    public static void main(String args[]) {
        System.out.println("Hello");

        //  variable declare
        int a = 8, b = 9;
        // Calling the getSum method and printing the result
        int Sum = getSum(a, b);
        System.out.println("Sum of a: " + a + " and b: " + b + " is " + Sum);
    };


    public static int getSum(int a, int b) {
        return a + b;
    };
}