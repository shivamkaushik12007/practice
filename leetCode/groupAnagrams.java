class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr=new ArrayList<>();
        List<String> check=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            if(!check.contains(strs[i])){
                List<String> temp=new ArrayList<>();
                // check.add(strs[i]);
                String s=strs[i];
                for(int j=i;j<strs.length;j++){
                    String p=strs[j];
                    if(s.equals(p)){
                        temp.add(p);
                        check.add(p);
                    }else if(s.length()==p.length()){
                        for(int k=0;k<s.length();k++){
                            int lmn=p.indexOf(s.charAt(k));
                            if(lmn==-1){
                                break;
                            }else if(lmn==0){
                                p=p.substring(1,p.length());
                            }else if(lmn==p.length()-1){
                                p=p.substring(0,p.length()-1);
                            }else{
                                p=p.substring(0,lmn)+p.substring(lmn+1,p.length());
                            }
                        }
                        if(p.length()==0){
                            temp.add(strs[j]);
                            check.add(strs[j]);
                        }
                    }
                }
                arr.add(temp);
            }
        }
        return arr;
    }
}
