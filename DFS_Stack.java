/*
Iterative Implementation of DFS
The non-recursive implementation of DFS is similar to the non-recursive implementation of BFS but differs from it in two ways:

It uses a stack instead of a queue.
The DFS should mark discovered only after popping the vertex, not before pushing it.
It uses a reverse iterator instead of an iterator to produce the same results as recursive DFS.

The time complexity of DFS traversal is O(V + E), where V and E are the total number of vertices and edges in the graph, respectively. 
Please note that O(E) may vary between O(1) and O(V2), depending on how dense the graph is.

The space complexity is the maximum size of the stack at any point of time. 
Since this can extend to V slots for a linear graph, the maximum space complexity is O(V).

input=
enter number of vertices and edges
6
6
enter edges
0
1
0
2
1
3
2
3
3
4
3
5
enter source for DFS traversal
0
output=
Following is Depth First Traversal:
0 2 3 5 4 1

*/
import java.util.*; 
  

 class Test 
    { 
        int V;                                          //number of nodes
          
        LinkedList<Integer>[] adj;                      //adjacency list
          
        Test(int V) 
        { 
            this.V = V; 
            adj = new LinkedList[V]; 
              
            for (int i = 0; i < adj.length; i++) 
                adj[i] = new LinkedList<Integer>(); 
              
        } 
          
        void addEdge(int v, int w) 
        { 
            adj[v].add(w);                              //adding an edge to the adjacency list (edges are bidirectional in this example)
        } 
          
        void DFS(int n) 
        { 
            boolean nodes[] = new boolean[V]; 
      
            Stack<Integer> stack = new Stack<>(); 
              
            stack.push(n);                                    //push root node to the stack
            int a = 0;
              
            while(!stack.empty()) 
            { 
                n = stack.peek();                       //extract the top element of the stack
                stack.pop();                            //remove the top element from the stack
                  
                if(nodes[n] == false) 
                { 
                    System.out.print(n + " "); 
                    nodes[n] = true; 
                } 
                  
                for (int i = 0; i < adj[n].size(); i++)  //iterate through the linked list and then propagate to the next few nodes
            {
                a = adj[n].get(i);
                if (!nodes[a])                    //only push those nodes to the stack which aren't in it already
                {
                    stack.push(a);                          //push the top element to the stack
                }
            }  
                  
            } 
        } 
  public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
        System.out.println("enter number of vertices and edges");
        
        int v=sc.nextInt();
        int e=sc.nextInt();
        
        Test  t  = new Test(v);
        System.out.println("enter edges");
        for(int i=0;i<e;i++)
        {
            int end1=sc.nextInt();
            int end2=sc.nextInt();
            t.addEdge(end1,end2);
        }
 
        System.out.println("enter source for DFS traversal");
        int source=sc.nextInt();
        System.out.println("Following is Depth First Traversal: ");
 
        t.DFS(source);
    }
            

}