import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(first(n) + " ");
        System.out.print(second(n) + " ");
        System.out.print(third(n) + " ");
        System.out.print(fourth(n) + " ");
        System.out.print(fifth(n) + " ");
        System.out.print(sixth(n) + " ");
        System.out.print(seventh(n) + " ");
        System.out.print(eigth(n) + " ");
        System.out.print(ninth(n) + " ");
        System.out.print(tenth(n) + " ");

    }

    public static double first(int n){
        return Math.pow(1.5, n);
    }

    public static double second(int n){
        return Math.pow(n, 3);
    }

    public static double third(int n){
        return Math.pow(2, Math.pow(2, n));
    }

    public static double fourth(int n){
        return n * Math.pow(2, n);
    }

    public static double fifth(int n){
        return Math.pow((Math.log(n)/Math.log(2)), 2);
    }

    public static double sixth(int n){
        int s = 1;
        for (int i = 1; i <= n ; i++) {

            s = s * n;

        }
        return Math.log(s)/Math.log(2);
    }

    public static double seventh(int n){
        return Math.log(n)/Math.log(2);
    }

    public static double eigth(int n){
        return Math.pow(2, (Math.log(n)/Math.log(2)));
    }

    public static double ninth(int n){
        return Math.pow(Math.log(n)/Math.log(2), Math.log(n)/Math.log(2));
    }

    public static double tenth(int n){
        return Math.pow(2.718, n);
    }
}
