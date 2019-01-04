import java.util.*;
public class testAR {
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		for(int i = 1; i < 9; i ++) {
			s1.add(i);
			s2.add(i);
		}
		alternatingReverse(s1);
		myAns(s2);
		System.out.println("The standard ans is :" + s1);
		System.out.println("Kaiser's ans is: " + s2);
	}

	public static void alternatingReverse(Stack<Integer> s) {
		if(s.size() % 2 != 0) {
			throw new IllegalArgumentException();
		}
		Queue<Integer> q = new LinkedList<Integer>();
		int oldsize = s.size();
		while(! s.isEmpty()){
			q.add(s.pop());
		}
		for(int i = 0; i < oldsize / 2; i ++) {
			s.push(q.remove());
			q.add(s.pop());
		}
		while(! q.isEmpty()) {
			s.push(q.remove());
		}
	}

	public static void myAns(Stack<Integer> s) {
		if(s.size() % 2 != 0) {
			throw new IllegalArgumentException();
		}
		Queue<Integer> q = new LinkedList<Integer>();
		int size = s.size();
		while(! s.isEmpty()) {
			q.add(s.pop());
		}
		for(int i = 0; i < size / 2; i ++) {
			q.add(q.remove());
			s.push(q.remove());
		}
		for(int i = 0; i < size / 2; i ++) {
			q.add(q.remove());
			q.add(s.pop());
		}
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
	}
}
