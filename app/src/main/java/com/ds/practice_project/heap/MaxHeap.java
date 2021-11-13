package com.ds.practice_project.heap;

// Java program to implement Max Heap
public class MaxHeap { 
	private int[] Heap; 
	private int size; 
	private int maxsize; 

	// Constructor to initialize an 
	// empty max heap with given maximum 
	// capacity. 
	public MaxHeap(int maxsize) 
	{ 
		this.maxsize = maxsize; 
		this.size = 0; 
		Heap = new int[this.maxsize + 1]; 
		Heap[0] = Integer.MAX_VALUE;
	} 

	// Returns position of parent 
	private int parent(int pos) 
	{ 
		return pos / 2; 
	} 

	// Below two functions return left and 
	// right children. 
	private int leftChild(int pos) 
	{ 
		return (2 * pos); 
	} 
	private int rightChild(int pos) 
	{ 
		return (2 * pos) + 1; 
	} 

	// Returns true of given node is leaf 
	private boolean isLeaf(int pos) 
	{ 
		if (pos >= (size / 2) && pos <= size) { 
			return true; 
		} 
		return false; 
	} 

	private void swap(int fpos, int spos) 
	{ 
		int tmp; 
		tmp = Heap[fpos]; 
		Heap[fpos] = Heap[spos]; 
		Heap[spos] = tmp; 
	} 

	// A recursive function to max heapify the given 
	// subtree. This function assumes that the left and 
	// right subtrees are already heapified, we only need 
	// to fix the root. 
	private void maxHeapify(int pos) 
	{ 
		if (isLeaf(pos)) 
			return; 

		if (Heap[pos] < Heap[leftChild(pos)] || 
			Heap[pos] < Heap[rightChild(pos)]) { 

			if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) { 
				swap(pos, leftChild(pos)); 
				maxHeapify(leftChild(pos)); 
			} 
			else { 
				swap(pos, rightChild(pos)); 
				maxHeapify(rightChild(pos)); 
			} 
		} 
	} 

	// Inserts a new element to max heap 
	public void insert(int element) 
	{ 
		Heap[++size] = element; 

		// Traverse up and fix violated property 
		int current = size; 
		while (Heap[current] > Heap[parent(current)]) { 
			swap(current, parent(current)); 
			current = parent(current); 
		} 
	} 

	public void print() 
	{ 
		for (int i = 1; i <= size / 2; i++) { 
			System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " +
					Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]); 
			System.out.println();
		} 
	} 

	// Remove an element from max heap 
	public int extractMax() 
	{
		int popped = Heap[1];
		//Heap[1] = Heap[size--];
		//maxHeapify(1);

		int k = size;
		for (int i = 1; i < size; i++){
            int popped1 = Heap[i];
            Heap[i] = Heap[k--];
            maxHeapify(i);
            System.out.print("  "+popped1);

        }

		return popped;
	} 

	public static void main(String[] arg)
	{ 
		System.out.println("The Max Heap is ");
		MaxHeap maxHeap = new MaxHeap(15); 
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
		//System.out.println("The max val is " + maxHeap.Heap[1]);
		//System.out.println("The max val is " + maxHeap.extractMax());

		int[] ar = {5,4,1,2,3};

		heapSort(ar);
		printArray(ar);
	}

	public static void heapSort(int[] ar){

	    for (int i= (ar.length/2) - 1 ; i >= 0; i--)
	        hepify(ar,i,ar.length);

	    for (int i=ar.length-1; i >=0; i--){

	        int temp = ar[0];
	        ar[0] = ar[i];
	        ar[i] = temp;
	        hepify(ar, 0,i);
        }
    }

	public static void hepify(int[] ar, int l, int length){
	    int current = l;

	    int left = (2*l)+1;
	    int right = (2*l)+2;

	    if (left < length && ar[left] > ar[current]){
	        current = left;
        }
	    if (right < length && ar[right] > ar[current]){
	        current = right;
        }

	    if (current != l){
	        int temp = ar[current];
	        ar[current] = ar[l];
	        ar[l] = temp;

            hepify(ar,current, length);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

} 
