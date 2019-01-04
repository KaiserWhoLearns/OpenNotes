import java.util.*;
public class stackAndQueuepractice {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList();
		q.add(1);
		q.add(8);
		q.add(7);
		q.add(2);
		q.add(9);
		q.add(18);
		q.add(12);
		q.add(0);
		reverseHalf(q);
		System.out.println(q);
		
	}

	//practice-it reverseHalf
	public static void reverseHalf(Queue<Integer> q) {
		Stack<Integer> s = new Stack<Integer>();
		int size = q.size();
		for(int i = 0; i < size; i ++) {
			int num = q.remove();
			if(i % 2 != 0) {
				s.push(num);
			}
			else {
				q.add(num);
			}
		}
		int i = 0;
		while(! s.isEmpty()) {
			int num = q.remove();
			if(size % 2 == 0) {
				q.add(num);
				q.add(s.pop());
			}
			else if(i % 2 != 0 && size % 2 != 0) {
				q.add(s.pop());
				q.add(num);
				i++;
			}
			else {
				q.add(num);
			}
			i++;
		}
	}
}