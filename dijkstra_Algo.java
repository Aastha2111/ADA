package march;
//27-03-21
//AASTHA-19CSU003
public class dijkstra_Algo {

	static void dijkstra(int graph[][], int src,int V,int E) 
	 { 
	    int dist[] = new int[V];  
	     for (int i = 0; i < V; ++i) 
	         dist[i] = Integer.MAX_VALUE;     // Initialize vertices as INFINITE
	     dist[src] = 0; 

	     //  Relaxing all edges |V| - 1 times.
    for (int i = 1; i < V; ++i) { 
        for (int j = 0; j < E; ++j) { //src-dest-wght 
            if (dist[graph[j][0]]!=Integer.MAX_VALUE && dist[graph[j][0]]+graph[j][2]<dist[graph[j][1]]) 
                dist[graph[j][1]]=dist[graph[j][0]]+graph[j][2]; 
        } 
	     }     		     
	    System.out.println("Vertex Distance from Source"); 
	    for (int i = 0; i < V; ++i) 
	         System.out.println(i +"\t"+ dist[i]); 
	      } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				System.out.println("AASTHA-19CSU003"); 
				System.out.println(); 
				System.out.println("Dijkstra Algorithm");
			     int V = 5; //  vertices 
			     int E = 8; // edges 
			     System.out.println("GRAPH"); 
			     int graph[][]= {{0,1,1},{0,2,-4},   //src,dest.wght
			    		 		{1,2,3},{1,3,2},
			     				  {1,4,2},{3,2,5},
			     				  {3,1,1},{4,3,3}};
			     dijkstra(graph,0,V,E);
			  
	}

}

/*---output---
 AASTHA-19CSU003

Dijkstra Algorithm
GRAPH
Vertex Distance from Source
0	0
1	1
2	-4
3	3
4	3

*/
