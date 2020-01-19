import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		while(n-->0){
		    String s1=scanner.next();
		    String s2=scanner.next();
		    int cnt=0,mnt=0;
		    for(int i=0;i<s2.length();i++){
		        if(s1.contains(Character.toString(s2.charAt(i)))){
		            cnt++;
		        }else{
		            cnt=0;
		        }
		        if(cnt==s1.length()){
		            mnt++;
		        }
		    }
		    if(mnt>0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
    }
}
