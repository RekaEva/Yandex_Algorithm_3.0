#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    // std::vector<int> v(10, -2);
    // // v.reserve(10);
 
    // // std::fill(v.begin(), v.end(), -1);
 
    // for (auto elem : v)
    //     std::cout << elem << ' ';
    // std::cout << '\n';
    int m = min(3,5);
     std::cout << m << '\n';
}


//     int M; int N;
//     cin >> M >> N;
//     vector < vector< int > > mat;
//     mat.reserve(M + 1);
//     vector<int> v(N + 1, 1000);
//     mat.push_back(v);
//     for (int i = 1; i < M + 1; i++)
//     {
//         vector<int> v;
//         v.reserve(N + 1);
//         v.push_back(10000);
//         for (int j = 1; j < N; j++) {
//             int n;
//             cin >> n;
//             v.push_back(n);
//         }
//         mat.push_back(v);
//     }
//     printmat(mat, M, N);
//     vector < vector< int > > dp;
//     dp.reserve(M + 1);

//     return (0);

// dp[0][k] = dp[0][k - 1] + COINS[0][k]
// dp[k][0] = dp[k - 1][0] + COINS[k][0]


// void assign(int (&arr)[r][c])
// {
//     for (size_т i = 0; i < r; i++)
//     {
//         for (size_т j = 0; j < c; j++) {
//             arr[i][j] = i + j;
//         }
//     }
// }

// int *arr, int r, int c




//  for (int i = 0; i < M; i++)
//     {
//         for (int j = 0; j < N; j++)
//         {
//             if (i == 0 && j == 0)
//             {
//                 dp[i].push_back(mat[0][0]);
//                 continue;
//             }
//             if (i == 0 && j != 0)
//             {
//                 int n = dp[i][j - 1] + mat[0][j];
//                 dp[i].push_back(n);
//             }
//             else if (i != 0)
//             {
//                 if (j == 0)
//                 {
//                     // int n = dp[i - 1][0];
//                     dp[i].push_back(dp[i - 1][0] + mat[i][0]);
//                 }
//                 else 
//                 {
//                     int a = dp[i - 1][j];
//                     int b = dp[i][j - 1];
//                     int mi = min(a,b);
//                     int n = mi + mat[i][j];
//                     dp[i].push_back(n);
//                     // exit (0);
//                 }
//             }
//         }
        // dp.push_back(vc);
    


// void    printdp(int **mat, int r, int c)
// {
//     cout << "\n";
//     for (int i = 0; i < r; i++)
//     {
//         for (int j = 0; j < c ; j++)
//         {
//             cout << mat[i][j] << " ";
//         }
//         cout << "\n";
//     }
// }

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

// void    printmat(vector <int> mat, int C)
// {
//     cout << "\n";
//     for (int j = 0; j < C ; j++)
//     {
//         cout << mat[j] << " ";
//     }
// }

