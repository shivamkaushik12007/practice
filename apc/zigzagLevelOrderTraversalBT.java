public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        ArrayList<TreeNode> fir=new ArrayList<>();
        ArrayList<TreeNode> sec=new ArrayList<>();
        fir.add(A);
        while(!fir.isEmpty()||!sec.isEmpty()){
            // System.out.println(fir.get(0).val+" "+A.val);
            ArrayList<Integer> test=new ArrayList<>();
            for(int i=0;i<fir.size();i++){
                test.add(fir.get(i).val);
                if(fir.get(i).left!=null)
                    sec.add(fir.get(i).left);
                if(fir.get(i).right!=null)
                    sec.add(fir.get(i).right);
            }
            ArrayList<Integer> dumb=new ArrayList<>();
            for(int i=0;i<test.size();i++){
                dumb.add(test.get(i));
            }
             if(!test.isEmpty())
                res.add(dumb);
            test.clear();
            fir.clear();
            for(int i=0;i<sec.size();i++){
                test.add(sec.get(i).val);
                if(sec.get(i).left!=null)
                    fir.add(sec.get(i).left);
                if(sec.get(i).right!=null)
                    fir.add(sec.get(i).right);
            }
            ArrayList<Integer> bumb=new ArrayList<>();
            for(int i=test.size()-1;i>=0;i--){
                bumb.add(test.get(i));
            }
            // for(int i=0;i<test.size();i++){
            //     System.out.print(test.get(i)+" ");
            // }
             if(!test.isEmpty())
                res.add(bumb);
            test.clear();
            sec.clear();
            // System.out.println();
        }
        // for(int i=0;i<res.size();i++){
        //     for(int j=0;j<res.get(i).size();j++){
        //         System.out.print(res.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }
        return res;
    }
}
