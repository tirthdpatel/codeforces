

#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t = 0;
    cin >> t;
    while (t-- > 0)
    {
        int n = 0, k = 0;
        cin >> n >> k;
        
        int f = n/2;
        k--;
        

        cout << (k+(n%2)*k/f)%n+1<<endl;
        
    }
}
