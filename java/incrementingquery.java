package com.kaushik;
import java.util.Scanner;
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int arr[][]=new int[n][n];
        int brr;
        int crr;
        String srr;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        for(int k=0;k<m;k++){
            srr=scanner.next();
            brr=scanner.nextInt();
            crr=scanner.nextInt();

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(srr.equals("row")){
                        if(i==(brr-1)){
                            arr[i][j]+=crr;
                        }
                    }else if(srr.equals("col")){
                        if(j==(brr-1)){
                            arr[i][j]+=crr;
                        }
                    }else{
                        System.out.println("invalid option");
                    }
                }
            }

            for(int l=0;l<n;l++){
                for(int x=0;x<n;x++){
                    System.out.print(arr[l][x]+" ");
                }
                System.out.println();
            }

        }

    }
}