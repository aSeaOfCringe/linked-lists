package org.example;

public class BubbleSort {

    static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void bubbleSortSimple(int[] array){
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1; j++){
                if (array[j]>array[j+1]) swap(j, j+1, array);
            }
        }
    }

    static void bubbleSortEnhanced(int[] array){
        for(int i=0; i<array.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<array.length-i-1; j++){
                if (array[j]>array[j+1]) {
                    swap(j, j+1, array);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
