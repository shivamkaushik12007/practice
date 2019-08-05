package com.kaushik;
import java.util.Scanner;
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        int n=scanner.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        for(int j=0;j<n;j++){
            int mount=0;
            int i=n-1;
            while(mount==0&&i>=0){
                if(arr[i][j]==1){
                    int count=0;

                    for(int k=j;k<n;k++){
                        if(arr[i][k]==1){
                            count++;
                        }
                    }
                    if(count==1){
                        System.out.println("ye sahi hai row "+(i+1)+" coloumn "+(j+1));
                    }
                    mount++;
                }
                i--;
            }
        }
    }
}