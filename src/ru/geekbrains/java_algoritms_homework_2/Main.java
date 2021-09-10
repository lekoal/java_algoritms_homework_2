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

    }
}
