#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>

using namespace std;

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
            {
                int n = vc[j - 1] + mat[0][j];
                vc.push_back(n);
            }
            else if (i != 0)
            {
                if (j == 0)
                {
                    int n = dp[i - 1][0];
                    vc.push_back(n + mat[i][0]);
                }
                else 
                {
                    int a = dp[i - 1][j];
                    int b = vc[j - 1];
                    int mi = min(a,b);
                    int n = mi + mat[i][j];
                    vc.push_back(n);
                }
            }
        }
         dp.push_back(vc);
    }
    cout << dp[M - 1][N -1];
    return (0);
}