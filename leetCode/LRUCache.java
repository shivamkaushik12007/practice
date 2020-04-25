class LRUCache {
    private int n;
    private ArrayList<Integer> arr;
    private Map<Integer,Integer> mp;
    public LRUCache(int capacity) {
        n=capacity;
        arr=new ArrayList<>();
        mp=new HashMap<>();
    }
    
    public int get(int key) {
        if(mp.get(key)==null){
            return -1;
        }
        arr.remove(new Integer(key));
        arr.add(key);
        return mp.get(key);
    }
    
    public void put(int key, int value) {
        if(arr.contains(key)){
            arr.remove(new Integer(key));
            arr.add(key);
            mp.put(key,value);
        }else{
            if(arr.size()==n){
                mp.remove(arr.get(0));
                arr.remove(0);
            }
            mp.put(key,value);
            arr.add(key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
