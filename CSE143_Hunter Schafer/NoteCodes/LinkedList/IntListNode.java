public class IntListNode{
	public int data;
	public IntListNode next;

	public IntListNode() {
		this(0, null);
	}

	public IntListNode(int data) {
		this(data, null);
	}

	public IntListNode(int data, IntListNode next) {
		this.data = data;
		this.next = next;
	}


	public void print(IntListNode list) {
	//Traversing a list
	IntListNode current = list;
	while(current != null) {
		System.out.println(current.data);
		current = current.next;
	}

	/*for(ListNode curr = list; curr != null; curr = curr.next) {
		//awkward
	}*/
}

}

