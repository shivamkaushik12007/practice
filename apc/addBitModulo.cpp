#include<stdio.h>
int main(){
	int d;
	scanf("%d",&d);
	int modulo=d%3;
	int i;
	scanf("%d",&i);
	while(i==0||i==1){
		modulo=(modulo*2+i)%3;
		scanf("%d",&i);
	}
	printf("%d",modulo);
}
