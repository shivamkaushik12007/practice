public class Solution {
	public long reverse(long a) {
	    long m=0;
	    for(int i=31;i>=0;i--){
	        long k=a%2;
	        a=a/2;
	        if(k==1)
	            m+=Math.pow(2,i);
	    }
	    return m;
	}
}
