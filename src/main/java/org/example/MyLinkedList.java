package org.example;

public class MyLinkedList {

    MyLinkedList head;
    int data;
    MyLinkedList next;

    MyLinkedList() {
    }
    MyLinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    public void addToList(int data){
        if (this.head==null) {
            this.head = new MyLinkedList(data);
        }
        else {
            MyLinkedList last = this.head;
            while (last.next!=null) {
                last=last.next;
            }
            last.next=new MyLinkedList(data);
        }
    }

    public void addAtPosition(int data, int pos){
        if (this.head==null && pos!=0) return;
        if (pos==0) {
            MyLinkedList temp = this.head;
            this.head = new MyLinkedList(data);
            this.head.next=temp;
        }
        MyLinkedList last = this.head;
        while (last.next!=null && pos-1!=0){
            last=last.next;
            pos--;
        }
        if (pos-1!=0) return;
        MyLinkedList temp = last.next;
        last.next = new MyLinkedList(data);
        last.next.next=temp;
    }

    public void deleteAtPosition(int pos){
        if (this.head==null && pos!=0) return;
        if (pos==0){
            this.head = head.next;
        }
        MyLinkedList last = this.head;
        while (pos-1!=0 && last.next!=null) {
            pos--;
            last=last.next;
        }
        if (pos-1==0)
        last.next=last.next.next;
    }

    int getAtPosition(int pos){
        if (this.head==null) return 0;
        MyLinkedList last = this.head;
        while (pos!=0 && last.next!=null) {
            pos--;
            last=last.next;
        }
        if (pos!=0) return Integer.MIN_VALUE;
        return last.data;
    }

    void printList(){
        if (this.head==null) return;
        System.out.println("");
        MyLinkedList last = this.head;
        while (last!=null){
            System.out.print(last.data + " -> ");
            last=last.next;
        }
    }
}
