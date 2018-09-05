import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DFS {
    private int V;
    private List<Integer>[] graph;

    public DFS(int n){
        V = n;
        graph = new LinkedList[10];
        for(int i=0; i<graph.length; i++){
            graph[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int u, int v){
        graph[u].add(v);
    }

    public void DFS(int s){
        boolean visited[] = new boolean[graph.length];
        DFSrec(s, visited);
    }
    private void DFSrec(int v, boolean[] visited){
        visited[v] = true;
        System.out.println(v + " ");
        ListIterator<Integer> iterator = graph[v].listIterator();
        while(iterator.hasNext()){
            int n = iterator.next();
            if(!visited[n])
                DFSrec(n, visited);
        }
    }

    public static void main(String[]args){
        DFS graph = new DFS(3);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);

        graph.DFS(0);
    }
}
