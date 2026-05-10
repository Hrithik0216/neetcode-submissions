class Solution {
    public boolean isAnagram(String s, String t) {
        char[] f = s.toCharArray(), se = t.toCharArray();
        Arrays.sort(f); Arrays.sort(se);
        return new String(f).equals(new String(se));
    }
}
