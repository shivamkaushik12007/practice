package com.kaushik;
import java.util.Scanner;
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+(max-arr[i]);
        }
        if(sum<=m){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}