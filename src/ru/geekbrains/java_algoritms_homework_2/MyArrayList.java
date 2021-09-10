package ru.geekbrains.java_algoritms_homework_2;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class MyArrayList {

    ArrayList<Integer> myArrayList;

    public MyArrayList(int capacity) { // конструктор массива, при вызывании заполняет его случайными числами в пределе 1000 значений
        if (capacity <= 0) throw new IllegalArgumentException("capacity cant be <= 0");
        myArrayList = new ArrayList<>(capacity);

        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            myArrayList.add(random.nextInt(1000));
        }
    }

    public void add(int index, int value) { // метод добавления значения по индексу
        if (index <= 0) throw new IllegalArgumentException("index cant be <= 0");
        myArrayList.add(index, value);
    }

    public void add(int value) { // метод добавления значения в конец
        myArrayList.add(value);
    }

    public void deleteIndex(int index) { // метод удаления по индексу
        if (index <= 0) throw new IllegalArgumentException("index cant be <= 0");
        myArrayList.remove(index);
    }

    public void deleteAllValue(int value) { // метод удаления всех заданных значений
        myArrayList.removeAll(Collections.singleton(value));
    }

    public void deleteValue(int value) { // метод удаления по значению
        myArrayList.remove((Object) value);
    }

    public int searchByIndex(int index) { // метод поиска по индексу
        if (index < 0 || index > myArrayList.size())
            throw new IllegalArgumentException("index cant be < 0 or > array size");
        return myArrayList.get(index);
    }

    public int searchByValue(int value) { // метод поиска по значению
        if (myArrayList.contains(value)) return myArrayList.indexOf(value);
        return -1;
    }

    public int binarySearch(int value) { // метод бинарного поиска в отсортированном массиве
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

    public void checkSize() { // метод проверки размера массива
        System.out.println("array size is: " + myArrayList.size());
    }

    public void enlargeArray() { // метод увеличения массива в 1,5 + 1 раз
        double capacity = (myArrayList.size() * 1.5 + 1) - myArrayList.size();
            for (int i = 0; i < (int)capacity; i++) {
                myArrayList.add(null);
            }
    }

    public void print() { // метод вывода массива в консоль
        System.out.println(myArrayList);
    }

    private boolean less(int item1, int item2) { // проверка на меньшее число
        return (item1 < item2);
    }

    private void swap(int index1, int index2) { // метод замены значения
        int temp = myArrayList.get(index1);
        myArrayList.set(index1, myArrayList.get(index2));
        myArrayList.set(index2, temp);
    }

    public int selectionSort() { // метод сортировки методом выбора
        int iMin;
        int operationsCount = 0;
        for (int i = 0; i < myArrayList.size() - 1; i++) {
            iMin = i;
            operationsCount++;
            for (int j = i + 1; j < myArrayList.size(); j++) {
                operationsCount++;
                if (less(myArrayList.get(j), myArrayList.get(iMin))) {
                    iMin = j;
                    operationsCount++;
                }
            }
            swap(i, iMin);
            operationsCount++;
        }
        return operationsCount;
    }

    public int insertionSort() { // метод сортировки методом вставки
        int key;
        int operationsCount = 0;
        for (int i = 0; i < myArrayList.size(); i++) {
            operationsCount++;
            int j = i;
            key = myArrayList.get(i);
            while (j > 0 && less(key, myArrayList.get(j - 1))) {
                myArrayList.set(j, myArrayList.get(j - 1));
                j--;
                operationsCount++;
            }
            myArrayList.set(j, key);
            operationsCount++;
        }
        return operationsCount;
    }

    public int bubbleSort() { // метод пузырьковой сортировки
        int operationsCount = 0;
        for (int i = myArrayList.size() - 1; i > 0; i--) {
            operationsCount++;
            for (int j = 0; j < i; j++) {
                operationsCount++;
                if (less(myArrayList.get(j + 1), myArrayList.get(j))) {
                    operationsCount++;
                    swap(j + 1, j);
                }
            }
        }
        return operationsCount;
    }

    public int bubbleSortOptimized() { // метод оптимизированной пузырьковой сортировки с прерыванием
        boolean isSwap;
        int operationsCount = 0;
        for (int i = myArrayList.size() - 1; i > 0; i--) {
            operationsCount++;
            isSwap = false;
            for (int j = 0; j < i; j++) {
                operationsCount++;
                if (less(myArrayList.get(j + 1), myArrayList.get(j))) {
                    operationsCount++;
                    swap(j + 1, j);
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
        return operationsCount;
    }
}
