package org.example;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(10);

        MyLinkedList list= new MyLinkedList();
        list.addToList(4);
        list.addToList(5);
        list.addToList(7);
        list.addToList(8);
        System.out.print("\r\nMy linked list:");
        list.printList();

        list.addAtPosition(6, 2);
        System.out.print("\r\nAdded at position 2:");
        list.printList();

        list.deleteAtPosition(2);

        System.out.print("\r\nDeleted at position 2:");
        list.printList();

        int x = list.getAtPosition(2);
        System.out.print("\r\nMy linked list get method at position 2");
        System.out.print("\n" + x);

        System.out.print("\r\nMy linked list:");
        list.printList();

        System.out.print("\r\n\r\nBubble sort:");
        int[] array = {45,23,11,89,77,98,4,28,65,43};
        System.out.println("\r\nArray before Bubble sort");
        for(int i:array){
            System.out.print(i);
            System.out.print(" ");
        }
        BubbleSort bSort = new BubbleSort();
        bSort.bubbleSortSimple(array);
        System.out.println("\r\nArray after simple Bubble sort");
        for(int i:array){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.print("\r\n\r\nBubble sort:");
        int[] array2 = {45,23,11,89,77,98,4,28,65,43};
        System.out.println("\r\nArray before Bubble sort");
        for(int i:array2){
            System.out.print(i);
            System.out.print(" ");
        }
        bSort.bubbleSortEnhanced(array2);
        System.out.println("\r\nArray after enhanced Bubble sort");
        for(int i:array2){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.print("\r\n\r\nMerge sort:");
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        System.out.println("\r\nArray before Merge sort");
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
        MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        System.out.println("\r\nArray after merge sort");
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }

        MyArrayList list2 = new MyArrayList();
        list2.add(9);
        list2.add(8);
        list2.add(7);
        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        list2.add(0);
        list2.add(11);
        list2.add(12);
        list2.add(9);
        list2.add(8);
        list2.add(7);
        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        list2.add(0);

        System.out.print("\r\n\r\nMy array list:");
        list2.printArray(list2);

        list2.addAtPosition(99, 13);

        System.out.print("\r\nMy array list, added at position 13:");
        list2.printArray(list2);

        list2.deleteAtPosition(21);
        System.out.print("\r\nMy array list, deleted position 21:");
        list2.printArray(list2);

        int y = list2.get(10);
        System.out.println("\r\nArray list get method, element at position 10 is " + y);

        int[] array3 = {1,2,3,4,5,6,7,8,9,10};
        MyBinaryTree tree = new MyBinaryTree();
        tree.insertMultiple(array3, 0,tree);
        tree.printBinaryTree(" ", tree);
        //tree.print2D(tree);
    }


}