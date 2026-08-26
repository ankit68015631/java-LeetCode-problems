
import java.util.Arrays;
      
//Move all zeroes to the end of the array while maintaining the relative order of non-zero elements.



public class leetcode283 {
        public static void main(String[] args) {
            int[] nums = {0,1,0,3,12};
            movezeroes(nums);
            System.out.println(Arrays.toString(nums));
        }


        public static void movezeroes(int[] nums) {
         int nonindexzero =0;
         for(int i =0; i<nums.length; i++) {
            if(nums[i]!= 0){
            nums[nonindexzero] = nums[i];
            nonindexzero++;
            }
         }
        
        for(int i = nonindexzero; i<nums.length; i++) {
            nums[i]=0;

        }
      } 
    }


    /*import java.util.Arrays;

public class leetcode283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));  // [1, 3, 12, 0, 0]
    }
    
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                // Swap non-zero element with position at nonZeroIndex
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;
                nonZeroIndex++;
            }
        }
    }
}*/