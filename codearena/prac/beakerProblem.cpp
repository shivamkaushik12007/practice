#include <iostream>
#include <math.h>
using namespace std;
int main(){
    int t;
	cin>>t;
    while(t--){
        unsigned long long int n,k;
		cin>>n>>k;
        if(k<=n){
            int l=0;
            while(pow(2,l)<k){
                l++;
            }
			l++;
            cout<<l<<endl;
        }else{
            int l=0;
            while(pow(2,l)<n){
                l++;
            }
            l++;
            unsigned long long int k1=k/n;
            unsigned long long int k2=k%n;
            unsigned long long int res=l*k1;
            l=0;
			if(k2!=0){
				while(pow(2,l)<k2){
					l++;
				}
				l++;
			}
            cout<<(res+l)<<endl;
        }
    }
}
