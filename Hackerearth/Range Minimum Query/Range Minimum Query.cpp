#include<bits/stdc++.h>
#define ll long long
using namespace std;
int A[1000007];
int tree[4*1000007];
void build(int node,int start,int end){
    if(start == end){
        tree[node]=A[start];
    }
    else{
        int mid = (start+end)/2;
        build(2*node,start,mid);
        build(2*node+1,mid+1,end);
        tree[node] = min(tree[2*node],tree[2*node+1]);
    }
}
 
int query(int node,int start,int end,int l,int r){
    if(r<start || end<l)
        return INT_MAX;
    if(l<=start && r>=end)
         return tree[node];
    int mid = (start + end) / 2;
    return min(query(2*node,start,mid,l,r),query(2*node+1,mid+1,end,l,r));
  
}
 
void update(int node,int start,int end,int x, int y){
    if(start == end){
        A[x]=y;
        tree[node]=y;
    }
    else{
        int mid = (start+end)/2;
        if(start<=x && x<=mid){
            update(2*node,start,mid,x,y);
        }
        else
            update(2*node+1, mid+1, end, x, y);
        tree[node] = min(tree[2*node] ,tree[2*node+1]);
    }
}
 
int main(){
    int n,Q;
    cin>>n>>Q;
    for(int i=1;i<=n;i++){
        cin>>A[i];
    }
    build(1,1,n);
    //cout<<tree[1]<<endl;
    char s; int l,r,x,y;
    for(int i=0;i<Q;i++){
        cin>>s;
        if(s=='q'){
            cin>>l>>r;
            cout<<query(1,1,n,l,r)<<endl;
        }
        else if(s=='u'){
            cin>>x>>y;
            update(1,1,n,x,y);
        }
    }
}