public class level{
  public void check(Tree<Integer> root,id){
    root.data=id;
    int id1=id+1;
    for(Tree<Integer> v:root.children){
      check(v,id1);
     }
  }
  public void level(Tree<Integer> root){
    check(rott,0);
  }
}
