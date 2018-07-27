#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a,b,c,n,i;
    cin>>a>>b>>c>>n;
    i=a+b-c;
    if(i<n&&a>=c&&b>=c)
        cout<<n-i;
    else
        cout<<"-1";
        return 0;
}
