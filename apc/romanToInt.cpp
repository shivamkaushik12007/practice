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
		if(ch[i]=='i'){
			arr[i]=1;
		}else if(ch[i]=='v'){
			arr[i]=5;
		}else if(ch[i]=='x'){
			arr[i]=10;
		}else if(ch[i]=='l'){
			arr[i]=50;
		}else if(ch[i]=='c'){
			arr[i]=100;
		}else if(ch[i]=='d'){
			arr[i]=500;
		}else if(ch[i]=='m'){
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
