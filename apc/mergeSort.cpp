#include<stdio.h>
#include<iostream>
using namespace std;

void merge(int arr[],int l,int mid,int r){
	int n1=mid-l+1; 
    int n2=r-mid; 
	int brr[n1],crr[n2];
	for(int i=0;i<n1;i++){
		brr[i]=arr[l+i];
	}
	for(int i=0;i<n2;i++){
		crr[i]=arr[i+mid+1];
	}
	
	int i=0;
	int j=0;
	int k = l;
    while(i<n1&&j<n2){ 
        if(brr[i]<=crr[j]){ 
            arr[k]=brr[i]; 
            i++; 
        }else{ 
            arr[k]=crr[j]; 
            j++; 
        } 
        k++; 
    } 
    
    while(i<n1){ 
        arr[k]=brr[i]; 
        i++; 
        k++; 
    } 
  
    while(j<n2){ 
        arr[k]=crr[j]; 
        j++; 
        k++; 
    } 
}

void mergeSort(int arr[],int l,int r){
	if(l<r){
		int mid=(l+r)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,mid,r);
	}
}

int main(){
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	
	mergeSort(arr,0,n-1);
	
	for(int i=0;i<n;i++){
		cout<<arr[i]<<" ";
	}
}
