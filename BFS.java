/*Breadth first search:

Traversal means visiting all the nodes of a graph. 
Breadth First Traversal or Breadth First Search is a recursive algorithm for searching all
the vertices of a graph or tree data structure.

BFS algorithm:

->A standard BFS implementation puts each vertex of the graph into one of two categories:

    1.Visited
    2.Not Visited
    
The purpose of the algorithm is to mark each vertex as visited while avoiding cycles.

The algorithm works as follows:

1.Start by putting any one of the graph's vertices at the back of a queue.
2.Take the front item of the queue and add it to the visited list.
3.Create a list of that vertex's adjacent nodes. Add the ones which aren't in the visited list to the back of the queue.
4.Keep repeating steps 2 and 3 until the queue is empty.

The graph might have two different disconnected parts so to make sure that we cover
every vertex, we can also run the BFS algorithm on every node.


BFS Algorithm Applications:

1.To build index by search index
2.For GPS navigation
3.Path finding algorithms
4.In Ford-Fulkerson algorithm to find maximum flow in a network
5.Cycle detection in an undirected graph
6.In minimum spanning tree

Testcase:
input=
enter number of vertices and edges                                                                                      
5                                                                                                                       
6                                                                                                                       
enter edges                                                                                                             
0                                                                                                                       
1                                                                                                                       
0                                                                                                                       
2                                                                                                                       
2                                                                                                                       
3                                                                                                                       
3                                                                                                                       
4                                                                                                                       
2                                                                                                                       
4                                                                                                                       
1                                                                                                                       
4                                                                                                                       
enter source for bfs traversal                                                                                          
2      
output=
The Breadth First Traversal of the graph is as follows                                                                  
20341                                                                                                                   
                  

*/

import java.io.*;
import java.util.*;

public class Test
{
                            
    private LinkedList<Integer> adjacency[]; 
    //adjacency list

    public Test(int v)
    {
        adjacency= new LinkedList[v];
        
        for (int i=0; i<v; i++)
        {
            adjacency[i] = new LinkedList<Integer>();
        }
        
    }

 
    public void insertedge(int s,int d)
    {
        adjacency[s].add(d);   
        adjacency[d].add(s); 
       
    }
 
    public void bfs(int source)
    {

        boolean visited_nodes[] = new boolean[adjacency.length];       //initialize boolean array for holding the data
        
        int parent_nodes[]=new int[adjacency.length];
        
        Queue<Integer> q=new LinkedList<>();
        
        q.add(source);
        visited_nodes[source]=true;
        parent_nodes[source]=-1;
        System.out.println("The Breadth First Traversal of the graph is as follows");
        while (!q.isEmpty())
        {
           int p=q.poll();             //remove the top element of the queue
            System.out.print(p);           //print the top element of the queue
 
            for (int i:adjacency[p])
            {
                if (visited_nodes[i]!=true)                    //only insert nodes into queue if they have not been explored already
                {
                    visited_nodes[i] = true;
                    q.add(i);
                    parent_nodes[i]=p;
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
            int firstend=sc.nextInt();
            int secondend=sc.nextInt();
            t.insertedge(firstend,secondend);
        }
 
        System.out.println("enter source for bfs traversal");
        int source=sc.nextInt();
        t.bfs(source);
    }
}