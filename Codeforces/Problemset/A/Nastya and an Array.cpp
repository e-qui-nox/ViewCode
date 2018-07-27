#include<bits/stdc++.h>
using namespace std;
int main()
{   int n,a,i,j;
	cin>>n;
	set<int>s;
	for(i=1;i<=n;i++)
	{
		cin>>a;
		if(a!=0)
		    s.insert(a);
	}
	cout<<s.size();
	return 0;
}