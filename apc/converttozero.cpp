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
	int r=1,c=1;
	for(int i=0;i<n;i++){
		if(arr[0][i]==0){
			 r=0;
		}
		if(arr[i][0]==0){
			c=0;
		}
	}
	for(int i=1;i<n;i++){
		for(int j=1;j<n;j++){
			if(arr[i][j]==0){
				arr[0][i]=0;
				arr[i][0]=0;
			}
		}
	}
	for(int i=1;i<n;i++){
		if(arr[0][i]==0){
			 for(int j=1;j<n;j++){
			 	arr[i][j]=0;
			 }
		}
		if(arr[i][0]==0){
			 for(int j=1;j<n;j++){
			 	arr[j][i]=0;
			 }
		}
	}
	if(r==0){
		for(int i=0;i<n;i++){
			arr[0][i]=0;
		}
	}
	if(c==0){
		for(int i=0;i<n;i++){
			arr[i][0]=0;
		}
	}
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cout<<arr[i][j]<<"  ";
		}
		cout<<endl;
	}
}

