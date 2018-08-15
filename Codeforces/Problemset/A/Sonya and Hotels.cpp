#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n,d;
	cin>>n>>d;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	int c=0;
	for(int i=0;i<n-1;i++)
	{
		if(a[i+1]-a[i]>(2*d))   c+=2;
		else if(a[i+1]-a[i]==(2*d)) c++;
	}
	cout<<c+2<<endl;
	return 0;
}