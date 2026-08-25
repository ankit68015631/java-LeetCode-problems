import java.util.*;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] shuffle(int[] nums, int n) {
            int[] nums = new nums[2*n-1]; 
            int i =0; 
            int j = n;
            int index =0;
          while(i< n){
            nums[index++] = nums[i++];
            nums[index++] = nums[j++];
          }
        return new int[0];
    }
}