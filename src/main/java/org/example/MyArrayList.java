package org.example;

public class MyArrayList {
    private int size =10;
    Integer myArray[] = new Integer[this.size];

    MyArrayList (){
        this.size = 10;
        this.myArray = new Integer[this.size];
    }

    MyArrayList (int value){
        this.size = 10;
        this.myArray = new Integer[this.size];
        this.myArray[0] = value;
    }

    MyArrayList (Integer[] arrayList, int size){
        this.size = size;
        this.myArray = arrayList;
    }

    private Integer[] expandArraylist(Integer[] arrayList){
        // This method increases array's size
        this.size = size + 10;
        Integer[] arrayList2 = new Integer[this.size];
        for(int i=0; i<arrayList.length; i++)  arrayList2[i] = arrayList[i];
        return arrayList2;
    }

    private Integer[] insertInPos(Integer[] arrayList, int pos, Integer value){
        // This method inserts value in array and moves all the rest values of the array 1 position further
        Integer[] arrayList2 = new Integer[this.size];
        for(int i=0; i<pos; i++)  arrayList2[i] = arrayList[i];
        for(int i=pos+1; i<arrayList.length; i++)  arrayList2[i] = arrayList[i-1];
        arrayList2[pos] = value;
        return arrayList2;
    }

    private static Integer[] deletePos(Integer[] arrayList, int pos){
        // This method deletes element from certain position
        for(int i=pos; i<arrayList.length-1; i++)  arrayList[i] = arrayList[i+1];
        arrayList[arrayList.length-1] = null;
        return arrayList;
    }

    private static int getLastPosition(Integer[] array){
        // This method gets the position of the last filled cell in array
        int i=0;
        while (array[i]!=null){
            i++;
            if (array.length<=i) break;
        }
        return i;
    }

    MyArrayList add(int value){
        if (this.myArray==null) {
            return new MyArrayList(value);
        }
        int i=getLastPosition(this.myArray);

        if (i>=this.myArray.length) {
            this.myArray = expandArraylist(this.myArray);
            this.myArray[i] = value;
            return new MyArrayList(this.myArray, this.size + 10);
        }
        this.myArray[i] = value;
        return new MyArrayList(this.myArray, this.size);
    }

    static void printArray(MyArrayList arrayList){
        System.out.println("");
        for (int i=0; i<arrayList.myArray.length; i++){
            if (arrayList.myArray[i]==null) break;
            System.out.print(arrayList.myArray[i] + " -> ");
        }
    }

    MyArrayList addAtPosition(int value, int pos){
        if (this.myArray==null) {
            return new MyArrayList(value);
        }
        int i=getLastPosition(this.myArray);
        if (pos<=i && this.myArray.length>i+1){
            this.myArray = insertInPos(this.myArray, pos, value);
            return new MyArrayList(this.myArray, this.size);
        }
        else if (pos== i || this.myArray.length<=i+1) {
            this.myArray = expandArraylist(this.myArray);
            this.myArray = insertInPos(this.myArray, pos, value);
            return new MyArrayList(this.myArray, this.size + 10);
        }
        else{
            return new MyArrayList(this.myArray, this.size);
        }
    }

    MyArrayList deleteAtPosition(int pos){
        if (this.myArray==null) {
            return null;
        }
        int i=getLastPosition(this.myArray);
        if (pos<i) deletePos(this.myArray, pos);
        // This method could be improved to decrease array's size, if applicable
        return new MyArrayList(this.myArray, this.size);
    }

    Integer get(int pos){
        if (this.myArray==null) {
            return null;
        }
        int i=getLastPosition(this.myArray);
        if (pos<i) return this.myArray[pos];
        return null;
    }
}
