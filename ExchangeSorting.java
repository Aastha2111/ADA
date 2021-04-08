import java.util.Arrays;
//23-01-21
//AASTHA-19CSU003

public class ExchangeSorting {
	
int[] Bubblesort(int arr[])
{
	int i,j,temp=0;
	for(i=0;i<4;i++)
	{
    	for(j=0;j<4;j++)
		{
		if(arr[j]>arr[j+1])    // <(reverse condition) to get the decreasing order
		{
		temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;
		}
		}
		}
		return arr;
	}
	
	int[] Selectionsort(int arr[]) 
    { 
      
     for (int i=0; i<4;i++) 
      { 
       int min = i; 
       for (int j = i+1; j<5; j++) 
       {    if (arr[j]<arr[min]) // reverse the sign to get the reverse order output
               min = j; }
  
        int temp = arr[min]; 
        arr[min] = arr[i]; 
        arr[i] = temp; 
        }
     
        return arr;
        }
	
	int[] insertionSort(int arr[]) {  
       
        for (int j=1;j<5;j++) {  
         int key = arr[j];  
         int i = j-1;  
         while (( i>-1)&&(arr[i]>key)){     //(arr[i]<key) reverse the condition to get revese output 
          arr [i+1] = arr[i];  
          i--;  
          }  
          arr[i+1] = key;  
        }
        
        return arr;
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("AASTHA-19CSU003");
		 System.out.println("");
		

		ExchangeSorting ob = new ExchangeSorting(); 
	        int arr[] = {64,25,12,22,11}; 
	        
	        System.out.println("Selection Sort  "); 
	        System.out.println(Arrays.toString(ob.Selectionsort(arr)));
	        
	        
	        System.out.println("Bubble Sort  "); 
	        System.out.println(Arrays.toString(ob.Bubblesort(arr)));
	        

	        System.out.println("INSERTION Sort  "); 
	        System.out.println(Arrays.toString(ob.insertionSort(arr)));
   

	}

}
/*-----------OUTPUT----------
 *AASTHA-19CSU003

Selection Sort  
[11, 12, 22, 25, 64]
Bubble Sort  
[11, 12, 22, 25, 64]
INSERTION Sort  
[11, 12, 22, 25, 64]

 
 */
