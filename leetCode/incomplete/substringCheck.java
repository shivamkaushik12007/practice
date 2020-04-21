class Solution {
    List<Integer> res=new ArrayList<Integer>();
    public List<Integer> findSubstring(String s, String[] words) {
        for(int i=0;i<words.length;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            arr.add(i);
            check(words[i],arr,words,s);
        }
        Collections.sort(res);
        return res;
    }
    public void check(String s,ArrayList<Integer> arr,String[] words,String ch){
        if(arr.size()==words.length){
            int l=0;
            while(l!=-1){
                l=ch.indexOf(s,l);
                if(l!=-1&&!res.contains(l)){
                    res.add(l);
                }
            }
            return;
        }
        
        for(int i=0;i<words.length;i++){
            if(!arr.contains(i)){
                ArrayList<Integer> temp=new ArrayList<>(arr);
                temp.add(i);
                String s1=s+words[i];
                check(s1,temp,words,ch);
            }
        }
        return;
    }
}
