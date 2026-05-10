class InnerMap{
    private int time; private String val;
    public void setTime(int t){
        this.time = t;
    }
    public int getTime(){
        return this.time;
    }
    public void setVal(String val){
        this.val = val;
    }
    public String getVal(){
        return this.val;
    }
    
}
class TimeMap {
    private Map<String, List<InnerMap>> map;
    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<InnerMap> list = this.map.get(key);
        InnerMap newVal = new InnerMap();
        newVal.setTime(timestamp);
        newVal.setVal(value);
        if(list==null){
            List<InnerMap> newList= new ArrayList<>();
            newList.add(newVal);
            this.map.put(key, newList);
        }else{
            list.add(newVal);
        }
    }
    
    public String get(String key, int timestamp) {
        List<InnerMap> list = this.map.get(key);
        if(list==null){
            return "";
        }
        InnerMap res = binarySearch(timestamp, list);
        if(res==null){
            return "";
        }
        return res.getVal();
    }
    public InnerMap binarySearch(int t, List<InnerMap> list){
        int l = 0, r = list.size()-1;
        InnerMap res = null;
        while(l<=r){
            int mid = l+(r-l)/2;
            InnerMap m = list.get(mid);
            if(m.getTime()<=t){
                res = m;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
}
