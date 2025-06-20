#include <bits/stdc++.h>
using namespace std;

int main() {
int t;
cin>>t;
while(t--)
{
    int n,a,b,c;
    cin>>n>>a>>b>>c;
    if(n<=b && n<=a+c)
    {
        cout<<"yes"<<endl;
    }
    else
    {
        cout<<"No"<<endl;
    }
}
}

