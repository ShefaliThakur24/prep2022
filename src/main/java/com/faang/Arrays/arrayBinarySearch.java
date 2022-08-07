package com.faang.Arrays;


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class arrayBinarySearch {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

        int index = Arrays.binarySearch(numbers, 0, 8, 5);
        System.out.println("The index of element 4 in the array is " + index);
        index = Arrays.binarySearch(numbers, 1, 5, 4);
        System.out.println("The index of element 4 in the array is " + index);

        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }

        Arrays.parallelSort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }


        Employee[] employees = {new Employee(123, "shruti"), new Employee(1233, "shrti"), new Employee(1323, "sds")};
        int index1 = Arrays.binarySearch(employees, new Employee(123, "shruti"), (emp1, emp2) -> emp1.empId - emp2.empId);
        //     System.out.println(index1);

        int[] newArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("The copied array is: ");
        for (int i : newArray) {
            System.out.println(i);
        }

        int[] newArrayBiggerSize = Arrays.copyOf(numbers, 20);
        System.out.println("The copied array is: ");
        for (int i : newArrayBiggerSize) {
            System.out.println(i);
        }

        int[] newArrayRange = Arrays.copyOfRange(numbers, 0, 5);
        System.out.println("The copied array range is: ");

        for (int i : newArrayRange) {
            System.out.println(i);
        }
    }

}
