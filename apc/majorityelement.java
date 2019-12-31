public class Solution {
//by geeks for geeks
       public HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm){ 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    public int majorityElement(final List<Integer> A) {
        if(A.size()<3){
            return A.get(0);
        }
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int k1=A.size()/2;
        for(int i=0;i<A.size();i++){
            if(mp.get(A.get(i))==null){
                mp.put(A.get(i),1);
            }else{
                int k=mp.get(A.get(i));
                k=k+1;
                mp.put(A.get(i),k);
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        Map<Integer, Integer> hm1 = sortByValue(mp);
         for (Map.Entry<Integer, Integer> en : hm1.entrySet()) { 
             a.add(en.getKey());
            // System.out.println("Key = " + en.getKey() +  
            //               ", Value = " + en.getValue()); 
        } 
        return a.get(a.size()-1);
    }
}
