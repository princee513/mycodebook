#include <bits/stdc++.h>

using namespace std;

long long Mode(long long a, long long n, long long m)
{
    long long sum = 1;
    for( ; n ; n >>= 1 )
    {
        if( n & 1 )
        {
            sum = ( sum * a ) % m;
        }
        a = ( a * a ) % m;
    }
    return sum;
}

int main(void)
{
    int a, b, p, x, ans = 0;
    cin >> a >> b >> p >> x;
    for( int i = 1 ; i < x + 1 ; i++ )
    {
        int n;
        n = i % p;
        n = n * Mode( a, i, p);
        if( n % p == b % p )
        {
            ans++;
        }
    }
    cout << ans <<endl;
    return 0;
}