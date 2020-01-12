import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
	    System.out.println(check(0,2,n));
	}
	public static int check(int a,int b,int limit){
	    if(b>limit)
	        return 0;
	   return b+check(b,4*b+a,limit);
	} 
}
