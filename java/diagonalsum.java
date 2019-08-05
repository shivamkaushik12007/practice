package com.kaushik;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        int n=scanner.nextInt();
        int arr[][]=new int[n][n];
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            sum+=arr[i][i];
        }
        System.out.println(sum);

    }
}
