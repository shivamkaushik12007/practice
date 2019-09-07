#include<stdio.h>
int arr[]={5,2,7,6,3,1,4};
int SIZE=7;
int SIZE1=SIZE;

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

void delete_max(){
	int k=arr[0];
	swap(0,SIZE-1);
	SIZE--;
	sink(0);
}

void heapiFy(){
	for(int i=SIZE1/2;i>=0;i--){
		sink(i);
	}
}

void heapSort(){
	for(int i=0;i<SIZE1;i++){
		delete_max();
	}
}
int main(){
	heapiFy();
	for(int i=0;i<SIZE1;i++){
		printf("%d ",arr[i]);
	}
	printf("\n");
	heapSort();
	for(int i=0;i<SIZE1;i++){
		printf("%d ",arr[i]);
	}
}
