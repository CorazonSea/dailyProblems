class Solution {
    int m=0,n=0;
    public String longestPalindrome(String s) {
         if (s.length() == 1){
			 return s;
		 }
		 for(int i=0;i<s.length()-1;i++){
			 findLongestStr(s,i,i);
			 findLongestStr(s,i,i+1);
		 }
		 if (m >= s.length()){
			 return s.substring(n);
		 }
	     return s.substring(n, m);   
    }
    
    private void findLongestStr(String s, int left, int right){
		 while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
			 left--;
			 right++;
		 }
		 if(m-n < right-left-1){				 
			 m = right;
			 n = left+1;
		 }		
	 }
}
