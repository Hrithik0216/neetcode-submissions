class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            if(map.containsKey(new String(s))){
                map.get(new String(s)).add(strs[i]);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(new String(s),newList);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
