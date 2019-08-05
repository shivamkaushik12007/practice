package com.kaushik;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here

        int n=scanner.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        int crr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int k=0,j=0,m,l,p;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                brr[k]=arr[i];
                k++;
            }else if(arr[i]<0){
                crr[j]=arr[i];
                j++;
            }
        }
        m=k;
        l=j;
        if(m>l){
            p=2*l;
        }else{
            p=2*m;
        }
        k=0;
        j=0;
        for(int i=0;i<n;i++){
            if(i<p) {


                if (i % 2 == 0) {
                    arr[i] = brr[k];
                    k++;
                } else if (i % 2 != 0) {
                    arr[i] = crr[j];
                    j++;
                }
            }else if(i>=p){
                if(m>l){
                    arr[i]=brr[k];
                    k++;
                }else{
                    arr[i]=crr[j];
                    j++;
                }

            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
