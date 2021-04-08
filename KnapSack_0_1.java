package march;
//17-03-2021
//aastha-19csu003
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//A Dynamic Programming--> 0-1 Knapsack problem--------//Using double dimension array
public class KnapSack_0_1 {

    static int max(int a, int b) 
    {   return (a > b) ? a : b; } 
    static int knapSack(int cap,int wt[],int Pr[])
    {
    	int n=Pr.length;    
        int k, w;
        int B[][] = new int[n+1][cap+1]; //table with row(items set),column(capacity)
        for (k=0;k<=n;k++) 
        { for (w=0;w<=cap;w++) {
              if (k==0||w==0)
                  B[k][w] = 0; //first row
              else if (wt[k-1]<= w)    // weight comparing with upper row
                  B[k][w]=max(Pr[k-1]+B[k-1][w- wt[k-1]],B[k-1][w]);
              else
                  B[k][w] = B[k-1][w];
            } }
       //table form print
        for (int i = 0; i <= n; i++) 
        { for (w = 0; w <= cap; w++) { System.out.print(B[i][w] + " "); }
            System.out.println();}
//          
//        BACKTRACING
//      int i=n;
//      w=cap;
//      	while(i>0 && w>0)
//        {
//      		if (B[i,w]!=B[i-1,w])
//      			System.out.println(i);
//      			i=i-1,k=k-wt[i]
//      		else    			
//      			i=i-1;
//        }
        return B[n][cap];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
//		        int Pr[] = new int[] {0,1,2,5,6};
//		        int wt[] = new int[] {0,2,3,4,5};
//		        int cap = 10;
		        
		        int n;
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("enter the no. of item =");
		    	n=sc.nextInt();
				 Random random = new Random();
		    	 int[] wt = new int[n]; //random
		         int[] Pr= new int[n];
		         int cap;
		        
		         System.out.println("capacity=" );
		     	cap=sc.nextInt();
		        
		         for (int i = 0; i < n; i++){
		             int randomNumber = random.nextInt(100);
		             wt[i] = randomNumber;
		         }
		         System.out.println("wght");
		         System.out.println(Arrays.toString(wt));
		         
		         for (int i = 0; i < n; i++){
		             int randomNumber = 100+random.nextInt(100);
		             Pr[i] = randomNumber;
		         }
		         System.out.println("benefit");
		         System.out.println(Arrays.toString(Pr));
		        
		        System.out.println(" maximum profit "+knapSack(cap,wt,Pr));
		    }
		}}

/*-----------output-----------
 enter the no. of item =
4
capacity=
30
wght
[96, 55, 26, 98]
benefit
[139, 193, 161, 181]
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 161 161 161 161 161 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 161 161 161 161 161 
 maximum profit 161

 */


