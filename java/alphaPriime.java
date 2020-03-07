package com.project;
import java.util.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l=scanner.nextInt();
        int r=scanner.nextInt();
        String s1="2357";
        String s2="19";
        int cnt=0;
        for(int i=l;i<=r;i++){
            String temp=Integer.toString(i%10);
            if (s1.contains(temp)||i==1) {
                cnt++;
                System.out.println(i + "is alpha prime");
            }else if(s2.contains(temp)){
                if(check(i)==1){
                    cnt++;
                    System.out.println(i + "is alpha prime");
                }
            }
        }
        System.out.println("count of alpha primme " +cnt);
    }

    public static int prime(int k){
        if(k==1)
            return 0;
        int l=(int)Math.sqrt(k);
        for(int i=2;i<=l;i++){
            if(k%i==0){
                return 0;
            }
        }
        return 1;
    }

    public static int check(int k){
        int p=k%10;
        int l=1;
        k=k/10;
        while(k>0){
            l*=10;
            int r=k%10;
            p=r*l+p;
            k/=10;
            if(prime(p)==1){
                return 1;
            }
        }
        return 0;
    }
}
