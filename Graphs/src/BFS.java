import java.util.*;

class BFS{
    private int v;
    private List<Integer> graph[];

    public BFS(int v){
        this.v = v;
        this.graph = new List[v];
        for(int i=0; i<v; i++){
            graph[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        graph[u].add(v);
    }

    public void BFS(int s){
        Boolean visited[] = new Boolean[v];
        for(int i=0; i<visited.length; i++){
            visited[i] = false;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);

        while(queue.size() != 0){
            int n = queue.poll();
            visited[n] = true;
            System.out.println(n + " ");
            ListIterator<Integer> iterator = graph[n].listIterator();

            while(iterator.hasNext()){
                int next = iterator.next();
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    public static void main(String[] args){
        BFS obj = new BFS(4);

        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);
        obj.addEdge(3, 3);

        obj.BFS(2);
    }
}
