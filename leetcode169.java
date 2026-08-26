//Find the element that appears more than n/2 times in an array.
//Input: [3, 2, 3]                → Output: 3
//Input: [2, 2, 1, 1, 1, 2, 2]   → Output: 2


import java.util.Arrays;
public class leetcode169 {
    public static void main(String[] args) {
     int[] nums = {2,2,1,1,1,2,2};
     Arrays.sort(nums);
    
     int result = nums[nums.length/2];
     System.out.println(result);
        }

       
    }




       
    




