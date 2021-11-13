package com.ds.practice_project.array;

public class FindIndexLast1 {

    public static void main(String[] args) {

        //int ar[] = {0, 0,0,0,1,1,1};
        //int ar[] = {1,1,1,0,0,0,0};
        //Output : 6
        String ar ="10"; //1 1 1 0 0 0 0 0 0 0
        //findLast(ar.toCharArray());

        //System.out.println(indexOfFirstOne(ar,0,ar.length-1));

        /*Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        // int[] ar = null;
        while (testCase-- > 0) {
            String input = scan.next();

            char[] ar = input.toCharArray();
            findLast(ar);
        }*/

        linearSearch(ar.toCharArray());
        }

    private static void linearSearch(char[] ar) {  //1,1,1,0,0,0,0

                                                   // 0 0 0 0 1 1 1

        int count = 0;
        if (ar[ar.length-1] == '1' )
        for (int i=0; i < ar.length; i++){
            if (ar[i] == '0'){
                count++;
            }
            else
                break;
        }else{
            /*for (int i=ar.length-1; i > 0; i--){
                if (ar[i] == '0'){
                    count++;
                }
                else
                    break;
            }*/
        }

        System.out.println(count);
    }


    public static int indexOfFirstOne(int arr[], int low,
                                      int high)
    {
        while (low <= high) {
            int mid = (low + high) / 2;

            // if true, then 'mid' is the index of first '1'
            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1]
                    == 0))
                return mid;

                // first '1' lies to the left of 'mid'
            else if (arr[mid] == 1)
                high = mid - 1;

                // first '1' lies to the right of 'mid'
            else
                low = mid + 1;
        }

        // 1's are not present in the array
        return -1;
    }
    private static void findLast(char[] ar) {

        if (ar.length == 0)
            return;

        int first = 0;
        boolean check = true;
        int last = ar.length-1;
        int count = -1;
        if (ar.length == 1 && ar[ar.length-1] == '1'){
            System.out.println("0");
            return;
        }

        if (ar[0] == '0')
        for (int i=0; i < ar.length/2; i++){

            int mid = (first+last)/2;

            if (first > last)
                return;

            if (ar[ar.length-1] != '1') {
                break;
            }

            if (ar[mid] == '0'){
                last = mid+1;
                count = mid+1 ;
                //last = ar.length;
            }else {
                first = mid;
            }
        }

        else
        for (int i=0; i < ar.length/2; i++){  //1 1 1 0

            int mid = (first+last)/2;

            if (first > last)
                return;

            if (ar[ar.length-1] != '0') {
                break;
            }

            if (ar[mid] == '0'){
                last = mid+1;
                if (check) {
                    count = mid + 1;
                    check = false;
                }else {
                    count = count + 1;
                }
                //last = ar.length;
            }else {

                first = mid;
            }
        }

        System.out.println(count);
    }
}
