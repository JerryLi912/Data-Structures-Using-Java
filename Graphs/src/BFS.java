import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BFS {

    private int V;
    private List<Integer>[] graph;
    public int result[];

    public BFS(int v) {
        V = v;
        graph = new LinkedList[V];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        graph[u].add(0, v);
    }

    public void BFSsearch(int s) {
        boolean visited[] = new boolean[V];
        int count = 0;
        result = new int[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            count++;
            s = queue.poll();

            Iterator<Integer> i = graph[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    result[n] = 6 * count;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int q = 0; q < t; q++) {
            int n = in.nextInt();

            int m = in.nextInt();
            BFS obj = new BFS(n);
            for (int i = 0; i < m; i++) {
                obj.addEdge(in.nextInt() - 1, in.nextInt() - 1);
            }
            int s = in.nextInt();
            obj.BFSsearch(s - 1);

            for (int i = 0; i < obj.result.length; i++) {
                if (i == s - 1)
                    continue;
                if (obj.result[i] == 0)
                    System.out.print(-1 + " ");
                else
                    System.out.print(obj.result[i] + " ");
            }
        }
    }
}
