package com.kaushik;
import java.util.Scanner;
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int l=0,k=0;
        int arr[][]=new int[n][n];
        String cmd;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
                if(arr[i][j]==1){
                    l=i;
                    k=j;
                }
            }

        }
        for(int i=0;i<m;i++){
            cmd=scanner.next();
            if(cmd.equals("up")){
                l--;
            }else if(cmd.equals("down")){
                l++;
            }else if(cmd.equals("left")){
                k--;
            }else if(cmd.equals("right")){
                k++;
            }else{
                System.out.println("invalid input");
            }
        }
        if(l<0||l>=n||k<0||k>=n){
            System.out.println("outside the box");
        }else{
            System.out.println("inside the box");
        }


    }
}