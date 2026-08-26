


//Problem: Given an array where every element appears twice except one, find that single element.
//Input: [2, 2, 1]     → Output: 1
//Input: [4, 1, 2, 1, 2] → Output: 4





/*import java.util.Arrays;
public class leetcode136 {
    public static void main(String[] args) {
       int[] arrs ={ 4, 1, 2, 1, 2};
       
    Arrays.sort(arrs);

    
  for(int i=0; i<arrs.length-1; i+=2) { 
    if(arrs[i]!=arrs[i+1]) {
      System.out.println(arrs[i]);
      return;
    }
  }
   
        System.out.println(arrs[arrs.length-1]);
            }
        }*/

      (Simple Method To Solve)
          
    public class leetcode136 {
      public static void main(String[] args) {
        int [] arrs = {4,1,2,1,2};
        int result = 0;
        for(int num : arrs) {
          result^=num;

        }
System.out.println(result);
      }
    }



    

