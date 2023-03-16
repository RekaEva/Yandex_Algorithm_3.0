#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>
#include <limits.h>

using namespace std;

#define my_max 30000

void    printmat_1(vector <int> mat)
{
    int C = mat.size();
    for (int j = 0; j < C ; j++)
    {
        cout << mat[j] << " ";
    }
}

int find_max_cupon(vector<int> in)
{
    int n = 0;
    for (auto i : in)
    {
        if (i > 100)
            n++;
    }
    return (n);
}

int main()
{
    int day;
    cin >> day;
    if (day == 0) {
        cout << "0\n0 0\n";
        return 0;
    }
    vector<int> p;
    p.reserve(day);
    for (int i = 0; i < day; i++)
    {
        int t;
        cin >> t;
        p.push_back(t);
    }
    int max_cupon = find_max_cupon(p) + 1;
    vector <vector <int> > dp;
    dp.reserve(day);
    for (int i = 0; i < day; i++)
    {
        vector <int> v (max_cupon, my_max);
        for (int j = 0; j < max_cupon; j++)
        {
            int tmp;
            if (i  == 0)
            {
                if (p[i] <= 100)
                    v[0] = p[i];
                else
                    v[1] = p[i];
            }
            else if (i > 0 && p[i] > 100)
            {
                if ((j - 1) < 0)
                    tmp = dp[i -1][j + 1];
                else
                {
                    if (j + 1 >= max_cupon)
                        tmp = (dp[i-1][j-1] + p[i]);
                    else
                        tmp = min(dp[i - 1][j + 1], (dp[i-1][j-1] + p[i]));
                }
                v[j] = tmp;
            }
            else if (i > 0 && p[i] <= 100)
            {
                if (j + 1 >= max_cupon)
                    tmp = dp[i - 1][j] + p[i];
                else
                    tmp = min((dp[i - 1][j] + p[i]), dp[i-1][j + 1]);
                v[j] = tmp;
            }
        }
        dp.push_back(v);
    }
    int fin_p, n_cup;
    int m = INT_MAX;
    for (int j = 0; j < dp[day - 1].size(); j++)
    {
        if (dp[day - 1][j] <= m)
        {
            m = dp[day - 1][j];
            n_cup = j;
        }
    }
    vector<int> ans;
    int k2 = 0;
    int j;
    j = n_cup;
    for (int i = dp.size() - 1; i > 0; i--)
    {
        if (p[i] <= 100)
        {
            if (j + 1 < dp.size() && dp[i -1][j + 1] == dp[i][j])
            {
                // тратим купон
                ans.push_back(i + 1);
                j++;
                k2++; // увеличиваем количество использованых купонов
            }
        }
        if (p[i] > 100)
        {
            if (j + 1 < dp.size() && dp[i -1][j + 1] == dp[i][j])
            {
                ans.push_back(i + 1);
                j++;
                k2++;
            }
            else if (j - 1 >= 0 && dp[i][j]- p[i] == dp[i -1][j - 1])
                j--;
        }
        if (p[i] == 0)
            continue;
    }
    cout << m << endl;
    cout << n_cup << " " << k2 << endl;
    sort(ans.begin(), ans.end());
    printmat_1(ans);
    return 0;
}
