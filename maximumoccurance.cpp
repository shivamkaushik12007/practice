#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int a1[n],a2[n];
	for(int i=0;i<n;i++){
		cin>>a1[i];
	}
	int max=0;
	for(int i=0;i<n;i++){
		cin>>a2[i];
		if(a2[i]>max){
			max=a2[i];
		}
	}
	int arr[max+2];
	for(int i=0;i<max+1;i++){
		arr[i]=0;
	}
	for(int i=0;i<n;i++){
		arr[a1[i]]++;
		arr[a2[i]+1]--;
	}
	int prev=0;
	int max1=0;
	for(int i=0;i<max+1;i++){
		if(prev+arr[i]>max1){
			max1=prev+arr[i];
		}
		prev=prev+arr[i];
	}
	cout<<max1;
}
