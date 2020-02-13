public class LL<T>{
    private T val;
    private LL next;
    public LL(){}
    public LL(T k){
        this.val=k;
    }
    public void append(T l){
        if(this==null){
            this.next=new LL(l);
            return;
        }
        LL temp=this;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new LL(l);
    }
    public void print(){
        LL temp=this.next;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
