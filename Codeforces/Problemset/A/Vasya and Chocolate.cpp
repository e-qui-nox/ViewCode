#include <bits/stdc++.h>
using namespace std;
int main() 
{
	int t;
	cin>>t;
	while(t--)
	{
	    long long s,a,b,c,x;
	    cin>>s>>a>>b>>c;
	    x = s/c;
	    cout<<x+(x/a)*b<<endl;
	}
}