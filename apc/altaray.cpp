#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t-->0){
	    int n;
	    cin>>n;
	    int arr[n],brr[n];
	    for(int i=0;i<n;i++){
	        cin>>arr[i];
	        brr[i]=1;
	    }
	    int count=1,res=1,dum=1;
	    for(int i=0;i<n-1;i++){
	        int l=arr[i];
	        int m=arr[i+1];
	        if(l<0&&m>=0||l>=0&&m<0){
	            cout<<arr[i]<<" ";
	            count++;
	            res=i;
	            continue;
	           // cout<<"kj";
	        }else if(i==n-2){
	        
	            dum=0;
	        }else{
	            cout<<"   "<<arr[i]<<"   ";
	            dum=0;
	        }
	        
	        if(dum==0&&count>1){
	            
	            for(int j=i-res;j<i;j++){
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
