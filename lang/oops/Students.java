package oops; // we are importing this package this way - because it user defined and all the classes are in the same folder i.e., oops

public class Students {
    //  we can define the access of these keys - private, public, protected, default
    // String name;             // this has default access - that can be acces in diff class of the same package
    // private String name;                // this can't be access - in the diff class of the same package as well as in the diff class of diff package, it can be only used in this file and in this class
    

    //          making a setter and getter functions - private access modifier with getter and setter fns
    private int rollNo;
    //        set roll no
    public void setRollNo (int rollNumber) {
        //      fn for preventing the negative numbers
        if(rollNumber <= 0) {
            return;
        }
        // this.rollNo = rollNumber;        //if the parameter name and the variable name is same then we have to use the this keyword for accesssing the actual variable value
        // here this is poining to the current object (relate this with js this keyword) 
        rollNo = rollNumber;
    } 
    //        get roll no
    public void getRollNo () {
        System.out.println("Set roll number is : " + rollNo);
    }


    public String name;                // this will give errors - in the diff class of the same package as well as in the diff class of diff package, it can be only used in this file and in this class

    // public int rollNo;          // making this public from default so that it can be used in the modifier class of newOOPs package


    //              constructor 
    public Students (String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

