#include<bits/stdc++.h>
using namespace std;
int main()
{
	map<string,int>Map;
	int n;
	string s;
	cin>>n;
	while(n--)
	{
		cin>>s;
		if(Map[s])
		cout<<s<<Map[s]<<endl;
		else cout<<"OK"<<endl;
		Map[s]++;
	}
	return 0;
}