class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned);
        String reverse = sb.reverse().toString().toLowerCase();
        int i = 0, j = cleaned.length()-1;
        while(i<=j){
            if(cleaned.charAt(i)!=reverse.charAt(i)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
