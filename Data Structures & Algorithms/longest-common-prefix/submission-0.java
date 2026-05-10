class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcp = strs[0];
      for(int i=0; i<strs.length; i++){
        while(!strs[i].startsWith(lcp)){
            lcp = lcp.substring(0,lcp.length()-1);
        }
      }  
      return lcp;
    }
}