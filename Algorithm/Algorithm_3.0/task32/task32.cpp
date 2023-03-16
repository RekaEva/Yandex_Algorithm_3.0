#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
vector <vector <int> > g;
vector <bool> visited;
vector <int> cont;
vector <vector <int> > ans;

void    dfs(int now, int nc)
{
    if (visited[now] == false)
    {
        ans[nc].push_back(now);
        cont[now] = nc;
    }
    visited[now] = true;
    for (int i = 0; i < g[now].size(); i++)
    {
        if (visited[g[now][i]] == false)
            dfs(g[now][i], nc);
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
    visited.resize(v+1, false);
    cont.resize(v+1, 0);
    ans.resize(v+1); 
    int nc = 0;
    ans[nc].push_back(0);
    for (int now = 1; now <= v; now++)
    {
        if (visited[now] == false)
        {
            nc++;
            dfs(now, nc);
        }
    }
    cout << nc << endl; // количество графов всего;
    for (int i = 1; i <= nc; i++)
    {
        if (ans[i].size() != 0)
        {
            cout << ans[i].size();
            cout << endl;
            for (int j = 0; j < ans[i].size(); j++)
            {
                cout << ans[i][j] << " " ;
            }
            cout << endl;
        }
    }
    return (0);
}