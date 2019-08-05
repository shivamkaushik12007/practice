package com.kaushik;
import java.util.Scanner;
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int temp;
        int m=n;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    temp=arr[j];
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    arr[n-1]=temp;
                    n--;
                    count++;
                    //System.out.println("ggcsja");
                }
            }
        }
      //  System.out.println(count);
        for(int i=0;i<(m-count);i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(m-count);


    }
}