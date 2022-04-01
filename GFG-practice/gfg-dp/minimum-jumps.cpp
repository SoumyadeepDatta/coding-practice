// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
// Function to return minimum number of jumps to end of array

class Solution{
  public:
    int minJumps(int arr[], int n){
        // Your code here
        for(int i = n - 1; i >= 0; i--) {
            if(i == n - 1) {
                arr[i] = 0;
            }
            else if(arr[i] == 0) {
                arr[i] = -1;
            }
            else if(arr[i] >= (n - 1) - i) {
                arr[i] = 1;
            }
            else{
                int f = 0, min = std::numeric_limits<int>::max();
                for(int j = arr[i] + i; j > i; j--) {
                    if(arr[j] == -1) {
                        continue;
                    }
                    else {
                        f = 1;
                        if(arr[j] < min) {
                            min = arr[j];
                        }
                    }
                }
                if(f == 0) {
                    return -1;
                }
                arr[i] = min + 1;
            }
        }
        return arr[0];
    }
};


// { Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,i,j;
        cin>>n;
        int arr[n];
        for(int i=0; i<n; i++)
            cin>>arr[i];
        Solution obj;
        cout<<obj.minJumps(arr, n)<<endl;
    }
    return 0;
}
  // } Driver Code Ends