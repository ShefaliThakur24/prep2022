package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//code implementation is ugly
//catching exceptiom
public class ExceptionsDemo {
    public static void show() {
     //   FileReader reader = null;
//checked exception
      //try with resources statement thr try statement with more or more resources with this structure
        // we dont need to explicitly close this resource inside the finally block//
        //the java compiler will do that for us when we run this code java compiler will convert this code
        //explicitly to commented finally block code but this class need to implement autoclosable interface close is the funcion of this interface
        try(var reader = new FileReader("file.txt");
            var writer = new FileReader("file.txt")
        ) {
        //    reader = new FileReader("file.txt");
            var value = reader.read();
//            new SimpleDateFormat().parse("");
//        System.out.println("file open");
//        } catch (FileNotFoundException ex) {
            //System.out.println("file does not exist");

            //when the line throws an exception the control move to the catch block for that exception so the code after the offendinf line
            //will not execute
            //  System.out.println("file open"); if i move this line after try catch block it will be executed
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
            //catching multiple exception
        } catch (IOException e){ //| ParseException e) {
            System.out.println("could not read data");
        }//this will get ignored after first caTCH BLOCK
//
        ////code implementation is ugly better way of releasing external resources like filreader and db connections

//        catch (ParseException e) {
//            System.out.println("could not read data");
//        }
        System.out.println("file open");
    }
//Finally

    public static void main(String[] args) {
        ExceptionsDemo.show();

    }
}