#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,m,s=0,a,k;
    cin>>n>>m;
    for(int i=0;i<n;i++)
    {
        cin>>a;
        a=a+s;
        k=a/m;
        s=a%m;
        cout<<k<<" ";
    }
}