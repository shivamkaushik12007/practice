#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int n0=n;
	int arr[n][n];
	n=n%2==0?n/2:n/2+1;
	int k=1;
	int n1=0,n2=n0,n3=n0,n4=0;
	for(int i=0;i<n;i++){
		for(int j=n1;j<n2;j++){
			arr[n1][j]=k++;
		}
		n1++;
		for(int j=n1;j<n3;j++){
			arr[j][n2-1]=k++;
		}
		n2--;
		for(int j=n2-1;j>=n4;j--){
			arr[n3-1][j]=k++;
		}
		n3--;
		for(int j=n3-1;j>=n1;j--){
			arr[j][n4]=k++;
		}
		n4++;
	}
	for(int i=0;i<n0;i++){
		for(int j=0;j<n0;j++){
			cout<<arr[i][j]<<"   ";
		}
		cout<<endl;
	}
}
