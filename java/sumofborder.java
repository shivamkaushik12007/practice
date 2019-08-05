package com.kaushik;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==n-1||i==n-1||j==0){
                    a=a+arr[i][j];
                }
            }
        }
        System.out.println(a);


    }
}
