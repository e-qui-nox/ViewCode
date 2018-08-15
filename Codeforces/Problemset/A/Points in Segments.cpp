#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,m;
    cin>>n>>m;
    int l,r;
    set<int>s;
    set<int>::iterator it;
    for(int i=0;i<n;i++){
        cin>>l>>r;
        for(int j=l;j<=r;j++){
            s.insert(j);
        }
    }
    int c=0;
    cout<<m-s.size()<<endl;
    for(int i=1;i<=m;i++){
        it = s.find(i);
        if(it==s.end()){
            c++;
            cout<<i<<' ';
        }   
    }
    return 0;
}