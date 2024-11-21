class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
    	s = s.replaceAll("[^a-z0-9]", "");
    	
        return s.equals(new StringBuffer(s).reverse().toString());
    }
}