#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>
#include <limits.h>

using namespace std;

void    printmat(vector< vector <int > > mat, int R)
{
    cout << "\n";
    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < mat[i].size() ; j++)
        {
            cout << mat[i][j] << " ";
        }
        cout << "\n";
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
        vector <int> v (max_cupon, 500);
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
    printmat(dp, day);
    int fin_p, n_cup;
    int m = INT_MAX;
    for (int i = 0; i < dp[day - 1].size(); i++)
    {
        if (dp[day - 1][i] <= m)
        {
            m = dp[day - 1][i];
            n_cup = i;
        }
    }
    cout << m << endl;
    cout << n_cup << endl;
    return 0;
}











// void    printmat(vector< vector <int > > mat, int R, int C)
// {
//     cout << "\n";
//     for (int i = 0; i < R; i++)
//     {
//         for (int j = 0; j < C ; j++)
//         {
//             cout << mat[i][j] << " ";
//         }
//         cout << "\n";
//     }
// }

// int find_max_cupon(vector<int> in)
// {
//     int n = 0;
//     for (auto i : in)
//     {
//         if (i > 100)
//             n++;
//     }
//     return (n);
// }

// int main()
// {
//     int day;
//     cin >> day;
//     vector<int> in;
//     in.reserve(day);
//     for (int i = 0; i < day; i++)
//     {
//         int t;
//         cin >> t;
//         in.push_back(t);
//     }
//     int cup_max = find_max_cupon(in);
//     cout << cup_max;
//     vector <vector <int> > dp;
//     dp.reserve(day + 1);
//     vector <int> vc (cup_max + 2, 0);
//     dp.push_back(vc);
//     for (int i = 1; i <= day + 1; i++)
//     {
//         vector <int> v(cup_max + 2,0);
//         v.reserve(cup_max + 2);
//         v[0] = 0;
//         if (i == 1)
//         {
//             if (in[0] <= 100)
//                 v[1] = in[0];
//             if (in[0] > 100)
//                 v[2] = in[0];
//             dp.push_back(v);
//             continue;
//         }
//         for (int j = 1; j <= cup_max + 1; j++)
//         {
//             int tmp, a,b;
//             if (in[i - 1] > 100)
//             {
//                 a = (dp[i - 1][j - 1] + in[i - 1]);
//                 b = dp[i - 1][j + 1];
//                 tmp = min(a,b);
//             }
//             else if (in[i - 1] <= 100)
//             {
//                 a = (dp[i - 1][j] + in[i - 1]);
//                 b = dp[i -1][j + 1];
//                 tmp = min(a,b);
//             }
//             v[j] = (tmp);
//         }
//         dp.push_back(v);
//     }
//     printmat(dp, day + 1, cup_max + 2);
//     return 0;
// }
