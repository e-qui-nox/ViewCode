#include<bits/stdc++.h>
using namespace std;
int main() {
    int n,i;
    string s;
    cin>>n;
    cin>>s;
    if (s=="0") {
        cout<<'0';
        return 0;
    }
    cout<<'1';
    for(i=0; i<n; i++){
        if (s[i]=='0') 
            cout<<'0';
    }
}