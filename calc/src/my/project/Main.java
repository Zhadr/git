package my.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstVal = scan.nextDouble();
        double secondVal = scan.nextDouble();
        double num = scan.nextDouble();
        System.out.println(divide(firstVal,secondVal));
        System.out.println(substract(firstVal,secondVal));
        System.out.println(addition(firstVal,secondVal));
        System.out.println(factorial(num));
        System.out.println(squareRoot(num));
    }

    public static double substract(double firstVal, double secondVal) {
        return firstVal-secondVal;
    }

    public static double addition(double firstVal, double secondVal) {
        return firstVal + secondVal;
    }

    public static double divide(double firstVal, double secondVal) {
        return firstVal/secondVal;
    }

    public static double multiplication(double firstVal, double secondVal) {
        return firstVal*secondVal;
    }

    public static double factorial(double num) {
        double res = 1;
        for (int i=1; i<=num; i++) {
            res *= i;
        }
        return res;
    }

    public static double squareRoot(double num)
    {
        double t;
        double sqrtroot=num/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;

    }
}
