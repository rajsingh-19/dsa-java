package newOOPs;

import oops.Students;           //importing the Student class from the oops package

public class Modifier {
    //      we are accesing the Student class from the another folder/package - user defined package
    public static void main (String args[]) {

        //          --in case of without constructor--

        // Students student1 = new Students();
        // student1.name = "Arush verma";
        
        // // student1.rollNo = 2;
        // student1.setRollNo(25);
        // student1.getRollNo();

        // System.out.println("Student 1 of Modifer class : " + " " + student1.name);
        // // System.out.println("Student 1 roll no of modifier class : " + " " + student1.rollNo);


        //          --in case of constructor-- 
        Students stdWithConstructor = new Students("Nancy", 50);
        System.out.println("Student name with constructor case : " + stdWithConstructor.name);
        stdWithConstructor.getRollNo();
    };
}
