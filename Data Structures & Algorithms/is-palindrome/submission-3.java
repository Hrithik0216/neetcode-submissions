class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l =0, r = ss.length()-1;
        while(l<r){
            System.out.println("ss.charAt(l): "+ss.charAt(l)+ "ss.charAt(r): "+ss.charAt(r));
            if(ss.charAt(l)!=ss.charAt(r)){
                return false;
            }
            l++; r--;
        }
        return true;
    }
}
