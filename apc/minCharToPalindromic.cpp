#include<iostream>
using namespace std;
int main(){
    string s1;
    cin>>s1;
    string s2=s1;
    for(int i=0;i<s2.size()/2;i++){
        char temp=s2[i];
        s2[i]=s2[s2.size()-1-i];
        s2[s2.size()-1-i]=temp;
    }
    int max=0;
    for(int i=0;i<s1.size();i++){
        string k1=s1.substr(0,i+1);
        string k2=s2.substr(s2.size()-1-i,s2.size());
        if(k1.compare(k2)==0){
            int count=k1.size();
            if(count>max){
                max=count;
            }
        }
    }
    cout<<s1.length()-max;
    return 0;
}
