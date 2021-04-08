import java.util.Arrays;
import java.util.Random;
//30-01-21
//AASTHA-19CSU003

class DivConqSorting
{
    void merging(int arr[], int l, int mid, int h)
    {
        int n =mid-l+1; //no.of element on left side 
        int m =h-mid;   //no.of element on right hand side
        int Left[]=new int[n];
        int Rght[]=new int[m];
 
        for (int i=0;i<n;++i)
        { Left[i] = arr[l+i];}
        for (int j=0;j<m;++j)
        {  Rght[j]=arr[mid+1+j];}
 
        int i=0,j=0;
         int k=l;
        while (i<n && j<m) {
            if (Left[i]<=Rght[j]) {
                arr[k++]=Left[i++];
                }else {
                arr[k++]=Rght[j++];
                }
        } 
        while(i<n) {
            arr[k++]=Left[i++];
           }
         while (j<m) {
            arr[k++]=Rght[j++];
           }
    }
 
    int[] Mergesort(int arr[], int l, int h)
    {
        if (l < h) {
            int mid = (l + h) / 2;
            Mergesort(arr, l, mid);
            Mergesort(arr, mid + 1, h);
            merging(arr, l, mid, h);
        }
        
        return arr;
    }
 
   
    public static void main(String args[])
    {
//        int arr1[] = { 12, 11, 13, 5, 6, 7 }; //descring
//        int arr2[]= {12,78,6,90,1,4};//random
//        int arr3[]= {2,3,4,5,6,8,9};//incee
//        int arr4[]= {2,2,2,2,2,2,2};//sme
    	 System.out.println("AASTHA-19CSU003");
    	 System.out.println("");
    	
        
        Random random = new Random();
        int[] arr2 = new int[100]; //random
        int[] arr3 = new int[100]; //ascending
        int[] arr1 = new int[100];//descending
        int[] arr4 =new int[100];//same
        
        for (int i = 0; i < 100; i++){
            int randomNumber = random.nextInt(1000);
            arr2[i] = randomNumber;
        }
        
        for (int i = 0; i < 100; i++){
           arr3[i] = i;
        }

        for (int i = 100; i > 0; i--){
            arr1[100 - i] = i;
        }
        for (int i = 100; i > 0; i--){
            arr4[100 - i] = 5;
        }
        
        DivConqSorting ob = new DivConqSorting();
        
       
      long start = System.nanoTime();
        System.out.println("Descending Arrya");
        System.out.println(Arrays.toString(arr1));
             
        System.out.println("Sorted Sort  "); 
        System.out.println(Arrays.toString(ob.Mergesort(arr1, 0, arr1.length - 1)));
        System.out.println();
       
       long end = System.nanoTime();
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
        
        
        long st = System.nanoTime();
        System.out.println("Random Arrya");
        System.out.println(Arrays.toString(arr2));
       
        System.out.println("Sorted Sort  "); 
        System.out.println(Arrays.toString(ob.Mergesort(arr2, 0, arr2.length - 1)));
        System.out.println();
      long ed = System.nanoTime();
       long exe = ed - st;
        System.out.println("Execution time: " + exe + " nanoseconds");
       
       
        long s = System.nanoTime();
        System.out.println("Ascending Arrya");
        System.out.println(Arrays.toString(arr3));
       
        System.out.println("Sorted Sort  "); 
        System.out.println(Arrays.toString(ob.Mergesort(arr3, 0, arr3.length - 1)));
        System.out.println();
        long e = System.nanoTime();
        long ex = e - s;
        System.out.println("Execution time: " + ex+ " nanoseconds");
        
        
        
        long star = System.nanoTime();
	 System.out.println("same number array");
	 System.out.println(Arrays.toString(arr4));
			
	 System.out.println("Sorted Sort  "); 
	 System.out.println(Arrays.toString(ob.Mergesort(arr4, 0, arr4.length - 1)));
    long en = System.nanoTime();
        long execu = en - star;
        System.out.println("Execution time: " + execu + " nanoseconds");
       
    }
}

/*-------------OUTPUT------
 AASTHA-19CSU003

Descending Arrya
[100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Sorted Sort  
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]

Execution time: 6793100 nanoseconds
Random Arrya
[991, 607, 729, 904, 452, 238, 635, 980, 49, 613, 562, 387, 669, 752, 133, 50, 899, 962, 715, 106, 565, 667, 295, 696, 474, 440, 66, 311, 0, 982, 675, 203, 573, 330, 105, 197, 999, 168, 186, 526, 220, 302, 828, 866, 651, 67, 160, 371, 1, 26, 854, 303, 736, 869, 492, 551, 706, 944, 208, 372, 403, 316, 821, 136, 76, 172, 130, 326, 812, 567, 213, 816, 41, 354, 743, 243, 396, 665, 145, 201, 163, 458, 941, 147, 392, 919, 959, 496, 966, 398, 730, 814, 267, 910, 207, 180, 465, 696, 488, 945]
Sorted Sort  
[0, 1, 26, 41, 49, 50, 66, 67, 76, 105, 106, 130, 133, 136, 145, 147, 160, 163, 168, 172, 180, 186, 197, 201, 203, 207, 208, 213, 220, 238, 243, 267, 295, 302, 303, 311, 316, 326, 330, 354, 371, 372, 387, 392, 396, 398, 403, 440, 452, 458, 465, 474, 488, 492, 496, 526, 551, 562, 565, 567, 573, 607, 613, 635, 651, 665, 667, 669, 675, 696, 696, 706, 715, 729, 730, 736, 743, 752, 812, 814, 816, 821, 828, 854, 866, 869, 899, 904, 910, 919, 941, 944, 945, 959, 962, 966, 980, 982, 991, 999]

Execution time: 9314400 nanoseconds
Ascending Arrya
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]
Sorted Sort  
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]

Execution time: 927800 nanoseconds
same number array
[5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
Sorted Sort  
[5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
Execution time: 652600 nanoseconds

 */




