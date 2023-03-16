#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void    printmat(vector <int>  mat)
{
    for (int j = mat.size() - 1; j >= 0; j--)
        cout << mat[j] << " ";
    cout << "\n";
}

int main()
{
    int n;
    cin >> n;
    vector <vector <int> > in;
    in.reserve(n);
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
        in.push_back(tmp);
        tmp.clear();
    }
    int v1,v2;
    cin >> v1 >> v2;
    vector <int> v;
    v.resize(n + 1 , -1);
    int now = v1;
    v[now]= 0;
    vector <int> queue;
    vector <int > prev;
    prev.resize(n + 1 , 0);
    queue.reserve(n);
    queue.push_back(v1);
    prev[now] = -1;
    while (now != v2 && queue.size() != 0)
    {
        queue.erase(queue.begin());
        for (int j = 0; j < in[now - 1].size(); j++)
        {
            if (in[now - 1][j] == 1)
            {   
                if (v[j + 1] == -1 || v[j + 1] > v[now] + 1)
                {
                    queue.push_back(j + 1);
                    v[j + 1] = v[now] + 1;
                    prev[j + 1] = now;

                }
            }
        }
        now = queue.front();
    }
    cout << v[v2] << endl;
    if (v[v2] != -1 && v[v2] != 0)
    {
          vector < int > ans;
        ans.reserve(n);
        int i = v2;
        ans.push_back(v2);
        while (prev[i] != -1)
        {
            ans.push_back(prev[i]);
            i = prev[i];
        }
        printmat(ans);
    }
    return (0);
}