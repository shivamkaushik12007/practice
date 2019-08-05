#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	int k;
	cin>>k;
	for(int i=0;i<n;i+=k){
		if(i+k<=n){
			for(int j=0;j<k/2;j++){
				int temp=arr[j+i];
				arr[j+i]=arr[i+k-1-j];
				arr[i+k-1-j]=temp;
			}
		}
		else{
			for(int j=0;j<(n-i)/2;j++){
				int temp1=arr[j+i];
				arr[j+i]=arr[n-1-j];
				arr[n-1-j]=temp1;
			}
		}
	}
	for(int i=0;i<n;i++){
		cout<<arr[i]<<"  ";
	}
	
}
