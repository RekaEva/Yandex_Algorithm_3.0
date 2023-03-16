#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
vector <vector <int> > g;
vector <int> mark;
vector <vector <int> > ans;

void    dfs(int now, int mr)
{
    mark[now] = mr;
    for (int i = 0; i < g[now].size(); i++)
    {
        if (mark[g[now][i]] == 0 )
            dfs(g[now][i], 3 - mr);
        if (mark[g[now][i]] == mr)
        {
             cout << "NO\n";
             exit(0);
        }
    }
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
        if (v1 == v2)
            g[v1].push_back(v2);
        else
        {
            g[v1].push_back(v2);
            g[v2].push_back(v1);
        }
    }
    mark.resize(v+1, 0);
    int mr = 2;
    for (int now = 1; now <= v; now++)
    {
        if (mark[now] == 0)
        {
              dfs(now, 3 - mr);
        }
    }
    cout << "YES\n";
    return (0);
}