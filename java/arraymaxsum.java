package com.kaushik;
import java.util.Scanner;
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        int n=scanner.nextInt();

        int arr[]=new int[n];
        int m=scanner.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int j=0;j<m;j++) {
            int max = arr[0];
            for (int i = 0; i < n; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            for (int i = 0; i < n; i++) {

                arr[i] = (max+arr[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}