// Today Oz is playing with his game-board. He has N coins of type-1 and M coins of type-2. Also the game-board has N squares of type-1 and M squares of type-2. In this game Oz must place one coin into each square. After placing all coins Oz will get a score based on his coin placement strategy .

// His score calculation is like this : If type-1 square contains a type-1 coin then he will get A points, if type-2 square contains a type-2 coin then he will get B points and in all other cases, he will get C points. Oz's total game score will be sum of scores of all squares. Help Oz to earn maximum game points with his game-board.

// Input :

// The first line contains the number of test cases T .

// Each test case consists of five space separated integers -  and C.

// Output :

// For each test case output maximum game points that Oz can earn.

// Constraints :


// 9

// 4 4

// SAMPLE INPUT 
// 2
// 3 4 500 800 600
// 1 5 10 -20 -30
// SAMPLE OUTPUT 
// 4700
// -90
// Explanation
import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int res=0;
            if(n<1&&n>1000000000||m<1&&m>1000000000)
                continue;
            if(a+b>=2*c){
                res+=n*a;
                res+=m*b;
            }else{
                int k=n<m?n:m;
                res+=k*res*2;
                res+=(n-k)*a;
                res+=(m-k)*b;
            }
            if(res>=-10000&&res<=10000)
                System.out.println(res);
            // else
            //     System.out.println(-1);
        }
    }
}
