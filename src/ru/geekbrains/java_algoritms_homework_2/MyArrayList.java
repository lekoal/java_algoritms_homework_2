package ru.geekbrains.java_algoritms_homework_2;

import java.util.Collections;
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

    public void add(int index, int value) {
        if (index <= 0) throw new IllegalArgumentException("index cant be <= 0");
        myArrayList.add(index, value);
    }

    public void add(int value) {
        myArrayList.add(value);
    }

    public void deleteIndex(int index) {
        if (index <= 0) throw new IllegalArgumentException("index cant be <= 0");
        myArrayList.remove(index);
    }

    public void deleteAllValue(int value) {
        myArrayList.removeAll(Collections.singleton(value));
    }

    public void deleteValue(int value) {
        myArrayList.remove((Object) value);
    }

    public int searchByIndex(int index) {
        if (index < 0 || index > myArrayList.size())
            throw new IllegalArgumentException("index cant be < 0 or > array size");
        return myArrayList.get(index);
    }

    public int searchByValue(int value) {
        if (myArrayList.contains(value)) return myArrayList.indexOf(value);
        return -1;
    }

    public void print() {
        System.out.println(myArrayList);
    }
}
