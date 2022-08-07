package basicprac.codewithmosh;

import java.util.Scanner;

/*Java Method to solve
FizzBuzz problem, which states that program *
should print fizz if number is multiple of 3,
* print buzz if number is multiple * of 5, and print fizzbuzz if number is multiple of both 3 and 5 *

Read more: https://www.java67.com/2015/10/how-to-solve-fizzbuzz-in-java.html#ixzz7UbviaRJu*/
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = scanner.nextInt();
        //most specific conditions on the top and most generic ones on the bottom;
        if (number % 15 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}
