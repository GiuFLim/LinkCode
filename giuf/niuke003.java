package giuf;

/*1.新建一个头节点，以防第一个节点被删除。 
2.保存当前节点上个节点，循环遍历整个链表，
如果当前节点的值与下一个节点的值相等，
则将当前节点的值与next.next节点的值比较，直到不相等或者null为止，
最后将当前节点的上个节点pre指向最后比较不相等的节点。 
3.如果当前节点与next节点不相等，则直接节点指针全部向后移动一位。

①先判断当前p指向与p.next指向是否为空，为空则进入⑤，不为空进入②；
②判断当前节点p的值与与p.next的值是否相等，如果相等，进入③，不相等，进入④
③记录p.val的值为val，循环判断val是否与当前p指向相等，相等的话p = p.next，last.next指向p；
④last指向p，p指向p.next；
⑤返回first.next；
*/

public class niuke003 {
	 public ListNode deleteDuplication(ListNode pHead){
		 if(pHead==null)return pHead;
		 ListNode first=new ListNode(0);
		 first.next=pHead;
		 ListNode p=pHead,pre=first;
		 if(p!=null&&p.next!=null){
			 if(p.val==p.next.val){
				 int val=p.val;
				 while(p!=null&&p.val==val)
					 p=p.next;
				 pre.next=p; 
			 }else{
				 pre=p;
				 p=p.next;
			 }
		 }
		 return first.next;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		niuke003 s = new niuke003();
		int []elem={1,2,2,3,3,4,4,5,6};
		for(int i:elem){
			//s.deleteDuplication()
		}
	}

}
