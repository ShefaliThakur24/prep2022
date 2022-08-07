package com.faang.Hash_Map;

public class Employee {


    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

//    @Override hashcode method of object class
@Override
    public int hashCode() {

    final int prime = 31;
    int result = 1;
    result = prime * result + empId;
    result = prime * result + (empName == null ? 0 : empName.hashCode());
    return result;

    //    @Override equals() method of object class
}
    @Override
    public boolean equals(Object obj)
    {
         Employee employee = (Employee) obj;

    if(employee == null)
    {
return false;
    }
if(getClass() != employee.getClass())
{
    return false;
}
if(this.empId != employee.empId)
{
    return false;
}
if(this.empName != employee.empName)
{
    return false;
}
return true;
}
}

