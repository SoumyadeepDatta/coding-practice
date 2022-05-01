#include <bits/stdc++.h>
using namespace std;

int main()
{
    float a1, b1, a2, b2, a3, b3;
    cin >> a1 >> b1 >> a2 >> b2 >> a3 >> b3;
    
    float mpb1 = - (a1 - a2) / (b1 - b2) * 1.0;
    float mpb2 = - (a2 - a3) / (b2 - b3) * 1.0;
    
    float x1 = (a1 + a2) / 2.0;
    float x2 = (a2 + a3) / 2.0;
    
    float y1 = (b1 + b2) / 2.0;
    float y2 = (b2 + b3) / 2.0;
    
    float x = ((mpb1 * x1) - (mpb2 * x2) - (y1 - y2)) / (mpb1 - mpb2) * 1.0;
    float y = (mpb1 * (x - x1)) + y1;

    cout << x << endl << y;
    
    return 0;
}