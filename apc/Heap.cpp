#include<stdio.h>
int SIZE=0;
int arr[100];
void swap(int i,int j){
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}

void swim(int n){
	if(n==0) return;
	if(arr[n]>arr[n/2]){
		swap(n,n/2);
		swim(n/2);	
	}
}

void sink(int n){
	int max=n;
	if(2*n<SIZE&&arr[n]<arr[n*2]) max=n*2;
	if(2*n+1<SIZE&&arr[max]<arr[(2*n)+1]) max=(2*n)+1;
	if(max==n) return;
	swap(max,n);
	sink(max);
}

void add(int n){
	arr[SIZE++]=n;
	swim(SIZE-1);
}

int delete_max(){
	int k=arr[0];
	swap(0,SIZE-1);
	SIZE--;
	sink(0);
	return k;
}

int get_max(){
	return arr[0];
}

int main(){
	add(1);
	add(2);
	add(3);
	add(5);
	add(4);
	for(int i=0;i<SIZE;i++){
		printf("%d ",arr[i]);
	}
	printf("\n");
	printf("%d ",get_max());
	printf("%d ",delete_max());
	printf("%d ",get_max());
	printf("\n");
	for(int i=0;i<SIZE;i++){
		printf("%d ",arr[i]);
	}
}
