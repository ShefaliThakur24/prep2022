package com.faang.array_list;

public class Vehicle implements Comparable<Vehicle>{
String brand;
Integer makingYear;
    public Vehicle(String brand,Integer makingYear)
    {
        this.brand=brand;
        this.makingYear=makingYear;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", makingYear=" + makingYear +
                '}';
    }

    @Override	// We can also use the compareTo() method of the Integer class.
    //return this.makeYear.compareTo(o.makeYear);
    public int compareTo(Vehicle o) {
        //return this.makingYear - o.makingYear;
        //If we need to sort the Vehicle class on the basis of the brand name, the logic will be as below:
       ////Using the compareTo() method of String class.
        return this.brand.compareTo(o.brand);
    }
}
