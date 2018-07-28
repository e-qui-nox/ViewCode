#include <bits/stdc++.h>
using namespace std;
int main()
{
	int k,n,s,p;
	cin>>k>>n>>s>>p;
	int ans=k*((n+s-1)/s);
	cout<<(ans+p-1)/p;
    return 0;
}