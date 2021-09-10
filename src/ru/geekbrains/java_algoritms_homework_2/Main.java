package ru.geekbrains.java_algoritms_homework_2;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.print();
        myArrayList.add(9, 55);
        myArrayList.print();
        myArrayList.add(16);
        myArrayList.print();
        myArrayList.deleteIndex(10);
        myArrayList.print();
        myArrayList.deleteAllValue(314);
        myArrayList.print();
        myArrayList.deleteValue(16);
        myArrayList.print();
        System.out.println(myArrayList.searchByIndex(4));
        System.out.println(myArrayList.searchByValue(55));
        System.out.println("Selection sort operations count: " + myArrayList.selectionSort());
        myArrayList.print();
        System.out.println();
        System.out.println("New array");
        MyArrayList myArrayList2 = new MyArrayList(10);
        myArrayList2.print();
        System.out.println("Insertion sort operations count: " + myArrayList2.insertionSort());
        myArrayList2.print();
        System.out.println();
        System.out.println("New array");
        MyArrayList myArrayList3 = new MyArrayList(10);
        myArrayList3.print();
        System.out.println("Bubble sort operations count: " + myArrayList3.bubbleSort());
        myArrayList3.print();
        System.out.println();
        System.out.println("New array");
        MyArrayList myArrayList4 = new MyArrayList(22);
        myArrayList4.print();
        myArrayList4.add(5, 233);
        System.out.println("Bubble sort optimized operations count: " + myArrayList4.bubbleSortOptimized());
        myArrayList4.print();
        System.out.println(myArrayList4.binarySearch(233));
        myArrayList4.checkSize();
        myArrayList4.enlargeArray();
        myArrayList4.checkSize();
    }
}
