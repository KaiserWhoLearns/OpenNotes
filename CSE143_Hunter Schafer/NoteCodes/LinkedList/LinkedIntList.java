public class LinkedIntList {

	private ListNode front;

	public LinkedIntList() {
		front = null;
	}

	public LinkedIntList(int value) {
		this();
		front.data = value;
		front.next = null;
	}

	public LinkedIntList(int value, ListNode next) {
		this();
		front.data = value;
		front.next = next;
	}
/*	public LinkedIntList(int max) {
		for(int i = 0; i <= max; i ++) {
		ListNode temp = new ListNode(i, front);
		front = temp;
		}
	}*/

	//pre: 0 <= index < size()
	//post: return the value of data at index
	public int get(int index) {
		ListNode temp = front;
		for(int i = 0; i <= index; i ++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public int size() {
		int count = 0;
		ListNode temp = front;
		while(temp.next != null) {
			count ++;
			temp = temp.next;
		}
		return count;
	}

	public String toString() {
		if(front == null) {
			return "[]";
		}
		String result = "[" + front.data;
		ListNode current = front.next;
		while(current != null) {
			result += "," + current.data;
			current = current.next;
		}
		result += "]";
		return result;
	}

	public int indexOf(int value) {
		ListNode temp = front;
		for(int i = 0; i < this.size(); i++) {
			if(temp.data == value)
				return i;
			temp = temp.next;
		}
		return -1;
	}

	//add an element to the end of the list
	public void add(int value) {
		if(front == null) {
			front = new ListNode(value);
		}
		 else {
		ListNode current = front;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new ListNode(value);
	}
	}

	public void add(int index, int value) {
		if(index == 0) {
			front = new ListNode(value);
		}
		else {
			ListNode temp = nodeAt(index - 1);
			temp.next = new ListNode(value, temp.next);
		}
	}

	public void remove(int index) {
		if(index == 0) {
			front = front.next;
		} else {
			ListNode temp = nodeAt(index - 1);
			temp.next = temp.next.next;
		}
	}

	//pre: the list is sorted
	//post: add the value to the list to make it sorted
	public void addSorted(int value) {
		if(front == null) {
			front = new ListNode(value);
		} else {
		ListNode curr = front;
		while(curr.next.data < value) {
			curr = curr.next;
		}
		curr.next = new ListNode(value, curr.next);
	}
	}

	private ListNode nodeAt(int index) {
		ListNode temp = front;
		for(int i = 0; i < this.size(); i ++) {
			if(i == index) {
				return temp;
			}
			temp = temp.next;
		}
		return temp;
	}

	public void minToFront() {
		if(front != null && front.next != null) {
			int min = front.data;
			ListNode temp = front;
			ListNode rlt = front;
			while(temp.next != null) {
				if(temp.next.data < min) {
					min = temp.next.data;
					rlt = temp.next;
					rlt.next = null;
					temp.next = temp.next.next;
					System.out.println("Change1" + min);
				} else {
					temp = temp.next;
				}
			}
			rlt.next = front;
			front = rlt;
		}
	}

	public void trimEnds(int n) {    
	 	int length;    
	 	ListNode curr = front;    
	 	while(curr != null) {    	    
	 		length ++; 		 
	 		curr = curr.next;    
	 	}    
	 	if(length < 2 * k) {    	    
	 		throw new IllegalArgumentException();    
	 	}    
	 	if(length == 2 * k) {    	    
	 		front = null;    
	 	} else {        
	 		curr = front;        
	 		for(i = 0; i < k; i ++) {    	        
	 			curr = curr.next;        
	 		}
	 		for(i = 0; i < length - 2 * k; i ++) { 			
	 			curr = curr.next;
	 		} 	 		 
	 		curr.next = null;     
	 	} 
	} 
}
