//java.lang is a package and this is a mandatory package and it work and gets imported automatically even if it is not imported explicitly.
/*import java.lang.*;*/

/*Class name is "MyFirstClass" - better to keep this same as the file name. 
here the class is public*/

public class MyFirstClass {

    /*  Here we only have a single method i.e main
    public : For the class to be accessible outside the class, it should be public.
    static: For any function to be used with out creating any object.
    void : As this function is not returning anything.
    main : the execution start of the program.
    String args[] : command line arguments
    JVM only recognises the main method only in the below format "public static void main(String[] args)"*/
    public static void main(String[] args) { 

        /* This "System.out.println" is used to print anything on the console.
        System : Class
        out: Object
        println : method */
        System.out.println("Hello World");
    }
}

/* First as part of runnning the program initially we have to run "javac MyFirstClass.java"
and then a new class with name "MyFirstClass.class" (with error free byte code)   is created if there are no errors and then this should be run using Java MyFirstClass. */