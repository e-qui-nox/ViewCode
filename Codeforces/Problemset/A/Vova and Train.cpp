#include<bits/stdc++.h>
using namespace std;
int main()
{   int t;
    cin>>t;
    while(t--)
    {
	    int x,v,l,r,a,b,c;
	    cin>>x>>v>>l>>r;
	    a = (x/v);
	    b = (r/v);
	    c = (l-1);
	    cout<<a-b+c/v<<endl;
    }
}