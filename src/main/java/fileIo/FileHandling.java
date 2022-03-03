package fileIo;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling
{
    public static void main(String[] args) throws IOException {
      try{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/FileRead_Write.Txt"));
         bufferedWriter.Writer("Hello Java");

    }





