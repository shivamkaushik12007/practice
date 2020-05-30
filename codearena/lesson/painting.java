import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int x=scanner.nextInt();
            int k=x;
            int y=scanner.nextInt();
            k=k<y?k:y;
            int z=scanner.nextInt();
            k=k<z?k:z;
            x-=k;
            y-=k;
            z-=k;
            int k1=(int)Math.floor(x/3);
            int k2=(int)Math.floor(y/3);
            int k3=(int)Math.floor(z/3);
            int l=0;
            int l1=(int)Math.floor(x/3);
            x=x%3;
            l=x;
            int l2=(int)Math.floor(y/3);
            y=y%3;
            l=l<y?l:y;
            int l3=(int)Math.floor(z/3);
            z=z%3;
            l=l<z?l:z;
            k=k+k1+k2+k3;
            l=l+l1+l2+l3;
            System.out.println(k>l?k:l);
        }
    }
}
