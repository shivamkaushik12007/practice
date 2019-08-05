package com.kaushik;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int a=x1-x;
        int b=y1-y;
        int z=(a*a)+(b*b);
        System.out.println(java.lang.Math.sqrt(z));

    }
}
