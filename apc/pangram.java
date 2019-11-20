import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s="abcdefghijklmnopqrstuvwxyz";
        scanner.nextLine();
        for(int i=0;i<n;i++){
            int count=1;
            String s1=scanner.nextLine();
            for(int j=0;j<26;j++){
                if(!(s1.contains(Character.toString(s.charAt((j)))))){
                    count=0;
                    break;
                }
            }
            System.out.print(count);
        }

    }
}
