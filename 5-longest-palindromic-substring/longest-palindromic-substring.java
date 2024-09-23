  class Solution {
     private int low, max;
     private char[] arr;
     public String longestPalindrome(String s) {
         if(s == null || s.length() == 0) return s;
         else if(s.length() == 1) return s;
         arr = s.toCharArray();
         for(int i = 0; i < arr.length - 1; i++){
             expand(i, i);
             expand(i, i + 1);
         }
         return s.substring(low, low + max);
     }
     private void expand(int low, int high){
         while(low >= 0 && high < arr.length && arr[low] == arr[high]){
             low--;
             high++;
         }
         if(this.max < high - low - 1){
             this.low = low + 1;
             this.max = high - 1 - low;
         }
     }
 }