//AASTHA-19CSU003
//27-02-2020
public class DijkastraMethod {

		static final int V = 5; //NO.OF VERTICES
		int minDist(int dist[], Boolean shortpathtr[]) 
		{ 
			int min = Integer.MAX_VALUE, index = -1; //min-index
			for (int v = 0; v < V; v++) 
				if (shortpathtr[v] == false && dist[v] <= min) { 
					min = dist[v]; 
					index = v; 
				} 

			return index; 
		} 

		void dijkstra(int gr[][], int src) 
		{ 
			int dist[] = new int[V];// shortest distance of all vertices from the source

			Boolean shortpathtr[] = new Boolean[V]; //shortest path tree
			for (int i = 0; i < V; i++) { 
				dist[i] = Integer.MAX_VALUE; 
				shortpathtr[i] = false; 
			} 

			dist[src] = 0; 
			for (int count = 0; count < V - 1; count++) { 			
				int u = minDist(dist, shortpathtr); 
				shortpathtr[u] = true;       //include in shortest path
				for (int v = 0; v < V; v++) 
				if (!shortpathtr[v] && gr[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + gr[u][v] < dist[v]) 
						dist[v] = dist[u] + gr[u][v]; 
			} 

		System.out.println("Vertex \t\t Distance from Source"); 
			for (int i = 0; i < V; i++) 
				System.out.println(i + " \t " + dist[i]); 
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ 
			 System.out.println("AASTHA-19CSU003");
			 System.out.println("");
			 System.out.println("DIJKSTRA ALGO");
			int gr[][] = new int[][] {{0,1,4,0,0},{0,0,3,2,2},{0,0,0,0,0},{0,1,5,0,0},{0,0,0,3,0}}; 
		DijkastraMethod t = new DijkastraMethod(); 
			t.dijkstra(gr, 0); 
		} 
	}

}



/*						ANSWER IS VERIFIED FROM BELLMANFORT ALGO
AASTHA-19CSU003

DIJKSTRA ALGO
Vertex 		 Distance from source
0 		 0
1 		 1
2 		 4
3 		 3
4 		 3
*/
