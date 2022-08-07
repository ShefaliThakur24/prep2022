package com.faang.Hash_Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class DesignGoodKey {
    public static void main(String[] args) {


        Employee emp1 = new Employee(123, "Jane");
        Employee emp2 = new Employee(123, "Jane");

        Map<Employee, Integer> hashmap = new HashMap<>();
        hashmap.put(emp1, 33000);
        hashmap.put(emp2, 33400);
emp1.empName="Simran";

        System.out.println(hashmap.get(emp1));
        for (Entry<Employee, Integer> entry : hashmap.entrySet()) {
            System.out.println("Employee Id: " + entry.getKey().empId + "Employee Name: " + entry.getKey().empName);


        }

    }
}
