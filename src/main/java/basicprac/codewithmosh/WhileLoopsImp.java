package basicprac.codewithmosh;

import java.util.Locale;
import java.util.Scanner;

public class WhileLoopsImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
//        for(int i=0;i<5;i++)
//            System.out.println("Hello World");
//        int j=0;
//        while(j<=0)
//            System.out.println("HelloWorld");

        // while (!input.equals("quit"))

        //when using break statement you can also write this but make sure you use break statement with this;
        while (true) {
            System.out.println("Enter :");
            input = scanner.next().toLowerCase();
            //  if (!input.equals("quit"))
            //another way of solving this problem
            if (input.equals("Pass"))
                continue;//continue statement moves control to the beginning of the loop;
            if (input.equals("quit"))
                break;//break statement exit the loop;
            System.out.println(input);


//With while loops we check the condition first if this condition is false this loop will never execute
            //but in case of do while loop we check the condition last so in this case the do while loops
            //gets executed atleast once even if the condition is false
//        do {
//            System.out.println("Enter :");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//
//        } while (!input.equals("quit"));
//

        }

    }
}

