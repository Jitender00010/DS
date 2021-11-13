package com.ds.practice_project.array;

public class ReverseArrayInGroup {

    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};  //3    3 2 1 5 4
        // 10 20 30 40 50 60 70 80 2    20 10 40 30 60 50 80 70

        reverseAry(ar,ar.length,3);

        printar(ar);
    }

    private static void printar(int[] ar) {
        for (int i : ar){
            System.out.print(i+" ");
        }
    }

    private static void reverseAry(int[] arr,int n, int k) {
        /*int start=0,end=0;
        for (int i= pos ; i <= ar.length; i = i+pos){
            end = i-1;
            subAryRev(ar,start,end);
            start = end+1;
        }*/

        for (int i = 0; i < n; i += k)
        {
            int left = i;

            // to handle case when k is not multiple
            // of n
            int right = Math.min(i + k - 1, n - 1);
            int temp;

            // reverse the sub-array [left, right]
            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }
        }
    }

    private static void subAryRev(int[] ar, int start, int end) {
        for (int i=start , j = end; end>i && j >= 0; i++,j--){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }
}
