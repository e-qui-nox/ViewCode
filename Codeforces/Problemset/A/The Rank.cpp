#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int s[n],f=1;
	for(int i=0;i<n;i++)
	{
		int a,b,c,d;
		cin>>a>>b>>c>>d;
		s[i]=a+b+c+d;
	}
	for(int i=1;i<n;i++)
	{
		if(s[i]>s[0])
			f++;
	}
	cout<<f;
}