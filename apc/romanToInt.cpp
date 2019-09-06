#include<stdio.h>
int main(){
	int n;
	scanf("%d",&n);
	char ch[n];
	int i;
	for(i=0;i<n;i++){
		scanf("%c",&ch[i]);
	}
	int arr[n];
	for(i=0;i<n;i++){
		if(ch[i]=='I'){
			arr[i]=1;
		}else if(ch[i]=='V'){
			arr[i]=5;
		}else if(ch[i]=='X'){
			arr[i]=10;
		}else if(ch[i]=='L'){
			arr[i]=50;
		}else if(ch[i]=='C'){
			arr[i]=100;
		}else if(ch[i]=='D'){
			arr[i]=500;
		}else if(ch[i]=='M'){
			arr[i]=1000;
		}
	}
	int j=1;
	i=0;
	int res=0;
	while(j<n){
		if(arr[j]<=arr[i]){
			res+=arr[i];
		}else{
			res-=arr[i];
		}
		i++;
		j++;
	}
	res+=arr[n-1];
	printf("%d",res);
}
