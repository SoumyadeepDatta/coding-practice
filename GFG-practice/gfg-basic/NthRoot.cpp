// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution{
	public:
	int NthRoot(int n, int m)
	{
	    // Code here.
	    
	    if(m==1 || n==1)
	        return m;
	    
	    int i,r=1,p;
	    
	    for(i=1;i<m;i++)
	    {
	        p=n; r=1;
	        while(p--)
	        {
	            r=r*i;
	        }
	        if(r==m)
	            return i;
	        else if(r>m)
	            break;
	    }
	    return -1;
	}  
};

// { Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		Solution ob;
		int ans = ob.NthRoot(n, m);
		cout << ans << "\n";
	}  
	return 0;
}  // } Driver Code Ends