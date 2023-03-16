#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    int r, c;
    cin >> r >> c;
    vector < vector< int > > dp;
    dp.reserve(r + 1);
    vector<int> vc(c + 1, 0);
    dp.push_back(vc);
    for (int i = 1; i < r + 1; i++)
    {
        vector<int> vc;
        vc.reserve(c + 1);
        vc.push_back(0);
        for (int j = 1; j < c + 1; j++)
        {
            int a;
            int b;
            if (i == 1 && j == 1)
                vc.push_back(1);
            if (j - 2 >= 0)
                a = dp[i - 1][j - 2];
            else 
                a = 0;
            if (i - 2 > 0)
                b = dp[i - 2][j - 1];
            else
                b = 0;
            int c = a + b;
            vc.push_back(c);
        }
        dp.push_back(vc);
    }
    cout << dp[r][c];
    return 0;
}