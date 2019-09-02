#include<stdio.h>
#include<iostream>
using namespace std;

void swap(int arr[],int n,int m){
	int k=arr[n];
	arr[n]=arr[m];
	arr[m]=k;
}

void qSort(int arr[],int l,int r){
	if(l<r){
		int last=l;
		for(int i=l+1;i<=r;i++){
			if(arr[i]<arr[l]){
				swap(arr,i,++last);
			}
		}	
		swap(arr,last,l);
		
		qSort(arr,l,last-1);
		qSort(arr,last+1,r);
	}
	
}

int main(){
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	
	qSort(arr,0,n-1);
	
	for(int i=0;i<n;i++){
		cout<<arr[i]<<" ";
	}
}
