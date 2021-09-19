#include <bits/stdc++.h>

using namespace std;

int main()
{
    int num, flag = 1;
    cin >> num;
    while( num > 0 )
    {
        int n, ans = 0;
        char map[100][100] = {0};
        cin >> n;
        for( int i = 0 ; i < n ; i++ )
        {
            for(int j = 0 ; j < n ; j++ )
            {
                cin >> map[i][j];
            }
        }
        for( int i = 0 ; i < n ; i++ )
        {
            for(int j = 0 ; j < n ; j++ )
            {
                if( map[i][j] == 'x' )
                {
                    ans++;
                }
            }
        }
        cout << "Case " << flag << ": " << ans <<endl;
        num--;
        flag++;
    }
    return 0;
}
