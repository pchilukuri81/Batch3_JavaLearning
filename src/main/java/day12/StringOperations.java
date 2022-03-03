package day12;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringOperations
{
    public static void main(String[] args) {
        String val = "This is Prasanta";

        System.out.println( val.length());

        System.out.println(val.length());

        String removedSpaces = val.trim();

        System.out .println(val.toLowerCase());

        System.out.println(val.toUpperCase());
         System.out.println(val.indexOf("s"));
    }

}


