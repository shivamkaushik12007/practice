public class Solution {
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        String[] str=A.split("_");
        int[][] res=new int[B.size()][3];
        for(int i=0;i<B.size();i++){
                res[i][0]=0;
                res[i][1]=0;
                res[i][2]=i;
        }
        for(int i=0;i<B.size();i++){
            for(int j=0;j<str.length;j++){
                if(B.get(i).contains(str[j])){
                    res[i][0]+=1;
                    res[i][1]+=j;
                }
            }
        }
        ArrayList<Integer> ret=new ArrayList<>();
        
        for(int i=0;i<B.size();i++){
            for(int j=0;j<B.size();j++){
                if(res[j][0]<res[i][0]){
                    int temp1=res[i][0];
                    res[i][0]=res[j][0];
                    res[j][0]=temp1;
                    int temp2=res[i][1];
                    res[i][1]=res[j][1];
                    res[j][1]=temp2;
                    int temp3=res[i][2];
                    res[i][2]=res[j][2];
                    res[j][2]=temp3;
                }else if(res[j][0]==res[i][0]){
                    if(res[j][1]>res[i][1]){
                        int temp1=res[i][0];
                        res[i][0]=res[j][0];
                        res[j][0]=temp1;
                        int temp2=res[i][1];
                        res[i][1]=res[j][1];
                        res[j][1]=temp2;
                        int temp3=res[i][2];
                        res[i][2]=res[j][2];
                        res[j][2]=temp3;
                    }
                }
            }
        }
        for(int i=0;i<B.size();i++){
            ret.add(res[i][2]);
        }
        return ret;
    }
}
