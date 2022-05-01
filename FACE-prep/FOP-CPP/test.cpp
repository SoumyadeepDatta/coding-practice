#include <bits/stdc++.h>
using namespace std;

float roundx(float, int);

int main(int argc, char const *argv[])
{
    // cout << roundx(44, 2);
    // cout << pow(10,2);

    float t;
    cin >> t;
    cout << t << endl;
    cout << fixed << setprecision(2) << t;
    return 0;
}

float roundx(float f, int preci) {
  float res = (int) (f * pow(10, preci) + 0.5);
  return (float)res / pow(10, preci) * 1.0;
}
