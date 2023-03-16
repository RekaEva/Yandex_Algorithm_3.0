#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
vector <vector <int> > g;
vector <int> mark;
vector <int> ans;

void    printmat(vector <int>  mat)
{
    for (int j = mat.size() - 1; j >= 0; j--)
        cout << mat[j] << " ";
    cout << "\n";
}

void    dfs(int now, int mr)
{
    mark[now] = mr;
    for (int i = 0; i < g[now].size(); i++)
    {
        if (mark[g[now][i]] == 0 )
            dfs(g[now][i], mr);
        if (mark[g[now][i]] == 1)
        {
             cout << "-1\n";
             exit(0);
        }
    }
    ans.push_back(now);
    mark[now] = 2;
}

int main()
{
    int v, e;
    cin >> v >> e;
    g.resize(v + 1);
    int v1,v2;
    for (int i = 1; i <= e; i++)
    {
        cin >> v1 >> v2;
            g[v1].push_back(v2);
    }
    mark.resize(v+1, 0);
    int mr = 1;
    for (int now = 1; now <= v; now++)
    {
        if (mark[now] == 0)
        {
              dfs(now, mr);
        }
    }
    printmat(ans);
    return (0);
}