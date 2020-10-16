#include <bits/stdc++.h>
using namespace std;

template <typename T>
class Graph {
	unordered_map<T, list<pair<T, int>>> adjlist;
public:
	Graph() {
		this->adjlist.clear();
	}

	void add(T x, T y, int wt, bool bidr = false) {
		adjlist[x].push_back({y, wt});
		if (bidr) {
			adjlist[y].push_back({x, wt});
		}
		return;
	}

	void display() {
		cout << "Graph :-\n";
		for (auto node : adjlist) {
			cout << node.first << " --> ";
			for (auto nbr : node.second) {
				cout << '(' << nbr.first << "," << nbr.second << "), ";
			}
			cout << '\n';
		}
		return;
	}

	// single source shortest path
	void djkstra_ShortestPath(T src) {
		unordered_map<T, int> distance;
		for (auto node : adjlist) {
			distance[node.first] = INT_MAX;
		}

		distance[src] = 0;
		set<pair<int, T>> ordering;
		ordering.insert({0, src});

		while (!ordering.empty()) {
			auto cur = *(ordering.begin());

			T node = cur.second;
			int dist = cur.first;
			ordering.erase(ordering.begin());

			for (auto nbr : adjlist[node]) {
				if (distance[nbr.first] > nbr.second + dist) {
					auto present = ordering.find({distance[nbr.first], nbr.first});

					if (present != ordering.end()) {
						ordering.erase(present);
					}

					distance[nbr.first] = nbr.second + dist;
					ordering.insert({distance[nbr.first], nbr.first});
				}
			}
		}

		cout << "shortest from " << src << " is :-\n";
		for (auto d : distance) {
			cout << d.first << " --> " << d.second << '\n';
		}

		return;
	}
};


int main() {

#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif

	/*
		Graph<int> g;

		g.add(1, 2, 1, true);
		g.add(1, 3, 4, true);
		g.add(1, 4, 7, true);
		g.add(2, 3, 1, true);
		g.add(3, 4, 2, true);

		g.display();

		g.djkstra_ShortestPath(1);

	*/

	Graph<string> g;

	g.add("Amritsar", "Delhi", 1, true);
	g.add("Amritsar", "Jaipur", 4, true);
	g.add("Delhi", "Jaipur", 2, true);
	g.add("Jaipur", "Mumbai", 8, true);
	g.add("Delhi", "Agra", 1, true);
	g.add("Agra", "Bhopal", 2, true);
	g.add("Bhopal", "Mumbai", 3, true);

	g.display();

	g.djkstra_ShortestPath("Delhi");
	return 0;
}