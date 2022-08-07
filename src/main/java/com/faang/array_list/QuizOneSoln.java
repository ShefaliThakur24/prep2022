package com.faang.array_list;

import java.util.ArrayList;
import java.util.List;

public class QuizOneSoln {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        System.out.println(list);
        list.add(6);
        System.out.println(list);
        list.add(0,4);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);


    }
}
