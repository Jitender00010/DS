package com.ds.practice_project.array;

public class Spirally {

    public static void main(String[] args) {
        int[][] ar = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int row = 3,coloum = 3;
        spirallyPrint(ar,row,coloum);
    }

    private static void spirallyPrint(int[][] ar, int row, int coloum) {
        int t = 0,b = row , l = 0, r = coloum, dir = 0;
        while (t <= b && l <= r){
            if (dir == 0){
                for (int i=l; i <= r; i++){
                    System.out.print(ar[t][i]+" ");
                }
                t++;
                dir = 1;
            }else if (dir == 1){
                for (int i = t; i <= b; i++ ){
                    System.out.print(ar[i][r]+" ");
                }
                r--;
                dir = 2;
            }else if (dir == 2){
                for (int i = r; i >= l; i-- ){
                    System.out.print(ar[b][i]+" ");
                }
                b--;
                dir = 3;
            }else if (dir == 3){
                for (int i = b; i >= t; i-- ){
                    System.out.print(ar[i][l]+" ");
                }
                l++;
                dir = 0;
            }
        }
    }
}
