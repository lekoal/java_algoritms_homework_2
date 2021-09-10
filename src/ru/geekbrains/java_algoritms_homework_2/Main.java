package ru.geekbrains.java_algoritms_homework_2;

/*
 * Леонид Кононов
 * Алгоритмы и структуры данных на Java
 * Практическое задание к лекции № 2
 * Согласно заданию, в программе реализовано:
 * создание массива большого размера (100000 элементов);
 * массив заполен случайными числами;
 * реализована возможность измерения скорости выполнения каждой сортировки;
 * создан метод увеличения массива (в 1.5 + 1 раз) и метод checkSize, выводящий в консоль текущий размер массива;
 * добавлены проверки check index.
 */

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(100000); // Создание массива
//        myArrayList.print(); // Вывод массива в консоль
//        myArrayList.add(9, 55); // Добавление элемента по индексу
//        myArrayList.print();
//        myArrayList.add(16); // Добавление элемента в конец массива
//        myArrayList.print();
//        myArrayList.deleteIndex(10); // Удаление элемента по индексу
//        myArrayList.print();
//        myArrayList.deleteAllValue(314); // Удаление всех заданных элементов в массиве
//        myArrayList.print();
//        myArrayList.deleteValue(16); // Удаление элемента по значению
//        myArrayList.print();
//        System.out.println(myArrayList.searchByIndex(4)); // Поиск элемента по индексу
//        System.out.println(myArrayList.searchByValue(55));
        System.out.println("Selection sort operations count: " + myArrayList.selectionSort());
//        myArrayList.print();
        System.out.println();
        System.out.println("New array");
        MyArrayList myArrayList2 = new MyArrayList(100000);
//        myArrayList2.print();
        System.out.println("Insertion sort operations count: " + myArrayList2.insertionSort()); // Запуск сортировки с подсчётом времени выполнения
//        myArrayList2.print();
        System.out.println();
        System.out.println("New array");
        MyArrayList myArrayList3 = new MyArrayList(100000);
//        myArrayList3.print();
        System.out.println("Bubble sort operations count: " + myArrayList3.bubbleSort());
//        myArrayList3.print();
        System.out.println();
        System.out.println("New array");
        MyArrayList myArrayList4 = new MyArrayList(100000);
//        myArrayList4.print();
//        myArrayList4.add(5, 233);
        System.out.println("Bubble sort optimized operations count: " + myArrayList4.bubbleSortOptimized());
//        myArrayList4.print();
//        System.out.println(myArrayList4.binarySearch(233));
//        myArrayList4.checkSize();
//        myArrayList4.enlargeArray();
//        myArrayList4.checkSize();
    }
}
