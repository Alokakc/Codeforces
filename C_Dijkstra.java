import java.util.*;

public class C_Dijkstra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = input.nextInt();
            int v = input.nextInt();
            int weight = input.nextInt();
            adj.get(u).add(new Pair(v, weight));
            adj.get(v).add(new Pair(u, weight));
        }

        int[] dist = new int[n + 1];
        int[] path = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        Arrays.fill(path, -1);

        PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
        pq.add(new Pair(1, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int currNode = curr.node;
            int currWeight = curr.weight;

            if (currWeight > dist[currNode]) {
                continue;
            }

            for (Pair neighbor : adj.get(currNode)) {
                int neighborNode = neighbor.node;
                int weight = neighbor.weight;

                if (dist[neighborNode] > dist[currNode] + weight) {
                    dist[neighborNode] = dist[currNode] + weight;
                    path[neighborNode] = currNode;
                    pq.add(new Pair(neighborNode, dist[neighborNode]));
                }
            }
        }

        if (dist[n] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            List<Integer> resultPath = new ArrayList<>();
            for (int at = n; at != -1; at = path[at]) {
                resultPath.add(at);
            }
            Collections.reverse(resultPath);
            for (int node : resultPath) {
                System.out.print(node + " ");
            }
        }
    }
}

class Pair {
    int node;
    int weight;
    public Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

class PairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair p1, Pair p2) {
        return Integer.compare(p1.weight, p2.weight);
    }
}
