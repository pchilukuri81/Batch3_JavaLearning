package day1;

public class Hello {

    int x = 14;
    int y = 17;

    String userName = "Prasanna";

    static String firstName = "Venubabu";

    public static void main(String[] args) {
        System.err.println("This is Prasanna");
        System.err.println("This is Venu");
        System.err.println("Total for 5 plus 6 is :" + addMethod(107, 600));
       // System.err.println("Total for 5 plus 6 is :" + addMethod(userName, "Chilukuri"));

    }

    public static int addMethod(int a, int b) {
        //public static int addMethod(int a, int b){

        int result = 0;
        result = a + b;
        return result;
    }

    public static String addMethod(String a, String b) {

        String result = null;
        result = a + " " + b;
        return result;
    }
}
