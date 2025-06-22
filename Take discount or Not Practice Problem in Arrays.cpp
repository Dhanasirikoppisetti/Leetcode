#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int n,x,y;
        cin>>n>>x>>y;
        int a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        int sum=0;
       for(int i=0;i<n;i++)
       {
           sum+=a[i];
       }
       int sum_coupon=x;
      for(int i=0;i<n;i++)
      {
          sum_coupon+=max(0,(a[i]-y));
      }
      if(sum>sum_coupon)
      {
          cout<<"COUPON"<<endl;
      }
      else
      {
          cout<<"NO COUPON"<<endl;
      }
       
    }

}

