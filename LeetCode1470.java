import java.util.*;

public class LeetCode1470 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] shuffle(int[] nums, int n) {
            int[] result = new int[2*n]; 
            int i =0; 
            int j = n;
            int index =0;
          while(i< n){
            result[index++] = nums[i++];
            result[index++] = nums[j++];
          }
        return result;
    }
}