#include <iostream>
#include <vector>
#include <algorithm>
#include <limits.h>

using namespace std;

void    printmat(vector <int> mat)
{
    for (int j = 0; j < mat.size() ; j++)
        cout << mat[j] << " ";
}

int main()
{
    int n;
    cin >> n;
    int x = 1;
    vector <int> v;
    vector <int> dp;
    dp.push_back(0);
    dp.push_back(1);
    dp.push_back(1);
    dp.push_back(2);
    for (int i = 4; i < n; i++)
    {
        int a = INT_MAX;
        int b = INT_MAX;
        if ((i + 1) % 3 == 0)
            a = dp[(i - 1)/3];
        if ((i + 1) % 2 == 0)
            b = dp[(i - 1)/2];
        int c = dp[i - 1];
        int d = min(min(a,b), c) + 1;
        dp.push_back(d);
    }
    cout << dp[n - 1] << endl;
    v.push_back(n);
    dp.insert(dp.begin(),0);
    while (n != 1)
    {
        if (n % 3 == 0 && (dp[(n/3)] + 1 == dp[n]) )
            n = n / 3;
        else if (n % 2 == 0 && (dp[(n/2)] + 1 == dp[n]))
            n = n / 2;
        else 
            n = n - 1;
        v.push_back(n);
    }
    sort(v.begin(), v.end());
    printmat(v);
    return (0);
}