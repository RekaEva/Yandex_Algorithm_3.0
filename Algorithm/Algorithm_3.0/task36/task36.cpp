#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

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
    }
    int v1,v2;
    cin >> v1 >> v2;
    vector <int> v;
    v.resize(n + 1 , -1);
    int now = v1;
    v[now]= 0;
    vector <int> queue;
    queue.reserve(n);
    queue.push_back(v1);
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
                }
            }
        }
        now = queue.front();
    }
    cout << v[v2] << endl;
    return (0);
}