public class Solution {
    Map<Integer,Integer> mp=new HashMap<>();
    ArrayList<Integer> arr=new ArrayList<>();
    int size;
    public Solution(int capacity) {
        this.size=capacity;
    }
    
    public int get(int key) {
        if(mp.get(key)==null)
            return -1;
        if(arr.contains(key)){
            arr.remove(new Integer(key));
        }
        arr.add(key);
        return mp.get(key);
    }
    
    public void set(int key, int value) {
        if(mp.get(key)!=null){
            // arr.remove(new Integer(key));
            // arr.add(key);
            mp.put(key,value);
        }else if(mp.size()!=this.size&&mp.get(key)==null){
            mp.put(key,value);
            // arr.add(key);
        }else if(mp.size()==this.size&&mp.get(key)==null){
            mp.remove(arr.get(0));
            mp.put(key,value);
            arr.remove(0);
            // arr.add(key);
        }
        
    }
}
