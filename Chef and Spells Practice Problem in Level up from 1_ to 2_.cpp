#include <bits/stdc++.h>
#include <algorithm>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int a,b,c;
	    cin>>a>>b>>c;
	    int d=a+b;
	    int e=b+c;
	    int f=c+a;
	   int ans=max({d,e,f});
	   cout<<ans<<endl;
	}
}

