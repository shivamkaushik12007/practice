import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String s1="abcdefghijklm";
        String s2="zyxwvutsrqpon";
        String st[]=str.split(" ");
        int n=st.length;
        for(int i=0;i<n;i++){
            int n1=st[i].length();
            String ch[]=st[i].split("");
            String s11="";
            s11=s11.trim();
            for(int j=0;j<n1;j++){
                if(ch[j].charAt(0)>='a'&&ch[j].charAt(0)<='m'){
                    int k=s1.indexOf(ch[j]);
                    ch[j]=Character.toString(s2.charAt(k));
                }else if(ch[j].charAt(0)>'m'&&ch[j].charAt(0)<='z'){
                    int k=s2.indexOf(ch[j]);
                    ch[j]=Character.toString(s1.charAt(k));
                }
                s11+=ch[j];
            }
            s11=s11.trim();
            st[i]=s11;
        }
        str="";
        str=str.trim();
        for(int i=0;i<n;i++){
            str=str+" "+st[i];
        }
        str=str.trim();
        System.out.println(str);
    }
}











package encryptdecrypt;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int num=scanner.nextInt();
        // String str="we found a treasure!";
        String s1="abcdefghijklmnopqrstuvwxyz";
        String st[]=str.split(" ");
        int n=st.length;
        for(int i=0;i<n;i++){
            int n1=st[i].length();
            String ch[]=st[i].split("");
            String s11="";
            s11=s11.trim();
            for(int j=0;j<n1;j++){
                if(ch[j].charAt(0)>='a'&&ch[j].charAt(0)<='z'){
                    int k=s1.indexOf(ch[j]);
                    k=k+num<26?k+num:k+num-26;
                    ch[j]=Character.toString(s1.charAt(k));
                }
                s11+=ch[j];
            }
            s11=s11.trim();
            st[i]=s11;
        }
        str="";
        str=str.trim();
        for(int i=0;i<n;i++){
            str=str+" "+st[i];
        }
        str=str.trim();
        System.out.println(str);
    }
}













package encryptdecrypt;
import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String func=scanner.nextLine();
        String str=scanner.nextLine();
        int k=scanner.nextInt();
        func=func.toLowerCase();
        if(func.equals("enc")){
            str=encrypt(str,k);
        }else if(func.equals("dec")){
            str=decrypt(str,k);
        }
        System.out.println(str);
    }
    private static String encrypt(String str,int k){
        int n=str.length();
        String res=new String("");
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asc=(int)ch+k;
            ch=(char)asc;
            res+=Character.toString(ch);
        }
        return res;
    }
    private static String decrypt(String str,int k){
        int n=str.length();
        String res=new String("");
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asc=(int)ch-k;
            ch=(char)asc;
            res+=Character.toString(ch);
        }
        return res;
    }
}


















package encryptdecrypt;
import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String func="enc";
        String str=ne String("");
        int k=0;
        for(int i=0;i<args.length;i++){
            if(args[i].equals("-mode")&&!args[i+1].equals(-data)&&!args[i+1].equals(-key)){
                func=args[i+1];
            }else if(args[i].equals("-data")&&!args[i+1].equals(-key)&&!args[i+1].equals(-mode)){
                str=args[i+1];
            }else if(args[i].equals("-key")&&!args[i+1].equals(-data)&&!args[i+1].equals(-mode)){
                k=Integer.parseInt(args[i+1]);
            }
        }
        if(str.equals("")){
            str=scanner.nextLine();
        }
        if(k==0) {
            k=scanner.nextInt();
        }
        func=func.toLowerCase();
        if(func.equals("enc")){
            str=encrypt(str,k);
        }else if(func.equals("dec")){
            str=decrypt(str,k);
        }
        System.out.println(str);
    }
    private static String encrypt(String str,int k){
        int n=str.length();
        String res=new String("");
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asc=(int)ch+k;
            ch=(char)asc;
            res+=Character.toString(ch);
        }
        return res;
    }
    private static String decrypt(String str,int k){
        int n=str.length();
        String res=new String("");
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asc=(int)ch-k;
            ch=(char)asc;
            res+=Character.toString(ch);
        }
        return res;
    }
}
























