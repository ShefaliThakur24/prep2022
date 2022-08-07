package com.faang.array_list;

import java.util.Comparator;

public class MakeYearComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.makingYear.compareTo(o2.makingYear);
    }
}
