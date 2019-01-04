public class BinarySearchTree {
//public class BinarySearchTree<E extends Comparable<E>> {
	//private class TreeNode<E> {
	//Doesn't have to be E, can be other character
	private class IntTreeNode {
		public int data;	//Not use the type object because this couldn't make the types all the same
		public IntTreeNode left;	//TreeNode<E>
		public IntTreeNode right;

		//public TreeNode<E>() {
		public IntTreeNode(int data) {	//E data
			this.data = data;
			left = null;
			right = null;
		}
	}

	private IntTreeNode overallRoot;

	public BinarySearchTree(int data) {
		overallRoot = new IntTreeNode(data);
	}

	public void print() {
		print(overallRoot);
	}

	private void print(IntTreeNode root) {
		if(root != null) {
			//preorder
			System.out.print(root.data + " ");
			print(root.left);
			print(root.right);
		}
	}

	public boolean contains(int n) {
		return contains(overallRoot, n);
	}

	private boolean contains(IntTreeNode root, int n) {
		if(root == null) {
			return false;
		} else if(root.data == n) {
			return true;
		} else {
			//notice the boolean zen
			return contains(root.left, n) || contains(root.right, n);
		}
	}

	//A special cotains for BFT
	public boolean containsBFT(int k) {
		return containsBFT(overallRoot, k);
	}
	//Should use compareTo()
	private boolean containsBFT(IntTreeNode root, int n) {
		return root != null && (root.data == n 
				|| n < root.data && containsBFT(root.left, n) 
				|| n > root.data && containsBFT(root.right, n));
	}


	public void add(int value) {
		overallRoot = add(overallRoot, value);
	}

	private IntTreeNode add(IntTreeNode root, int n) {
		if(root == null) {
			return new IntTreeNode(n);
		} else if(n <= root.data) {  
			root.left = add(root.left, n);
		} else {
			root.right = add(root.right, n);
		}
		return root;
	}


	//Binary Search Tree(BFT): a binary tree where each non-empty node R has the following properties
}
