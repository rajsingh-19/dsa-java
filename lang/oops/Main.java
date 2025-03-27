package oops;

public class Main {
    // public static void main(String [] args) {
    public static void main(String args []) {
        //          --without constructor--

        // Students std1 = new Students();
        // std1.name = "Raj Singh";
        // // std1.rollNo = 1;
        // System.out.println("std1 name:" + " " + std1.name);
        // // System.out.println("std1 roll no:" + std1.rollNo); 

        //          --with constructor--
        Students constructStd1 = new Students("Ramesh", 42);
        System.out.println("Construct case std name in same package is : " + constructStd1.name);
        constructStd1.getRollNo();
    };
}
