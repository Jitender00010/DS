package com.ds.practice_project.recursion;

public class LCMExample {

    private static void LCM(int firstNo){

        int no = firstNo;
        String str = "";

        for (int i=2 ; i <= no;) {
            if (no % i == 0) {
                no = no / i;
                str = str + i +" x ";
            } else {
                i++;
            }
        }

       System.out.println("LCM "+firstNo+" = "+str);

    }

    private static String LCM2(int firstNo, int i, String res){
        if (firstNo == 1 || firstNo == 0)
            return res;

        int no = firstNo;
        if (firstNo % i == 0) {
            no = firstNo / i;

            res = res + i+ " ";

            LCM2(no,i,res);
        }else{
            i++;
        }

       return LCM2(no,i,res);
    }

    public static int findLCM (int a, int b) {
        if (a % b == 0)
            return a;
        else
            return findLCM(a + a, b);
    }


    public static void main(String ag[]){

        int dd = 7 /2;

      //  System.out.println("LCM "+fun(4));

      //  get(20);
      //  fun1(2,2);
      //  System.out.println("LCM "+fun1(2,2));
       // System.out.println("LCM "+LCM2(8,2,""));


        try {
            int[] myNumbers = {1, 2, 3};
           // int c = 0 /10;
            System.out.println(myNumbers[10]);
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }

   static int fact(int n)
    {
        if (n <= 1) // base case
            return 1;
        else
            return n*fact(n-1);
    }

    static int factTR(int n, int a)
    {
        if (n == 0)
            return a;

        return factTR(n - 1, n * a);
    }


    static void fun1(int x, int y)
    {
        if(x == 0)
            return ;
        else {

            System.out.println("val "+y);
             fun1(x - 1, x + y);
            System.out.println("val:: "+y);
        }
    }

    static void funVal(int x)
    {
        if(x > 0)
        {
            funVal(--x);
            System.out.println("val   "+ x);
            funVal(--x);
        }
    }

    static int fun2(int i)
    {
        if ( i%2 == 0 )
            return (i++);
        else
            return fun2(fun2( i - 1 ));
    }

    /*static int fun(int a, int b)
    {
        System.out.println(a+"   "+b);
        if (b == 0)
            return 1;
        if (b % 2 == 0)
            return fun(a*a, b/2);

        return fun(a+a, b/2) * a;
    }*/

    static int fun11(int n)
    {
        if (n > 100)
            return n - 10;
        return fun11(fun11(n+11));
    }

    static int funT(int count)
    {
        System.out.print(" "+ count);
        if(count < 3)
        {
            int f1 = funT(++count);

            int f2 = funT(f1);

            funT(f2);
        }
        return count;
    }

   static int fun(int n)
    {
        if(n <= 1)
            return 1;

        if(n%2 == 0)
            return fun(n/2);
        return fun(n/2) + fun(n/2+1);

    }

    static int d = 1;
    static void get (int n)
    {
        if (n <=1)  {
            System.out.print(" "+ n);
        }
        else {
            System.out.print(" "+ n%2);
            get (n/2);

        }

    }
}
