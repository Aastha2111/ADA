package march;

public class TravelSalemanProb {
	
	 private static final int V = 4; 
	static int visited[] = new int[V];
	static int cost= new int[][];
	public static int TSP(int dist[][],int N[], int s)
	{
		visited[s]=1;
		for(int k : N) {
		if((N.length=2)&&(k!=s))
			{cost=dist[s][k];  //cost(n,k)=dist[s][k]);
			return cost;}
		}
		else
			{for(int j : N)
				{for(int i : N)
					{if(visited[i]=0)
						{if(j!=i && j!=s)
						{ cost=min(TSP(dist[][],N-{i},j)+dist[j][i]));
//							{cost(n,j)=min(TSP(N-{i},j)+dist(j,i));
							visited[j]=1;}
						}
					}
				}
			}
		return cost;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = {{0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}};
			int s = 0;
			int N[]= {1,2,3,4}
			System.out.println(TSP(graph,N,s));
	}

}
