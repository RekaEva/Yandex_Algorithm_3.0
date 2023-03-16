#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
vector <int>ans;
vector <bool> visited;
vector <vector <int> > g;

void    dfs(int now)
{
    if (visited[now] == false)
        ans.push_back(now);
    visited[now] = true;
    for (int i = 0; i < g[now].size(); i++)
    {
        if (visited[g[now][i]] == false)
            dfs(g[now][i]);
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
    int now = 1;
    dfs(now);
    sort(ans.begin(), ans.end());
    cout << ans.size() << endl;
    for (int i = 0; i < ans.size(); i++)
    {
        cout << ans[i ]<< " ";
    }
    return (0);
}

