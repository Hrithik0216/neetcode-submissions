class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Float> map = new HashMap<>();
        int totalFleets = position.length;
        for(int i=0;i<position.length;i++){
            map.put(position[i], (((float)target-position[i])/speed[i]));
        }
        Arrays.sort(position);
        int i =position.length-1;
        while(i>0){
            float currTime = map.get(position[i]);
            i--;
            while(i>=0 && (float)map.get(position[i])<=currTime){
                i--;
                totalFleets--;
            }
        }
        return totalFleets;
    }
}
