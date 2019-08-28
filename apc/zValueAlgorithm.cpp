#include<iostream>
#include<string.h>
using namespace std;
int main(){
	string str;
	string str1,str2;
	cin>>str1;
	cin>>str2;
	str=str2+"$"+str1;
	int n=str.size();
	int n1=str2.size();
	int left=0;
	int right=0;
	int z[n];
	z[0]=0;
	for(int i=1;i<n;i++){
		if(i>right){
			left=right=i;
			while(right<n && str[right]==str[right-left]){
				right++;
			}
			z[i]=right-left;
			right--;                 
		}else{
			if(z[i-left]+i-1<right){
				z[i]=z[i-left];
			}else{
				left=i; 
				while (right<n && str[right]==str[right-left]) 
                	right++; 
                z[i] =right-left; 
                right--;                 
			}
		}
	}
	for(int i=n1;i<n;i++){
		if(z[i]==n1){
			cout<<i-n1-1<<endl;
		}
	}
}
