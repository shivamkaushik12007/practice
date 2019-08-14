#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}

	int res[32];
	for(int j=0;j<32;j++){
			int sum=0;
		for(int i=0;i<n;i++){
			int n1=arr[i];
			sum+=(arr[i]>>j)&1;
		}	
		sum=sum%3;
		res[j]=sum;
	}
	int r=0;
	int s=1;
	for(int j=0;j<32;j++){
		r=r+(res[j]*s);
		s=s*2;
	}
	cout<<r;
}
