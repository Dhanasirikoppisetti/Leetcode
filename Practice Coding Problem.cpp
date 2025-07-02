#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    long long a,b;
	    cin>>a>>b;
	    if(a==0)
	    {
	        cout<<"No"<<endl;
	    }
	    else if(b==0)
	    {
	        cout<<"Yes"<<endl;
	    }
	    else
	    {
	        if(b%a)
	        {
	            cout<<"No"<<endl;
	        }
	        else
	        {
	            cout<<"Yes"<<endl;
	        }
	    }
	    
	}

}




