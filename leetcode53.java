// Find the contiguous subarray with the largest sum

//Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]  → Output: 6
//Explanation: [4, -1, 2, 1] has the largest sum = 6

//Input: [1]                               → Output: 1
//Input: [5, 4, -1, 7, 8]                  → Output: 23


/*public class leetcode53 {
    public static void main(String[] args) {
     int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
       int Maxvalue = largestSum(nums);
       System.out.println("Output: " + Maxvalue);
    }
    public static int largestSum(int[] nums) {
        int current_sum =nums[0];
        int max_sum = nums[0];
        for(int i =1; i<nums.length; i++) {
            current_sum = Math.max(nums[i], (nums[i]+current_sum));
            max_sum = Math.max(current_sum,max_sum);
        }
        return max_sum;
    }
}/* */


public class leetcode53 {
    public static void main(String[] args) {
     int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
       int Maxvalue = largestSum(nums);
       System.out.println("Output: " + Maxvalue);

    }
public static int largestSum(int[] nums) {
    int current_sum = nums[0];
    int max_sum = nums[0];
    
    for(int i = 1; i < nums.length; i++) {
        // If current_sum becomes negative, start fresh from nums[i]
        if(current_sum < 0) {
            current_sum = nums[i];
        } else {
            current_sum += nums[i];
        }
        
        max_sum = Math.max(current_sum, max_sum);
    }
    return max_sum;
}
}