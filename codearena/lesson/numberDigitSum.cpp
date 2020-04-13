#include <iostream>;
using namespace std;
    long long int check1(long long int x){
        long long int m=0;
        while(x!=0){
            m+=x%10;
            x/=10;
        }
        return m;
    }

    long long int check(long long int x){
        while(x/10>0){
            x=check1(x);
        }
        return x;
    }
    int main(){
        int t;
        cin>>t;
		while(t--){
            int m;
			cin>>m;
            long long int x=0;
            while(m--){
                long long int k1,k2;
				cin>>k1>>k2;
                x+=(k1*k2);
            }
            cout<<check(x)<<endl;
        }
    }
