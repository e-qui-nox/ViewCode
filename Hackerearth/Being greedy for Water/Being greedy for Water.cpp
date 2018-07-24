#include<bits/stdc++.h>
using namespace std;
 
int main(){
    int t;
    cin>>t;
while(t--){
    int n,x;
    cin>>n>>x;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin>>arr[i];
    }
    sort(arr,arr+n);
    int sum=0;int num=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
        if(sum>x){
            num++;
            cout << i << endl;
            break;
        }
    }
    if(num==0) cout << n << endl;
    }
    return 0;
}