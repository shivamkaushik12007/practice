package com.kaushik;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here

        int n=scanner.nextInt();
        System.out.println("Enter the kth value");
        int k=scanner.nextInt();
        int arr[]=new int[n];
        int kmax=0,kmin=0;
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        kmax=arr[n-k];
        kmin=arr[k-1];
        System.out.println(kmax);
        System.out.println(kmin);

    }
}
