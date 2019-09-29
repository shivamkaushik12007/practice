#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int val[n][2];
	for(int i=0;i<n;i++){
		cin>>val[i][0];
		cin>>val[i][1];
	}
	int k;
	cin>>k;
	int arr[k+1];
	for(int i=0;i<k+1;i++){
		arr[i]=i%val[0][0]==0?(i/val[0][0])*val[0][1]:0;
	}
	for(int i=1;i<n;i++){
		for(int j=val[i][0];j<k+1;j++){
			arr[j]=arr[j-val[i][0]]+val[i][1]>arr[j]?arr[j-val[i][0]]+val[i][1]:arr[j];
		}
	}
	cout<<arr[k];
}
