package march;
//AASTHA-19CSU003

//10-03-2021
import java.util.Iterator;
import java.util.LinkedList;

//directed graph using adjecy list
public class BFS_Algo {

	 private int V;  //vert
	 private LinkedList<Integer> adj[]; //Adj Lists

	 BFS_Algo(int v)//Graph
	 {
	     V = v;
	     adj = new LinkedList[v];
	     for (int i=0; i<v; ++i)
	         adj[i] = new LinkedList();
	 }
	 void addEdge(int v,int x)
	 {
	     adj[v].add(x);
	 }
	 void BFS(int s)
	 {
	      boolean vstd[] = new boolean[V]; //visited as here cycle is present toh usse avoid krne krne ke liye 
	     LinkedList<Integer> queue = new LinkedList<Integer>();
	     vstd[s]=true; //enqueue and visited
	     queue.add(s);			//queue-FIFO
	     while (queue.size()!=0)
	     {
         s=queue.poll();       //dequeue
	        System.out.print(s+" ");
	        Iterator<Integer> i= adj[s].listIterator();
	        while (i.hasNext())
	         {
	            int n=i.next();
	            if (!vstd[n])    //check for visited or not
	            {
	           	 vstd[n] = true;
	                queue.add(n);
	            }
	         }	     }
	 }
	 public static void main(String args[])
	 {
		 BFS_Algo g = new BFS_Algo(6);
		 System.out.println("AASTHA-19CSU003"); 
			System.out.println(); 
	     g.addEdge(0,1);
	     g.addEdge(0,3);
	     g.addEdge(1,2);
	     g.addEdge(1,4);
	     g.addEdge(2,4);
	     g.addEdge(2,5);
	     g.addEdge(3,1);
	     g.addEdge(4,3);
	     g.addEdge(5,5);
	     System.out.println("BFS");                   
	     g.BFS(0);
	 }
}
/*-----output--

 AASTHA-19CSU003

BFS
0 1 3 2 4 5 
 
 */











