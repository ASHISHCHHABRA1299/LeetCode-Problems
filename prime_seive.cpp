#include <bits/stdc++.h>
using namespace std;

void primeSieve(int prime[], int n){

	for (int i = 3; i <= n; i+=2){
		prime[i] = 1;
	}

	for (int i = 3; i*i <= n; i+=2){
		
		if (prime[i]){
			for (int j = i*i; j <= n; j += i){
				prime[j] = 0;
			}
		}

	}

	return;
}

int main(int argc, char const *argv[])
{
	int n;
	cin>>n;

    int prime[1000000] = {0};
    prime[2] = 1;
	primeSieve(prime, n);

	for (int i = 2; i <= n; ++i){
		if (prime[i]){
			cout<<i<<" ";
		}
	}
	cout<<endl;
	return 0;
}