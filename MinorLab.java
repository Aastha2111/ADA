package march;

import java.util.Scanner;

//JSMJ
public class MinorLab {

 //	Write a function to generate all possible combination of 10 given characters.
	static void combination(char[] arr, int l)
	{

        for(int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
                for(int k=0; k<l; k++)
                {
                	for(int m=0; m<l; m++)
                	{
                		for(int n=0;n<l;n++)
                		{
                	if(i!=j && j!=k && k!=m && m!=n)// to avoid the combination having all the same elements.
                								//aaaa,bbbb,cccc,dddd,
                    {System.out.print(arr[i]);
                    System.out.print(arr[j]);
                    System.out.print(arr[k]);
                    System.out.print(arr[m]);
                    System.out.println(arr[n]);}
                		}
                	}
                }
            }
        }
		int i = 0,j = 0,k = 0;
		while(i<l || j<l || k<l)
		{
			if(i!=j && j!=k)// to avoid the combination having all the same elements.
				//aaaa,bbbb,cccc,dddd,
			{System.out.print(arr[i]);
			System.out.print(arr[j]);
			System.out.print(arr[k]);
			}
			i++;j++;k++;
			
		}
//	 static void loop(int i, int j, int k) {        
//			if(i!=j && j!=k)// to avoid the combination having all the same elements.
////				//aaaa,bbbb,cccc,dddd,
//			{System.out.print(arr[i]);
//			System.out.print(arr[j]);
//			System.out.print(arr[k]);
//			}
//		    // advance states
//		    k++;
//		    if (k == x) { k = 0; j++; }
//		    if (j == x) { j = 0; i++; }
//		    if (i == x) { i = 0; }
//
//		    // terminate on all wrap-around
//		    if (i == 0 && j == 0 && k == 0) { return; }
//
//		    // recurse
//		    loop(i, j, k);
//		}
//		
//        
        
        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		//19csu003
		 Scanner sc = new Scanner(System.in);
	      System.out.println("ABCDEFGHIJ");
	      char[] a = new char[5];  
	      System.out.println("Enter the elements of the array: ");  
	      for(int i=0; i<3; i++)  
	      {  
	    	  System.out.println("Enter"+i +"the elements of the array: ");  
	       
	      a[i]=sc.next().charAt(0);  
	      }  
	      System.out.println("Elements = combi");
	      int len=a.length;
	      combination(a,len);
	      
	      
	}}


