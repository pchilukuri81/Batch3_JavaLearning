package day10;

public class ChildClass {
    int b = 10;

    ChildClass() {
        super();

        System.out.println("This is a ChildClass");
    }


    public void methodChild() {
        //super.PrentMethod();
        System.out.println("Child method: " + b);
        //System.out println ("Parent variable: " );
    }

    public static void main(String[] args) {

    }
}


