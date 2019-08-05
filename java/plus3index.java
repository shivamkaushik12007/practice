package com.kaushik;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        int n=scanner.nextInt();
        int arr[]=new int[n];
        int brr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int k=0;
        for(int i=0;i<n;i++){

            if(i>=n-3){
                brr[k]=arr[i];
                k++;
            }else {
                brr[i+3]=arr[i];
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }

    }
}
