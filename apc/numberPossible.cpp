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
	for(int i=0;i<n;i++){
		for(int j=val[i];j<k+1;j++){
			int a=i%val[i]==0?1:0;
			if(arr[j]==1||arr[j-val[i]]==1||a==1){
				arr[j]=1;
			}
		}
	}
	cout<<arr[k];
}
