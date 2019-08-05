package com.kaushik;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here

        int n=scanner.nextInt();
        int m=(n/2)+1;
        int arr[]=new int[n];
        int brr[]=new int[m];
        int crr[]=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int k=0,j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                brr[k]=arr[i];
                k++;
            }else if(arr[i]<0){
                crr[j]=arr[i];
                j++;
            }
        }
        k=0;
        j=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=brr[k];
                k++;
            }else if(i%2!=0){
                arr[i]=crr[j];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
