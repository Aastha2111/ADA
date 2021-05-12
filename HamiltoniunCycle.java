package march;

//28-04-21
//19csu003-aastha

public class HamiltoniunCycle {
static class HamiltonianCycle
{
 final int V = 5;
 int path[];
 boolean isSafe(int v, int graph[][], int path[], int pos)
 {
     if (graph[path[pos - 1]][v] == 0)
         return false;  
     for (int i = 0; i < pos; i++)
         if (path[i] == v)
             return false;

     return true;
 }

 boolean hamCycleUtil(int graph[][], int path[], int pos)
 {
     
     if (pos == V)
     {        
         if (graph[path[pos - 1]][path[0]] == 1)
             return true;
         else
             return false;
     }

     for (int v = 1; v < V; v++)
     {
         if (isSafe(v, graph, path, pos))
         {
             path[pos] = v;          
             if (hamCycleUtil(graph, path, pos + 1) == true)
                 return true;         
             path[pos] = -1;
         }
     }
     return false;
 }


 int hamCycle(int graph[][])
 {
     path = new int[V];
     for (int i = 0; i < V; i++)
         path[i] = -1;

     path[0] = 0;
     if (hamCycleUtil(graph, path, 1) == false)
     {
         System.out.println("\n solution does not exist of this graph");
         return 0;
     }
     else
     {System.out.println("Hamiltonian Cycle");
		for (int i = 0; i < V; i++)
		System.out.print(" " + path[i] + " ");
		System.out.println(" " + path[0] + " ");
		     return 1;}
 }

	
	public static void main(String args[])
	 {
	     HamiltonianCycle hamiltonian = new HamiltonianCycle();
	     System.out.println("aastha-19csu003");
	     System.out.println("28-04-21");
	     int graph1[][] = {{0, 1, 0, 1, 0},
	         {1, 0, 1, 1, 1},
	         {0, 1, 0, 0, 1},
	         {1, 1, 0, 0, 1},
	         {0, 1, 1, 1, 0},
	     };	    
	     hamiltonian.hamCycle(graph1);
	     System.out.println("GRAPH -1");
	    
	     int graph2[][] = {{0, 1, 0, 1, 0},
	         {1, 0, 1, 1, 1},
	         {0, 1, 0, 0, 1},
	         {1, 1, 0, 0, 0},
	         {0, 1, 1, 0, 0},
	     };
	     hamiltonian.hamCycle(graph2);
	 }
}}

