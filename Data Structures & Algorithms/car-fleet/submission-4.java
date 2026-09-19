class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int carFleet = position.length;
        Map<Integer, Float> map = new HashMap<>();
        for (int i = 0; i < carFleet; i++) {
            float timeToReach = (float) (target - position[i]) / speed[i];
            map.put(position[i], timeToReach);
        }
        Arrays.sort(position);
        int i = position.length - 1;
        while (i > 0) {
            float timeToReach = map.get(position[i]);
            i--;
            while (i >= 0 && timeToReach >= map.get(position[i])) {
                carFleet--;
                i--;
            }
        }
        return carFleet;
    }
}
