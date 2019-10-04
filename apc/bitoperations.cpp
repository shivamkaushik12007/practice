#include<iostream>
using namespaace std;
int main(){
	int n;
	cin>>n;
	int i;
	cin>>i;
	//to find the ith bit of number
	int k1=n^(1<<(i-1));
	
	
	//convert the ith bit to zero
	int k2=n&~(1<<(i-1));
	
	
	//swap the adjacent bits
	int x=(n>>1)&0X55555555;
	int y=(n<<1)&0XAAAAAAAA;
	int k3=x|y;
}
