// cycle in undirected graph using bfs

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
		if (x != y) {
			adjlist[y].push_back(x);
		}

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

	bool isTree() {

		unordered_map<int, bool> visited;
		unordered_map<int, int> parent;

		for (auto node : adjlist) {
			parent[node.first] = node.first;
		}


		queue<int> q;
		for (auto node : adjlist) {
			if (!visited.count(node.first)) {
				q.push(node.first);
				visited[node.first] = true;
			}

			while (!q.empty()) {
				auto node = q.front();
				q.pop();

				for (auto nbr : adjlist[node]) {
					if (visited.count(nbr) and parent[node] != nbr) {
						return false;
					} else if (!visited.count(nbr)) {
						q.push(nbr);
						visited[nbr] = true;
						parent[nbr] = node;
					}
				}
			}
		}

		return true;
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

	if (g.isTree()) {
		cout << "Yes, it is a tree.\n";
	} else {
		cout << "It is not a tree.\n";
	}

	return 0;
}