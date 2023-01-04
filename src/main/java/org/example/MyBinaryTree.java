package org.example;

public class MyBinaryTree {

    private MyBinaryTree right;
    private MyBinaryTree left;
    private int data;

    private MyBinaryTree node;

    MyBinaryTree(){

    }

    MyBinaryTree(int data){
        this.right = null;
        this.left = null;
        this.data = data;
    }

    MyBinaryTree insertMultiple(int[] array, int pos, MyBinaryTree node){
        if (node == null) {
            this.node = new MyBinaryTree();
            node = this.node;
        }
        MyBinaryTree last = node;
        if (pos<array.length){
            last.data = array[pos];
            if((pos+1)%2==1) last = last.right;
            else last = last.left;
            insertMultiple(array, pos+1, last);
            return this.node;
        }
        else return this.node;
    }

    void insertOne(int value, MyBinaryTree node){
        node.data = value;
        if (node.right==null) node = node.right;
        else node = node.left;
    }

    void printBinaryTree(String str, MyBinaryTree node){
        if (node == null) {
            return;
        }
        MyBinaryTree last = node;
        if (last.right!=null) printBinaryTree(str + "    ", last.right);

        System.out.println(str + "/");
        System.out.println(str + last.data);
        System.out.println(str + "\\");
        if (node.left!=null) printBinaryTree(str + "    ", node.left);

        System.out.println(str + last.data);
    }

    static void print2DUtil(MyBinaryTree root, int space)
    {
        // Base case
        if (root == null)
            return;


        print2DUtil(root.right, space);

        System.out.print("\n");
        System.out.print(root.data + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    static void print2D(MyBinaryTree root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
}
