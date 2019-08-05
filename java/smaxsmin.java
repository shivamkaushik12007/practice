package com.kaushik;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here

        int n=scanner.nextInt();
        int arr[]=new int[n];
        int a=0,b=0;

        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int max=arr[0],smax=arr[0],min=arr[0],smin=arr[0];
        int c=0,m=0;
        for(int i=0;i<n;i++){
            if(max>arr[i]&&c==0){
                smax=arr[i];
            }
            if(min<arr[i]&&m==0){
                smin=arr[i];
            }

            if(max<arr[i]){
                smax=max;
                max=arr[i];

            }
            if(max>arr[i]&&smax<arr[i]){
                smax=arr[i];
            }
            if(min>arr[i]){
                smin=min;
                min=arr[i];

            }
          //  System.out.println(smin);
            if(min<arr[i]&&smin>arr[i]){

                smin=arr[i];

            }
           // System.out.println(smin);
            c++;
            m++;
        }

        for(int i=0;i<n;i++){
            if(arr[i]==smax){
                a=i;
                // arr[i]=smin;
                //System.out.println(arr[i]+" "+i);
            }
            if(arr[i]==smin){
                b=i;
                //arr[i]=smax;
            }
            if(min<arr[i]&&smin>arr[i]){
                smin=arr[i];
            }
        }
        arr[a]=smin;
        arr[b]=smax;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        //System.out.println(smax);
        //System.out.println(smin);

    }
}
