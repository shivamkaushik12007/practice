#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	int s=0;
	for(int i=0;i<n;i++){
		s=s^a[i];
	}
	int c;
	int s1=s;
	if(s1&1==1){
		s1=1;
	}else{
		while(true){
			c++;
			s1=s1>>1;
			if(s1&1==1){
				break;
			}
		}
		s1=1<<c;	
	}
	s1=a[0]&s1;
	int s3=0,s4=0;
	for(int i=0;i<n;i++){
		int s2=a[i]&s1;
		if(s1==s2){
			s3=s3^a[i];
		}else{
			s4=s4^a[i];
		}
	}
	cout<<s3<<"  "<<s4;
}
