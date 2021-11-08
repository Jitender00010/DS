package com.ds.dp;

class FabonicSeries {

    public static void main(String[] args) {

        int s = 10;
        int r = feb(s);
        int rs = febdp(s,new int[s+1]);

        System.out.println(rs);
    }

    private static int febdp(int s, int[] ints) {
        if (s == 0 || s == 1)
            return s;

        if (ints[s] != 0){
            return ints[s];
        }

        int a = feb(s - 1);
        int b = feb(s - 2);

        int re = a + b;

        ints[s] = re;
        return re;
    }

    private static int feb(int s) {
        if (s == 0 || s == 1)
            return s;

        int a = feb(s - 1);
        int b = feb(s - 2);

        int re = a + b;

        return re;
    }

}
