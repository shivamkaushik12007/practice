#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int val[n];
	for(int i=0;i<n;i++){
		cin>>val[i];	
	}
	int num;
	cin>>num;
	int arr[num+1];
	for(int i=0;i<num+1;i++){
		if(i%val[0]==0){
			arr[i]=1;
		}else{
			arr[i]=0;
		}
	}
	
	for(int i=1;i<n;i++){
		for(int j=val[i];j<num+1;j++){
			arr[j]=arr[j]+arr[j-val[i]];
		}
	}
	cout<<arr[num];
}
