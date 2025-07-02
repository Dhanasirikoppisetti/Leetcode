#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int evencount=0;
	    int oddcount=0;
	    
	   for(int i=1;i<=n;i++)
	   {
	       if(n%i==0)
	       {
	           if(i%2==0)
	           {
	               evencount++;
	           }
	           else
	           {
	               oddcount++;
	           }
	       }
	   }
	   cout<<oddcount<<" "<<evencount<<endl;
	}

}

