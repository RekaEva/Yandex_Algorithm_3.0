#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>

using namespace std;

void    printmat(vector <string> mat, int C)
{
    cout << "\n";
    for (auto j : mat)
    {
        cout << j << " ";
    }
}

int main()
{
	int M, N;
    cin >> M >> N;
    vector < vector< int > > mat;
    mat.reserve(M);
    for (int i = 0; i < M; i++)
    {
        vector<int> v;
        v.reserve(N);
        for (int j = 0; j < N; j++) {
            int n;
            cin >> n;
            v.push_back(n);
        }
        mat.push_back(v);
    }

    vector < vector< int > > dp;
    dp.reserve(M);
    for (int i = 0; i < M; i++)
    {
        vector<int> vc;
        vc.reserve(N);
        for (int j = 0; j < N; j++)
        {
            if (i == 0 && j == 0)
            {
                vc.push_back(mat[0][0]);
                continue;
            }
            if (i == 0 && j != 0)
                vc.push_back(vc[j - 1] + mat[0][j]);
            else if (i != 0)
            {
                if (j == 0)
                    vc.push_back(dp[i - 1][0] + mat[i][0]);
                else 
                    vc.push_back(max(dp[i - 1][j],vc[j - 1])+ mat[i][j]);
            }
        }
         dp.push_back(vc);
    }
    cout << dp[M - 1][N -1];
    vector<string> way;
    int r = M - 1;
    int c = N - 1;
    while ( r != 0 || c !=0)
    {
        if (c == 0)
        {
            way.push_back("D");
            r--;
        }
        else if (r  == 0)
        {
            way.push_back("R");
            c--;
        }
        else if (dp[r][c - 1] <= dp[r -1][c])
        {
            way.push_back("D");
            r--;
        }
        else if ((dp[r][c - 1] > dp[r -1][c]))
        {
            way.push_back("R");
            c--;
        }
    }
    reverse(way.begin(), way.end());
    printmat(way, way.size());
    return (0);
}