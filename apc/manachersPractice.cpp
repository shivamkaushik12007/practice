#include<iostream>
using namespace std;
int main(){
	int k;
	cin>>k;
	int n=2*k+1;
	char ch[n];
	for(int i=0;i<n;i++){
		if(i%2==0){
			ch[i]='$';
		}else{
			cin>>ch[i];
		}
	}
	int i=0;
	int res[n];
	for(i=0;i<n;){
		int left=i;
		int right=i;
		while(left>0&&right<n-1&&ch[left-1]==ch[right+1]){
			left--;
			right++;
		}
		res[i]=right-left+1;
		int j;
		for(j=i+1;j<=right;j++){
			res[j]=res[i-(j-i)]<(right-j)*2+1?res[i-(j-i)]:(right-j)*2+1;
			if(res[j]/2+i==right){
				i=j;
				break;
			}
		}
		if(i!=j){
			i++;
		}	
	}
	cout<<ch<<endl;
	for(int m=0;m<n;m++){
		cout<<res[m];
	}
}
