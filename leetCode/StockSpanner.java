class StockSpanner {
    ArrayList<Integer> arr;
    Stack<Integer> ss;
    public StockSpanner() {
        arr=new ArrayList<Integer>();
        ss=new Stack<Integer>();
    }
    
    public int next(int price) {
        while(!ss.isEmpty()&&arr.get(ss.peek())<=price){
            ss.pop();
        }
        if(ss.isEmpty()){
            ss.push(arr.size());
            arr.add(price);
            return arr.size();
        }else{
            int t=ss.peek();
            ss.push(arr.size());
            arr.add(price);
            return arr.size()-t-1;
        }
    }
}
