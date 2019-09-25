#include<iostream>
using namespace std;
int GCD(int x,int y){
	if(x==0)
		return y;
	else
		return GCD(y%x,x);
}

int main(){
	int x,y;
	cin>>x;
	cin>>y;
	int res=GCD(x,y);
	cout<<res;
}
