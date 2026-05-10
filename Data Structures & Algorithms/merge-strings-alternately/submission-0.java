class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        StringBuffer bf = new StringBuffer();
        while(i<word1.length() && j<word2.length()){
            bf.append(word1.charAt(i));
            bf.append(word2.charAt(j));
            i++; j++;
        }
        if(i==word1.length() && j<word2.length()){
            while(j<word2.length()){
                bf.append(word2.charAt(j));
                j++;
            }
        }
        if(j==word2.length() && i<word1.length()){
            while(i<word1.length()){
                bf.append(word1.charAt(i));
                i++;
            }
        }
        return bf.toString();
        
    }
}