class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for(int i:arr){
            ans = ans^i;
        }
         return ans;
          }
}