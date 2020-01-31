 public static List<Integer> cutBamboo(List<Integer> lengths) {
    // Write your code here
    List<Integer> arr=new ArrayList<Integer>();
        while(lengths.size()>0){
            arr.add(lengths.size());
            int min=mini(lengths);
            cutIt(lengths,min);
        }
    return arr;
    }
    public static int mini(List<Integer> arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<min)
                min=arr.get(i);
        }
        return min;
    }
    public static void cutIt(List<Integer> arr,int x){
        int v=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==x);
                v++;
        }
        for(int i=0;i<v;i++){
            arr.remove(new Integer(x));
        }
        arr.remove(new Integer(x));
        for(int i=0;i<arr.size();i++){
            arr.set(i,arr.get(i)-x);
        }
    }
