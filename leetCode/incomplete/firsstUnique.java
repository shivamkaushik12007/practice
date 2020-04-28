class FirstUnique {
    ArrayList<Integer> unique;
    ArrayList<Integer> nonUnique;
    public FirstUnique(int[] nums) {
        unique=new ArrayList<>();
        nonUnique=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!nonUnique.contains(nums[i])){
                if(!unique.contains(nums[i])){
                    unique.add(nums[i]);
                }else{
                    nonUnique.add(nums[i]);
                    unique.remove(new Integer(nums[i]));
                }
            }
        }
    }
    
    public int showFirstUnique() {
        if(unique.size()>0){
            return unique.get(0);
        }        
        return -1;
    }
    
    public void add(int value) {
        if(!nonUnique.contains(value)){
                if(!unique.contains(value)){
                    unique.add(value);
                }else{
                    nonUnique.add(value);
                    unique.remove(new Integer(value));
                }
        }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
