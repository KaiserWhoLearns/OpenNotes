import java.util.*;
public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> q = makeQueue(6);
		/*Stack<Integer> s = new Stack<Integer>();
		System.out.println("Before q = " + q);
		System.out.println("Before s = " + s);
		System.out.println(sum(q));
		queueToStack(q, s);
		System.out.println("After q = " + q);
		System.out.println("After s = " + s);
		System.out.println(stackSum(s));
		System.out.println("AfterSum s = " + s);
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		s1.push(-10);
		s1.push(15);
		s1.push(-2);
		s1.push(11);
		s1.push(15);
		s1.push(3);*/
		/*System.out.println(sameParityPattern(s1,s2));*/
		/*splitStack(s1);
		System.out.println(s1);*/
		reverseHalf(q);
		System.out.print(q);

	}

	public static Queue<Integer> makeQueue(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 0; i <= n; i ++) {
			q.add(i);
		}
		return q;
	}

	public static void queueToStack(Queue<Integer> q, Stack<Integer> s) {
		while(!q.isEmpty()) {
			int n = q.remove();
			s.push(n);
		}
	}

	public static void stackToQueue(Queue<Integer> q, Stack<Integer> s) {
		while(!s.isEmpty()) {
			int n = s.pop();
			q.add(n);
		}
	}

	//calculate the sum of elements if a queue
	//For-each loop is not allowed in class
	public static int sum(Queue<Integer> q) {
		int sum = 0;
		for(int i = 0; i < q.size(); i ++) {
			int n = q.remove();
			sum += n;
			q.add(n);
		}
		return sum;
	}

	public static int stackSum(Stack<Integer> s) {
		Queue<Integer> q = new LinkedList<Integer>();
		int sum = 0;
		int size = s.size();
		for(int i = 0; i < size; i ++) {
			int n = s.pop();
			q.add(n);
			sum += n;
		}
		queueToStack(q,s);
		stackToQueue(q,s);
		queueToStack(q,s);
		return sum;
	}

	public static boolean sameParityPattern(Stack<Integer> s1, Stack<Integer> s2) {
		Stack<Integer> temp = new Stack<Integer>();
		boolean same = true;
		while(same == true && !s1.isEmpty()) {
			int num1 = s1.pop();
			int num2 = s2.pop();
			if(num1 % 2 != num2 % 2) {
				same = false;
			}
			temp.push(num1);
			temp.push(num2);
		}
		while(temp.isEmpty()) {
			s2.push(temp.pop());
			s1.push(temp.pop());
		}
		return same;
	}

	public static void splitStack(Stack<Integer> s) {
    Queue<Integer> numbers = new LinkedList<Integer>();
    int size = s.size();
    while(!s.isEmpty()) {
    	numbers.add(s.pop());
    }
    for(int i = 0; i < size; i ++) {
        int num = numbers.remove();
        if(num < 0) {
            s.push(num);
        }
        else {
            numbers.add(num);
        }
    }
    while(!numbers.isEmpty()) {
        s.push(numbers.remove());
    }
    }

public void reverseHalf(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    for(int i = 0; i < size; i ++) {
        int num = q.remove();
        if(i%2 != 0) {
            s.push(num);
        }
        else {
            q.add(num);
        }
    }
    int i = 0;
    while(!s.isEmpty()) {
        int num = q.remove();
        if(i%2 != 0) {
            q.add(s.pop());
            q.add(num);
            i ++;
        }
        else {
            q.add(num);
        }
        i++;
    }
    
}
}