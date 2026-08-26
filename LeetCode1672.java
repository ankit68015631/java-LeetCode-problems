

   public  class LeetCode1672 {
   }

   public static void main(String[] var0) {
      int[][] var1 = new int[][]{{1, 2, 3}, {3, 2, 1}};
      int var2 = maximumWealth(var1);
      System.out.println(var2);
   }

   
    public static int maximumWealth(int[][] accounts) {
    int maxWealth = 0;
    
    for(int i = 0; i < accounts.length; i++) {
        int sum = 0;
        for(int j = 0; j < accounts[i].length; j++) {
            sum += accounts[i][j];
        }
        maxWealth = Math.max(maxWealth, sum);
    }
    
    return maxWealth;
}
   

