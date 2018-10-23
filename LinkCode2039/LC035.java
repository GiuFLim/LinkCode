package LinkCode2039;

public class LC035 {
	public ListNode reverse(ListNode head) {
		if(head==null||head.next==null)return head;
		ListNode pre=head;
		ListNode cur=head.next;
		ListNode nxt;
		while(cur!=null){
			nxt=cur.next;
			cur.next=pre;
			pre=cur;
			cur=nxt;
		}
		head.next=null;
		head=pre;
		return head;
	}
	

}
