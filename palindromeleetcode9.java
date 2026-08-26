//Check if a number is a palindrome (reads the same forward and backward)
//Input: 121   → Output: true  (121 reversed is 121)
//Input: -121  → Output: false (negative numbers are not palindromes)
//Input: 10    → Output: false (10 reversed is 01 = 1)





public class palindromeleetcode9 {
    public static void main(String[] args) {
        int num = 121;
String str = String.valueOf(num);
        boolean isPalindrome = true;
for(int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if(str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;  // No need to check further
            }
        }
        
        System.out.println("Output: " + isPalindrome);        
    }
}
