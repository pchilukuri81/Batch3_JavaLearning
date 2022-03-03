package day12;


public class StringPrinter

{
     String Printer;

     //Constructor
     StringPrinter(String Printer) {
         this.Printer = Printer;
     }

     //Class Method
     public void printString()
     {
       System.out.println(Printer);

    }

    //Main method
    public static void main(String[] args){
     StringPrinter obj = new StringPrinter("Hello");
     obj.printString();
    }
}
