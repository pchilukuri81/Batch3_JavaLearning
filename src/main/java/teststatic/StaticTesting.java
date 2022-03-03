package teststatic;

public class StaticTesting {
    int a = 5; //declare variable and assign value
    //you can also write this as
   static int b; // Just declared variable

   public void nonstaticmethod1() {
       System.err.println("Value of variable b is:" + b );
       b = 4; // assign value to variable
       System.out.println("Value of variable b is:" + b );

       System.err.println("Value of variable a is:" + a );
       a = 3; // override value for variable a
       System.out.println("Value of variable a is:" + a );
   }


    public static void staticmethod() {
        System.err.println("Value of variable b is:" + b);
    }

    public static void main(String[] args) {
        System.err.println("Inside Main method");
        StaticTesting var1;

         var1 = new StaticTesting(); // Create instance of class, (also called as "instantiation" )
        var1.nonstaticmethod1(); // NON-Static methods can only be used from "instance variable"

        staticmethod();  // Static methods can be called directly



        //var1.st


    }
}
