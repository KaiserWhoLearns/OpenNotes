public class IntTreeQuizProb {

	private class IntTreeNode {
		public int data;
		public IntTreeNode left;
		public IntTreeNode right;

		public IntTreeNode(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	private IntTreeNode overallRoot;

	public IntTreeQuizProb(int data) {
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

	//Below are quiz notes
	
	//IMPORTANT: the pattern of root.left = and root.right = is important.
	//Remove all the leaves
	public void removeLeaves() {
		overallRoot = removeLeaves(overallRoot);
	}

	private IntTreeNode removeLeaves(IntTreeNode root) {
		if(root != null) {
			if(root.left == null && root.right == null) {
				return null;
		
			} else {
				root.left = removeLeaves(root.left);
				root.right = removeLeaves(root.right);
			}
		}
		return root;
	}

	//pre: takes a Scanner as a parameter and
	//post: replaces the current tree with one construced from data stored in the Scanner
	//Important Prob!

	//awkward
	/*public void readTree(Scanner input) {
		overallRoot = readTree(input, overallRoot);
	}
	
	private IntTreeNode readTree(Scanner input, IntTreeNode root) {
	    int type = input.nextInput();
	    int data = input.nextInput();
	    if(type == 0) {
		    return new IntTreeNode(data);
	    } else if(type == 1) {
		    root.data = data;
		    root.left = readTree(input, root.left);
	    } else if(type == 2) {
		    root.data = data;
		    root.right = readTree(input, root.right);
	    } else if(type == 3) {
		    root.data = data;
		    root.left = readTree(intput, root.left);
		    root.right = readTree(input, root.right);
	    }
	}*/	

	public void readTree(Scanner input) {
		overallRoot = readTree2(input);
	}
	
	private IntTreeNode readTree2(Scanner input) {
	    int type = input.nextInt();
        int data = input.nextInt();
        if(type == 0) {
            return new IntTreeNode(data, null, null);
        } else if(type == 1) {
            return new IntTreeNode(data, readTree2(input), null);
        } else if(type == 2) {
            return new IntTreeNode(data, null, readTree2(input));
        } else if(type == 3) {
            return new IntTreeNode(data, readTree2(input), readTree2(input));
        }
        return null;
	}

	//Write a method limitPathSum that removes nodes from a binary tree of integers 
	//to guarantee that the sum of the values on any path from the root 
	//to a node does not exceed some maximum value. 
	public void limitPathSum(int maxSum) {
        overallRoot = limitPathSum(overallRoot, maxSum, 0);
    }
    private IntTreeNode limitPathSum(IntTreeNode curr, int maxSum, int currSum) {
        if(curr != null) {
            if(curr.data + currSum <= maxSum) {
                curr.left = limitPathSum(curr.left, maxSum, currSum + curr.data);
                curr.right = limitPathSum(curr.right, maxSum, currSum + curr.data);
                return curr;
            }
            return null;
        }
        return null;
    }
}
