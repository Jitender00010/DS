package com.ds.practice_project.heap;

public class MinHeap {

    int size  = 0;
    public int[] heap = null;
    int current = 0;

    MinHeap(int size){
        heap = new int[size];
        this.size = 0;
        heap[0] = Integer.MAX_VALUE;
    }

    public int leftChild(int i){
        return (i*2)+1;
    }

    public int rightChild(int i){
        return (i*2)+2;
    }

    public int parent(int i) {

        int sum = (i / 2)-1;
        if (sum > 0)
            return sum;
        return 0;
    }

    public void insert(int no) {
        heap[size] = no;
        current = size;
        size++;

        while (heap[parent(current)] < heap[current]) {
            swapItem(heap, parent(current), current);
            current = parent(current);
        }
    }

    public void print1() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " +
                    heap[2 * i] + " RIGHT CHILD :" + heap[2 * i + 1]);
            System.out.println();
        }
    }

    public void print()
    {
        for (int i = 0; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " +
                    heap[2 * i+1] + " RIGHT CHILD :" + heap[2 * i +2]);
            System.out.println();
        }
    }


    private void swapItem(int[] heap, int i, int current) {
        int temp = heap[i];
        heap[i] = heap[current];
        heap[current] = temp;
    }

    public static void main(String[] arg){

        MinHeap maxHeap = new MinHeap(15);

        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();
    }
}
