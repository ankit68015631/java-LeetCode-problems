
/*public class LeetCode1512 {
 
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
       int[] nums1 = { 2, 3, 5, 1, 4};
        int result = numIdenticalPairs(nums);
        int result1 = numIdenticalPairs1(nums1);
        System.out.println(result);
         System.out.println(result1);
    }
     

  public static int numIdenticalPairs(int[] nums) {
         int count = 0;
         for(int i = 0; i<nums.length-1; i++){
            for(int j = i +1;j<nums.length; j++){
                if(nums[i]==nums[j]){
                   count++;
                }
            }
        }
        return count;
    }
 public static int numIdenticalPairs1(int[] nums1) {
         int count1 = 0;
         for(int i = 0; i<nums1.length-1; i++){
            for(int j = i +1;j<nums1.length; j++){
                if(nums1[i]==nums1[j]){
                   count1++;
                }
            }
        }
        return count1;
    }
}*/





public class LeetCode1512 {
 
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int[] nums1 = {2, 3, 5, 1, 4};
        
        int result = numIdenticalPairs(nums);   // ✅ Reuse method
        int result1 = numIdenticalPairs(nums1); // ✅ Reuse method
        
        System.out.println("Result 1: " + result);
        System.out.println("Result 2: " + result1);
    }
     
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}



