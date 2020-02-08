public class Main
{
	public static int lengthLoop(ListNode head){
		ListNode temp1=head;
		ListNode temp2=head;
		while(temp1!=temp2&&temp2!=null){
		    temp1=temp1.next;
		    temp2=temp2.next.next;
		}
		if(temp2==null){
		    return -1;
		}
		int cnt=0;
		temp1=temp1.next;
		while(temp1!=temp2){
		    cnt++;
		    temp1=temp1.next;
		}
		return cnt+1;
	}
}
