import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
     Scanner scanner=new Scanner(System.in);
     int n=scanner.nextInt();
     int h=scanner.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=scanner.nextInt();
     }
     int i=0;
     int p=0;
     int h1;
     while(i>=0){
         p+=arr[i%n];
         i++;
         h1=h-((i*(i+1))/2);
         if(p>=h1)
            break;
     }
     System.out.println(i);
    }
}
