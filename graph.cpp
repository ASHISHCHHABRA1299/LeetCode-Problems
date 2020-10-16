#include <bits/stdc++.h>
using namespace std;

class graph {
	unordered_map<int, list<int>> adjlist;
public:
	graph() {
		this->adjlist.clear();
	}

	void add(int x, int y) {
		adjlist[x].push_back(y);

		if (x == y) {
			return;
		}

		adjlist[y].push_back(x);

		return;
	}

	void display() {
		cout << "graph :-\n";
		for (auto i : adjlist) {
			cout << i.first << " --> ";
			for (auto nbr : i.second) {
				cout << nbr << ", ";
			}
			cout << endl;
		}

		return;
	}

	void bfs(int src) {
		cout << "BFS :-\n";
		unordered_map<int, bool> visited;
		queue<int> q;

		q.push(src);
		visited[src] = true;

		while (!q.empty()) {
			int size = q.size();

			while (size--) {
				auto start = q.front();
				q.pop();

				cout << start << ", ";

				for (auto nbr : adjlist[start]) {
					if (!visited.count(nbr)) {
						q.push(nbr);
						visited[nbr] = true;
					}
				}
			}
			cout << endl;
		}

		return;
	}

	void shortest_distance(int src) {
		cout << "Shortest Distance :-\n";
		unordered_map<int, int> Distance;
		queue<int> q;

		for (auto i : adjlist) {
			Distance[i.first] = INT_MAX;
		}
		q.push(src);
		Distance[src] = 0;

		while (!q.empty()) {

			auto start = q.front();
			q.pop();

			for (auto nbr : adjlist[start]) {
				if (Distance.count(nbr) and Distance[nbr] == INT_MAX) {
					q.push(nbr);
					Distance[nbr] = Distance[start] + 1;
				}
			}
		}

		for (auto i : Distance) {
			cout << src << " --> " << i.first << " is at " << i.second << " Distance\n";
		}

		return;
	}

	void dfs_helper(int src, unordered_map<int, bool> &visited) {

		cout << src << ", ";
		visited[src] = true;

		for (auto nbr : adjlist[src]) {
			if (!visited.count(nbr)) {
				dfs_helper(nbr, visited);
			}
		}

		return;
	}

	void dfs(int src) {
		unordered_map<int, bool> visited;

		cout << "DFS :-\n";
		int component = 1;
		cout << component << " --> ";
		dfs_helper(src, visited);
		cout << endl;

		for (auto ver : adjlist) {
			if (!visited.count(ver.first)) {
				component++;
				cout << component << " --> ";
				dfs_helper(ver.first, visited);
				cout << '\n';
			}
		}

		return;
	}

};


int main() {

#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif

	graph g;
	int edgepair;
	cin >> edgepair;

	while (edgepair--) {
		int x, y;
		cin >> x >> y;
		g.add(x, y);
	}

	g.display();
	g.bfs(0);
	g.shortest_distance(0);
	g.dfs(0);

	return 0;
}