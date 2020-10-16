#include <bits/stdc++.h>
using namespace std;

class Graph {
	unordered_map<int, list<int>> adjlist;
public:
	Graph() {
		this->adjlist.clear();
	}

	void add(int x, int y) {
		adjlist[x].push_back(y);
		return;
	}

	void display() {
		cout << "Graph :-\n";

		for (auto node : adjlist) {
			cout << node.first << " --> ";
			for (auto nbr : node.second) {
				cout << nbr << ", ";
			}
			cout << '\n';
		}

		return;
	}

	bool cycle_dfs_helper(int src, unordered_map<int, bool> &visited, unordered_map<int, bool> &cur_path) {

		visited[src] = true;
		cur_path[src] = true;

		for (auto nbr : adjlist[src]) {
			if (visited.count(nbr) and cur_path.count(nbr) and cur_path[nbr] == true) {
				return true;
			} else if (!visited.count(nbr)) {
				if (cycle_dfs_helper(nbr, visited, cur_path)) {
					return true;
				}
			}
		}

		cur_path[src] = false;
		return false;
	}

	bool cycle_dfs() {
		unordered_map<int, bool> visited;
		unordered_map<int, bool> cur_path;

		for (auto node : adjlist) {
			if (!visited.count(node.first)) {
				if (cycle_dfs_helper(node.first, visited, cur_path)) {
					return true;
				}
			}
		}

		return false;
	}
};


int main() {

#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif

	Graph g;
	int edgeList;
	cin >> edgeList;

	while (edgeList--) {
		int x, y;
		cin >> x >> y;
		g.add(x, y);
	}

	g.display();

	if (g.cycle_dfs()) {
		cout << "Yes, it is cyclic.\n";
	} else {
		cout << "Not cyclic.\n";
	}

	return 0;
}