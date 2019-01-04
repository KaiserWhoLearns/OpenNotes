public class BinarySearchTreeClient { 
	
	public static void main(String[] args) {
	BinarySearchTree tr = new BinarySearchTree(10);
	tr.add(8);
	tr.add(5);
	tr.print();
	tr.add(15);
	tr.add(20);
	System.out.println(tr.contains(15));
	System.out.println(tr.containsBFT(15));
	}
}
