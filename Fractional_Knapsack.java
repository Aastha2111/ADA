
import java.util.*;
 
public class Fractional_Knapsack {
    
    private static double getMaxValue(int[] wt, int[] val,
                                      int capacity)
    {
        ItemValue[] iVal = new ItemValue[wt.length];
 
        for (int i = 0; i < wt.length; i++) {
            iVal[i] = new ItemValue(wt[i], val[i], i);
        }
 
        Arrays.sort(iVal, new Comparator<ItemValue>() {
            
            public int compare(ItemValue o1, ItemValue o2)
            {
                return o2.ratio.compareTo(o1.ratio);
            }
        });
 
        double totalValue = 0d;
 
        for (ItemValue i : iVal) {
 
            int curWt = (int)i.wt;
            int curVal = (int)i.val;
 
            if (capacity - curWt >= 0) {
                
                capacity = capacity - curWt;
                totalValue += curVal;
            }
            else {
                
                double fraction= ((double)capacity / (double)curWt);
                System.out.println("fraction part of element with value "+i.val+ " IS = "+fraction);
                totalValue += (curVal * fraction);
                capacity= (int)(capacity - (curWt * fraction));
                break;
            }
        }
 
        return totalValue;
    }
 
  
    static class ItemValue {
        Double ratio;
        double wt, val, ind;
 
        public ItemValue(int wt, int val, int ind)
        {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            ratio = new Double((double)val / (double)wt);
        }
    }
 
   
    public static void main(String[] args)
    {
//    	@Aastha=19csu003
    	
//    	int val[] = new int[] { 60,100,120}; 
//    	int wt[] = new int[] { 10,20,30}; 
//    	int capacity= 50; 
//    	
    	 System.out.println("AASTHA-19CSU003");
    	
    	int n;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the no. of item =");
    	n=sc.nextInt();
     	  Random random = new Random();
    	 int[] wt = new int[n]; //random
         int[] val = new int[n];
         int capacity = 60;
         System.out.println("capacity=60");
         for (int i = 0; i < n; i++){
             int randomNumber = random.nextInt(100);
             wt[i] = randomNumber;
         }
         System.out.println("wght");
         System.out.println(Arrays.toString(wt));
         
         for (int i = 0; i < n; i++){
             int randomNumber = 100+random.nextInt(100);
             val[i] = randomNumber;
         }
         System.out.println("benefit");
         System.out.println(Arrays.toString(val));
         
                 
        double maxValue = getMaxValue(wt, val, capacity);
 
        
        System.out.println("Maximum benefit obtained = "
                           + maxValue);
    }
}