package com.faang.array_list;

public class Employee implements Comparable<Employee> {
    String name;
    int age;
    String country;

    public Employee(String name, int age,String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    //We will sort the employee based on age in ascending order
    //returns a negative integer, zero, or a positive integer as this employee age
    //is less than, equal to, or greater than the specified object.
    @Override
    public int compareTo(Employee emp) {
        return (this.age - emp.age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
