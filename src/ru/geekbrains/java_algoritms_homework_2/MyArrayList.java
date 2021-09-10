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

    public int binarySearch(int value) {
        int lo = 0;
        int hi = myArrayList.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (value < myArrayList.get(mid)) {
                hi = mid - 1;
            } else if (value > myArrayList.get(mid)) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public void print() {
        System.out.println(myArrayList);
    }

    private boolean less(int item1, int item2) {
        return (item1 < item2);
    }

    private void swap(int index1, int index2) {
        int temp = myArrayList.get(index1);
        myArrayList.set(index1, myArrayList.get(index2));
        myArrayList.set(index2, temp);
    }

    public int selectionSort() {
        int iMin;
        int speedCount = 0;
        for (int i = 0; i < myArrayList.size() - 1; i++) {
            iMin = i;
            speedCount++;
            for (int j = i + 1; j < myArrayList.size(); j++) {
                speedCount++;
                if (less(myArrayList.get(j), myArrayList.get(iMin))) {
                    iMin = j;
                    speedCount++;
                }
            }
            swap(i, iMin);
            speedCount++;
        }
        return speedCount;
    }

    public int insertionSort() {
        int key;
        int speedCount = 0;
        for (int i = 0; i < myArrayList.size(); i++) {
            speedCount++;
            int j = i;
            key = myArrayList.get(i);
            while (j > 0 && less(key, myArrayList.get(j - 1))) {
                myArrayList.set(j, myArrayList.get(j - 1));
                j--;
                speedCount++;
            }
            myArrayList.set(j, key);
            speedCount++;
        }
        return speedCount;
    }

    public int bubbleSort() {
        int speedCount = 0;
        for (int i = myArrayList.size() - 1; i > 0; i--) {
            speedCount++;
            for (int j = 0; j < i; j++) {
                speedCount++;
                if (less(myArrayList.get(j + 1), myArrayList.get(j))) {
                    speedCount++;
                    swap(j + 1, j);
                }
            }
        }
        return speedCount;
    }

    public int bubbleSortOptimized() {
        boolean isSwap;
        int speedCount = 0;
        for (int i = myArrayList.size() - 1; i > 0; i--) {
            speedCount++;
            isSwap = false;
            for (int j = 0; j < i; j++) {
                speedCount++;
                if (less(myArrayList.get(j + 1), myArrayList.get(j))) {
                    speedCount++;
                    swap(j + 1, j);
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
        return speedCount;
    }
}
