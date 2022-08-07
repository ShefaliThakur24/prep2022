package com.faang.Arrays;

import java.util.Arrays;

public class ArraysDemoWithCopyCustomArray {
    public static void main(String[] args) {


        // Creating an Array of Employee objects.
        Employee[] emp1 = {new Employee(123, "rupal"), new Employee(121, "roshan"), new Employee(424, "sajan")};

        // Creating the copy of Array.
            Employee[] copiedArray = Arrays.copyOf(emp1, 2);

        // Changing the name of first employee in original array.
        emp1[0] = new Employee(123, "Changed Name");
        // Printing the name of first employee in original array.
        System.out.println(emp1[0].empName);

        // Printing the name of first employee in original array.

        System.out.println(copiedArray[0].empName);
//As we can see from the above program’s output, the name did not change in the copied array.
        //This means that the copyOf() method creates a deep copy of objects instead of just changing the references.
    }
}
