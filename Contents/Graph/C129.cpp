#include <bits/stdc++.h>

using namespace std;
char oil[100][100] = {0};
int m, n;

void dfs( int i, int j )
{
    oil[i][j] = '*';
    if( oil[i-1][j-1] == '@' )
    {
        if( i-1 >= 0 && j-1 >= 0 )
        {
            oil[i-1][j-1] = '*';
            dfs( i-1, j-1 );
        }
    }
    else if( oil[i-1][j] == '@' )
    {
        if( i-1 >= 0 )
        {
            oil[i-1][j] = '*';
            dfs( i-1, j );
        }
    }
    else if( oil[i-1][j+1] == '@' )
    {
        if( i-1 >= 0 && j+1 <= n )
        {
            oil[i-1][j+1] = '*';
            dfs( i-1, j+1 );
        }
    }
    else if( oil[i][j-1] == '@' )
    {
        if( j-1 >= 0 )
        {
            oil[i][j-1] = '*';
            dfs( i, j-1 );
        }
    }
    else if( oil[i][j+1] == '@' )
    {
        if( j+1 <= n )
        {
            oil[i][j+1] = '*';
            dfs( i, j+1 );
        }
    }
    else if( oil[i+1][j-1] == '@' )
    {
        if( i+1 <= m && j-1 >= 0 )
        {
            oil[i+1][j-1] = '*';
            dfs( i+1, j-1 );
        }
    }
    else if( oil[i+1][j] == '@' )
    {
        if( i+1 <= m )
        {
            oil[i+1][j] = '*';
            dfs( i+1, j );
        }
    }
    else if( oil[i+1][j+1] == '@' )
    {
        if( i+1 <= m && j+1 <= n )
        {
            oil[i+1][j+1] = '*';
            dfs( i+1, j+1 );
        }
    }
}

int main(void)
{
    while( cin >> m >> n )
    {
        int ans = 0;
        if(( m == 0 ) && ( n == 0 ))
        {
            break;
        }
        else
        {
            for( int i = 0 ; i < m ; i++ )
            {
                for(int j = 0 ; j < n ; j++ )
                {
                    cin >> oil[i][j];
                }
            }
        }
        for( int i = 0 ; i < m ; i++ )
        {
            for(int j = 0 ; j < n ; j++ )
            {
                if( oil[i][j] == '@' )
                {
                    dfs( i, j);
                    ans++;
                }
            }
        }
        cout << ans <<endl;
    }
    return 0;
}
