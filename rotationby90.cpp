#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int arr[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cin>>arr[i][j];
		}
	}
	for(int i=0;i<n/2;i++){
		for(int j=0;j<n-1-i;j++){
			int temp=arr[i][j];
			arr[i][j]=arr[n-1-j][i];
			arr[n-1-j][i]=arr[n-1-i][n-1-j];
			arr[n-1-i][n-1-j]=arr[j][n-1-i];
			arr[j][n-1-i]=temp;
		}
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cout<<arr[i][j]<<"  ";
		}
		cout<<endl;
	}
}
