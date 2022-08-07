package basicprac.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString(){
        return ("name =" + name + ",salary =" + salary);
    }
}

class EmpComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
       // return o1.salary - o2.salary; min salary
        //max salary
        return o2.salary - o1.salary;
    }
}

public class PriorityQueueJavaObjectsTofindleastSalary {
    public static void main(String[] args) {
        EmpComparator comp = new EmpComparator();
        PriorityQueue<Employee> emp = new PriorityQueue<>(comp);
        emp.add(new Employee("A",300));
        emp.add(new Employee("B",200));
        emp.add(new Employee("C",4000));
        emp.add(new Employee("D",50));
        emp.add(new Employee("E",10));
        emp.add(new Employee("F",3500));
        emp.add(new Employee("G",50000));

        System.out.println(emp.poll());
        System.out.println(emp);
    }
}
