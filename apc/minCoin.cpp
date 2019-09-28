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
	int k;
	cin>>k;
	int arr[k+1];
	for(int i=0;i<k+1;i++){
		arr[i]=0;
	}
	for(int j=0;j<n;j++){
		for(int i=val[j];i<k+1;i++){
			if(i%val[j]==0){
				arr[i]=i/val[j];
			}else if(arr[i-val[j]]==0){
				continue;
			}else{
				int num=arr[i-val[j]]+1;
				if(arr[i]==0){
					arr[i]=num;
				}else{
					arr[i]=num<arr[i]?num:arr[i];
				}
			}
		}	
	}
	cout<<arr[k];
}
