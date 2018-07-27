#include<bits/stdc++.h>
using namespace std;
int main()
{
    int m,n,i,j;
    cin>>n>>m;
    int x[n],y[m];
    for(i=0;i<n;i++)
    cin>>x[i];
    for(i=0;i<m;i++)
    cin>>y[i];
    for(i=0;i<n;i++)
    {
    	for(j=0;j<m;j++)
    	{
    		if(x[i]==y[j])
    		cout<<x[i]<<" ";
    	}
    }
    return 0;
}