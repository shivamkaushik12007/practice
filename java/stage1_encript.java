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