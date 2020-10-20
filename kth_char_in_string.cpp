// C++ Program to find ith character in
// a binary string.
#include <bits/stdc++.h>
using namespace std;

// Function to store binary Representation
void binary_conversion(string &s, int m) {
	while (m) {
		int tmp = m % 2;
		s += tmp + '0';
		m = m / 2;
	}
	reverse(s.begin(), s.end());
}

// Function to find ith character
int find_character(int n, int m, int i) {

	string s;

// Function to change decimal to binary
	binary_conversion(s, m);

	string s1 = "";
	for (int x = 0; x < n; x++) {
		for (int y = 0; y < s.length(); y++) {
			if (s[y] == '1')
				s1 += "10";
			else
				s1 += "01";
		}

		s = s1;
		cout << s1 << endl;
		s1 = "";
	}
	return s[i - 1] - '0';
}

// Driver Function
int main() {
#ifndef ONLINE_JUDGE
	freopen("input1.txt", "r", stdin);
	freopen("output1.txt", "w", stdout);
#endif

	int m = 5, n = 2, i = 5;
	cout << find_character(n, m, i);
	return 0;
}
