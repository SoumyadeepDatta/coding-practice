#include <bits/stdc++.h>
using namespace std;


float roundx(float, int);
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    // Type your code here.
    float p, r, t;
    cin >> p >> r >> t;
    float i = (p * r * t) / 100;
    cout << fixed << setprecision(2) << i << endl;
    cout << p + i << endl;
    cout << i * 0.02 << endl;
    cout << p + i - i * 0.02 << endl;
    return 0;
}

