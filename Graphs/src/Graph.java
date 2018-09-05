import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Graph {
    public List<Edge> graph[];

    public Graph(int n) {
        graph = new LinkedList[n];
        for (int i = 0; i < graph.length; i++){
            graph[i] = new LinkedList<Edge>();
        }
    }

    public void addEdge(int u, int v, int w){
        // 0 to add at the beginning of linked list as complexity is less
        graph[u].add(0, new Edge(v, w));
    }

    public boolean isConnected(int u, int v){
        ListIterator<Edge> iterator = graph[u].listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getV() == v)
                return true;
        }
        return false;
    }

    public void DFS(int s){
        boolean value[] = new boolean[graph.length];
        DFSrec(s, value);
    }

    private void DFSrec(int v, boolean visited[]){
        visited[v] = true;
        System.out.println(v+" ");
        ListIterator<Edge> iterator = graph[v].listIterator();

        while(iterator.hasNext()){
            Edge e = iterator.next();
            if(!visited[e.getV()])
                DFSrec(e.getV(), visited);
        }
    }

    public void printList(){
        for(int i = 0; i < graph.length; i++){
            ListIterator<Edge> iterator = graph[i].listIterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next()+" -> ");
            }
            System.out.print(" null");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(int i=0; i<graph.length; i++){
            s += i + " -> " + graph[i] + "\n";
        }
        return s;
    }
}
