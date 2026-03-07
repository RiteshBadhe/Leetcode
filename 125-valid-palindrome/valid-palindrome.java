class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
       String duplicates = new StringBuilder(s).reverse().toString();
;
        if( duplicates.equals(s)){
            return true;
        }
    return false;
    }
}