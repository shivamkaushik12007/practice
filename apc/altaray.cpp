#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t-->0){
	    int n;
	    cin>>n;
	    int arr[n+1],brr[n];
	    for(int i=0;i<n;i++){
	        cin>>arr[i];
	        brr[i]=1;
	    }
	    arr[n]=arr[n-1]<0?-1:1;
	    int count=1,res=1,dum=1;
	    for(int i=0;i<n;i++){
	        int l=arr[i];
	        int m=arr[i+1];
	        if(l<0&&m>=0||l>=0&&m<0){
	            count++;
	            res=i;
	            continue;
	        }else{
	            dum=0;
	        }
	        
	        if(dum==0&&count>1){
	            for(int j=i-count+1;j<i;j++){
	                brr[j]=count;
	                count--;
	            }
	            count=1;
	            dum=1;
	        }
	    }
	    cout<<endl;
	    for(int i=0;i<n;i++){
	        cout<<brr[i]<<" ";
	    }
	}
	return 0;
}