package encryptdecrypt;
import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String func="enc";
        String str="";
        int k=Integer.MIN_VALUE;
        for(int i=0;i<args.length;i++){
            if(i<args.length-1&&args[i].equals("-mode")&&!args[i+1].equals("-data")&&!args[i+1].equals("-key")){
                func=args[i+1];
            }else if(i<args.length-1&&args[i].equals("-data")&&!args[i+1].equals("-key")&&!args[i+1].equals("-mode")){
                str=args[i+1];
            }else if(i<args.length-1&&args[i].equals("-key")&&!args[i+1].equals("-data")&&!args[i+1].equals("-mode")){
                k=Integer.parseInt(args[i+1]);
            }
        }
        if(str.equals("")){
            str=scanner.nextLine();
        }
        if(k==Integer.MIN_VALUE) {
            k=scanner.nextInt();
        }
        func=func.toLowerCase();
        if(func.equals("enc")){
            str=encrypt(str,k);
        }else if(func.equals("dec")){
            str=decrypt(str,k);
        }
        System.out.println(str);
    }
    private static String encrypt(String str,int k){
        int n=str.length();
        String res=new String("");
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asc=(int)ch+k;
            ch=(char)asc;
            res+=Character.toString(ch);
        }
        return res;
    }
    private static String decrypt(String str,int k){
        int n=str.length();
        String res=new String("");
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asc=(int)ch-k;
            ch=(char)asc;
            res+=Character.toString(ch);
        }
        return res;
    }
}















package encryptdecrypt;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String func="enc";
        String str="";
        String out="";
        int k=Integer.MIN_VALUE;
        for(int i=0;i<args.length;i++){
            if(i<args.length-1&&args[i].equals("-mode")&&!args[i+1].equals("-out")&&!args[i+1].equals("-in")&&!args[i+1].equals("-data")&&!args[i+1].equals("-key")){
                func=args[i+1];
            }else if(i<args.length-1&&args[i].equals("-data")&&!args[i+1].equals("-out")&&!args[i+1].equals("-in")&&!args[i+1].equals("-key")&&!args[i+1].equals("-mode")){
                str=args[i+1];
            }else if(i<args.length-1&&args[i].equals("-key")&&!args[i+1].equals("-out")&&!args[i+1].equals("-in")&&!args[i+1].equals("-data")&&!args[i+1].equals("-mode")){
                k=Integer.parseInt(args[i+1]);
            }else if(i<args.length-1&&args[i].equals("-in")&&!args[i+1].equals("-out")&&!args[i+1].equals("-key")&&!args[i+1].equals("-data")&&!args[i+1].equals("-mode")){
                try{
                    File file = new File(args[i+1]);
                    Scanner sc=new Scanner(file);
                    str=sc.nextLine();
                    sc.close();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    return;
                }
            }else if(i<args.length-1&&args[i].equals("-out")&&!args[i+1].equals("-data")&&!args[i+1].equals("-in")&&!args[i+1].equals("-data")&&!args[i+1].equals("-mode")){
                out=args[i+1];
            }
        }
        if(str.equals("")){
            str=scanner.nextLine();
        }
        if(k==Integer.MIN_VALUE) {
            k=scanner.nextInt();
        }
        func=func.toLowerCase();
        if(func.equals("enc")){
            str=encrypt(str,k);
        }else if(func.equals("dec")){
            str=decrypt(str,k);
        }
        if(out.equals("")){
            System.out.println(str);
        }else{
            try {
                File file = new File(out);
                FileWriter writer = new FileWriter(file);
                writer.write(str);
                writer.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
    private static String encrypt(String str,int k){
        int n=str.length();
        String res=new String("");
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asc=(int)ch+k;
            ch=(char)asc;
            res+=Character.toString(ch);
        }
        return res;
    }
    private static String decrypt(String str,int k){
        int n=str.length();
        String res=new String("");
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asc=(int)ch-k;
            ch=(char)asc;
            res+=Character.toString(ch);
        }
        return res;
    }
}
