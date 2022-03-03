package day10;

// Class definition:::
// Modifier (private/Public/protected)
// Keyword (class)
// ClassName ( begins with Capital letter)

import overloading.Testing;

public class ParentClass {

    // instance variables
    int s = 5;
    String firstName = "Prasanna";

//    // Define Constructor methods  (Always this is not required.)
//    // User this only when you want some code to run during Instantiation.
//    public void ParentClass(){
//        System.err.println(" This is default constructor");
//     }
//
//     //Constructor with input parameters
//    public void ParentClass( String str1){
//        System.err.println(" This is constructor with input parameters");
//    }
//
//    // Define Class methods
//    public void method1(){
//
//    }


    public static void main(String[] args) {
        Calculate calculateClass1 = new Calculate( 3,6);
        Calculate calculateClass2 = new Calculate( 8,2);

        Testing test1 = new Testing();

        test1.method1();

        System.out.println("call add method1:" + calculateClass1.add());
        System.out.println("call subtract method2:" + calculateClass2.add());


    }


}
