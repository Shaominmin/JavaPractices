
ListNode last=null;
ListNode newHead=null;
ListNode cur=head;
while (cur!=null){
	if(cur.val!=val){
		if(newHead==null){
			neewHead=cur;
		}else{
			last.next=cur;
	}
	last=cur;
}
cur=cur.next;
}
return newHead;