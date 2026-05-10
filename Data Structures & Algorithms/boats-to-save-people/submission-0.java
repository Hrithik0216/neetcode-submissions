class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0, j=people.length-1, res = 0;
        while(j>=i){
            System.out.println("i: "+i+" j: "+j);
            if(people[i]+people[j]<=limit){
                i++; j--; res++;
            }else{
                j--;res++;
            }
        }
        return res;
    }
}