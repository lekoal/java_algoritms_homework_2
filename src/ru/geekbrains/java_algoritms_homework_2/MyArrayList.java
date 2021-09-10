package ru.geekbrains.java_algoritms_homework_2;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class MyArrayList {

    List<Integer> myArrayList;

    public MyArrayList(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("capacity cant be <= 0");
        myArrayList = new ArrayList<>(capacity);

        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            myArrayList.add(random.nextInt(1000));
        }
    }

    public void print() {
        System.out.println(myArrayList);
    }
}
