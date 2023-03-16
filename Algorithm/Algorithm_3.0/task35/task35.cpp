#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
vector <int> mark;
vector <vector <int> > g;
vector <int> ans;
vector <int> fin;
int flag = 0;

void    printmat(vector <int>  mat)
{
    for (int j = 0; j < mat.size(); j++)
        cout << mat[j] << " ";
    cout << "\n";
}

void    dfs(int now, int pr)
{
    if (flag == 1)
        return ;
    mark[now] = 1;
    ans.push_back(now);
    for (int j = 0; j < g[now - 1].size(); j++)
    {
        if (g[now - 1][j] == 1 && mark[j + 1] == 0)
        {
            if (pr != j + 1)
            {
                pr = now;
                dfs(j + 1, now);
            }
        }
        else if (g[now - 1][j] == 1 && mark[j + 1] == 1)
        {
            if (j + 1 != pr && now != pr)
            {
                flag = 1;
                int loop_v = j + 1; // это номер зацикленой вершины
                int a = ans.back();
                // printmat(ans);
                // cout << "j + 1 = " << j +1 << endl;
                while (a != loop_v)
                {
                    fin.push_back(a);
                    ans.pop_back();
                    a = ans.back();
                }
                fin.push_back(a);
                if (!ans.empty())
                    ans.pop_back();
                return;
            }
        }
    }
    mark[now] = 2;
    if (!ans.empty())
        ans.pop_back();
}

int main()
{
    int n;
    cin >> n;
    g.reserve(n);
    for (int i = 0; i < n; i++)
    {
        vector <int> tmp;
        tmp.reserve(n);
        for (int j = 0; j < n; j++)
        {
            int a;
            cin >> a;
            tmp.push_back(a);
        }
        g.push_back(tmp);
        tmp.clear();
    }
    mark.resize(n + 1, 0);
    for (int i = 0; i < g.size(); i++)
    {
        int now = i + 1;
        if (mark[now] == 0)
        {
            dfs(now, now);
            if (flag == 1)
                break;
        }
    }
    if (flag == 1)
    {
        cout << "YES\n";
        cout << fin.size() << endl;
        printmat(fin);
    }
    else
        cout << "NO\n";
    return (0);
}