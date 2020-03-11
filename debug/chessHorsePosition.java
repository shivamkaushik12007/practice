
// You all must be familiar with the chess-board having  squares of alternate black and white cells. Well, here we have for you a similar  size board with similar arrangement of black and white cells.

// A few of these cells have Horses placed over them. Each horse is unique. Now these horses are not the usual horses which could jump to any of the 8 positions they usually jump in. They can move only if there is another horse on one of the 8-positions that it can go to usually and then both the horses will swap their positions. This swapping can happen infinitely times.

// A photographer was assigned to take a picture of all the different ways that the horses occupy the board! Given the state of the board, calculate answer. Since this answer may be quite large, calculate in modulo 97.

// Input:
// First line contains T which is the number of test cases.
// T test cases follow first line of each containing three integers N, M and Q where  is the size of the board and Q is the number of horses on it.

// Q lines follow each containing the 2 integers X and Y which are the coordinates of the Horses.

// Output:
// For each test case, output the number of photographs taken by photographer.

// Constraints:
// 1 ≤ T ≤ 
// 1 ≤  ≤ 3
// 1 ≤ Q ≤ 
// Scoring:
// 1 ≤ T ≤  ≤  ≤ : (20 pts)
// 1 ≤ T ≤  ≤  ≤ : (30 pts)
// Original Constraints : (50 pts)
// SAMPLE INPUT 
// 2
// 4 4 4
// 1 1
// 1 2
// 3 1
// 3 2
// 4 4 4
// 1 1
// 1 2
// 3 1
// 4 4

// SAMPLE OUTPUT 
// 4
// 2
// Explanation
// Case 1: In this case we have Horse 1 and Horse 4 can interchange. Same for Horse 2 and Horse 3. Thus we have 4 ways.
// Case 2: In this case we have Horse 2 and Horse 3 can interchange. Rest cannot.
import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int m=s.nextInt();
            int q=s.nextInt();
            int[][] arr=new int[n][m];
            int[][] brr=new int[q][2];
            for(int i=0;i<q;i++){
                int x=s.nextInt();
                int y=s.nextInt();
                x--;
                y--;
                arr[x][y]=1;
                brr[i][0]=x;
                brr[i][1]=y;
            }
            int cnt=0;
            for(int i=0;i<q;i++){
                int t1=brr[i][0]+2,v1=brr[i][1]+1;
                int t2=t1,v2=v1-2;
                int t3=brr[i][0]+1,v3=brr[i][1]+2;
                int t4=t3-2,v4=v3;
                if(t1>=0&&t1<n&&v1>=0&&v1<m&&arr[t1][v1]==1){
                    cnt+=2;
                }
                if(t2>=0&&t2<n&&v2>=0&&v2<m&&arr[t2][v2]==1){
                    cnt+=2;
                }
                if(t3>=0&&t3<n&&v3>=0&&v3<m&&arr[t3][v3]==1){
                    cnt+=2;
                }
                if(t4>=0&&t4<n&&v4>=0&&v4<m&&arr[t4][v4]==1){
                    cnt+=2;
                }
            }
            // int res=(int)Math.pow(2,cnt);
            System.out.println(cnt);
            
        }
    }
}
