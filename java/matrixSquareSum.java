
public class Solution {
	
	public static void PrintAllSumKxK(int[][] mat, int n, int k) {
		/*Your class should be named solution. 
		*Don't write main(). 
		*Don't take input, it is passed as function argument.
		*Print output as specified in question.
		*/ 
        int l=n-k+1;
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                System.out.print(check(mat,j,j+k,i,i+k)+" ");
            }
            System.out.println();
        }
	}
    public static int check(int[][] mat,int j1,int j2,int i1,int i2){
        int sum=0;
        for(int i=i1;i<i2;i++){
            for(int j=j1;j<j2;j++){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
	
}
