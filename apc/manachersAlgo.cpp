#include<stdio.h>
#include<string.h>
int main(){
	int n;
	scanf("%d",&n);
	n=(n*2)+1;
	char ch[n];
	for(int i=0;i<n;i++){
		if(i%2!=0){
			scanf("%c",&ch[i]);
		}else{
			ch[i]='$';
		}
	}
	int left=0,right=0;
	int arr[n];
	for(int i=0;i<n;){
		left=i;
		right=i;
		while(left>0&&right<n-1&&ch[left-1]==ch[right+1]){
			left--;
			right++;
		}
		arr[i]=right-left+1;
		int j;
		for(j=i+1;j<=right;j++){
			arr[j]=arr[i-(j-i)]<(right-j)*2+1?arr[i-(j-i)]:(right-j)*2+1;
			if(arr[j]/2+i==right){
				i=j;
				break;
			}
		}
		if(i!=j){
			i++;
		}	
	}
	int max=0;
	for(int i=0;i<n;i++){
		if(arr[i]>max)
			max=arr[i];
	}
	printf("%d",max/2);
}
