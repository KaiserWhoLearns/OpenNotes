public class ClientListNode {
	public static void main(String[] args) {
		/*ListNode list;    //initial value is null
		list = new ListNode();
		list.data = 42;
		list.next = new ListNode();
		list.next.data = -3;
		list.next.next = new ListNode();
		list.next.next.data = 17;


		ListNode list1 = new ListNode();
		list1.data = 10;
		list1.next = new ListNode();
		list1.next.data = 20;
		ListNode list2 = new ListNode();
		list2.data = 30;
		list2.next = new ListNode();
		list2.next.data = 40;

		list1.next.next = list2;
		list2 = list2.next;
		list1.next.next.next = null;*/
		IntListNode p = new IntListNode();
		p.data = 1;
		p.next = new IntListNode(2);
		IntListNode q = new IntListNode(3);
		q.next = new IntListNode(4);
		p.print(p);
		System.out.println();
		q.print(q);
		p.next.next = q.next;
		q.next = p;
		p = p.next;
		//p.next = q.next.next;
		q.next.next = null;
		p.print(p);
		System.out.println();
		q.print(q);
	}
}