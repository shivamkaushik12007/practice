package com.kaushik;

import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here
        int num=scanner.nextInt();
        int n=num;
        int count=0;
        int a=1;
        while(n!=0){
            n=n/10;
            a=a*10;
            count++;
        }
        a=a/10;
        for(int i=0;i<count;i++){
            n=countNumber(num,a);
            System.out.println(n);
            num=n;
        }
    }
    static int countNumber(int n,int a){
        int num,c,b;
        c=n%10;
        b=n/10;
        num=(c*a)+b;
        return num;
    }
}

