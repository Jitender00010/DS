package com.ds.practice_project.tree;

public class NextRigthNode {

    public static void main(String[] arg){

        int[] ar = {10,2,6,8,4,5};

        nextRightNode(ar,4);
    }

    public static void nextRightNode(int[] ar,int no){

        int pos = 0;
        for (int i = 0 ; i < ar.length; i++){
            if (ar[i] == no){
                pos = i;
                break;
            }
        }

        if (ar[leftNode(parent(pos))] == no){

            System.out.println(ar[rightNode(parent(pos))]);
        }else {
            System.out.println("Null");
        }

    }

    public static int parent(int pos){
        int re = (pos/2) - 1;

        if (re > 0)
            return re;
        else return 0;
    }

    static int leftNode(int pos){
        return (pos * 2) + 1;
    }

    static int rightNode(int pos){
        return (pos * 2) + 2;
    }
}
