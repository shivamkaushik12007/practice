using namespace std;
#include <iostream>;
typedef long long int ll;
int main()
{
    ll g,x,y;
    int n,t;
    cin>>t;
    while(t>0) {
        cin>>g>>n;
        x = 2*g;
        y = x+g;
        for(int i = 0;i<n-1;i++)
        cout<<x<<" ";
        cout<<y<<endl;
        t--;
    }
     return 0;
}
