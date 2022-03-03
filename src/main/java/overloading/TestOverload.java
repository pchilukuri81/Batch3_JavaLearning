package overloading;

public class TestOverload {

    public  boolean TestOverload(){
        System.err.println("I am inside constructor" );
        return true;
    }


    public  boolean TestOverload(int i){
        System.err.println("I am inside constructor" + i);
        return true;
    }

    public void method1(){

        System.err.println("I am inside method1");

    }



}

