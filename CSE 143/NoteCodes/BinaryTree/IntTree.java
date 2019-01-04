public class IntTree {

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

	public IntTree(int data) {
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


	//Binary Search Tree(BFT): a binary tree where each non-empty node R has the following properties
	//	-Elements of R's left subtree contain data "less than" R's data
	//	-Elements of R's right subtree containdata "greater than" R's data
	//	-R's left and right subtree are also binary search trees
	//BSTs store their elements in sorted order, which is helpful for searching/sorting tasks

	//Below are practice-it answers

	//post: return the number of nodes in the IntTree
	public int size() {
    	return size(overallRoot);
	}

	private int size(IntTreeNode root) {
    	if(root == null) {
        	return 0;
    	} else {
        	return 1 + size(root.left) + size(root.right);
    	}
	}

	//post: reuturn the number of leaves in the IntTree
	public int countLeaves() {
    	return countLeaves(overallRoot);
	}

	private int countLeaves(IntTreeNode root) {
    	if(root == null) {
        	return 0;
    	} else if(root.left == null && root.right == null) {
        	return 1;
    	} else {
        	return countLeaves(root.left) + countLeaves(root.right);
    	}
	}

	//return the sum of values in each node
	public int sum() {
    	return sum(overallRoot);
	}

	private int sum(IntTreeNode root) {
    	if(root == null) {
        	return 0;
    	} else {
        	return root.data + sum(root.left) + sum(root.right);
    	}
	}

	//return the number of LeftNodes
	public int countLeftNodes() {
    	return countLeftNodes(overallRoot);
	}

	private int countLeftNodes(IntTreeNode root) {
    	if(root == null) {
        	return 0;
    	} else if(root.left != null) {
        	return 1 + countLeftNodes(root.left) + countLeftNodes(root.right);
    	} else {
        	return countLeftNodes(root.left) + countLeftNodes(root.right);
    	}
	}

	//returns the sum of the values stored in a binary tree of integers weighted by the depth of each value.
	public int depthSum() {
    	return depthSum(overallRoot, 1);
	}
	private int depthSum(IntTreeNode root, int depth) {
    	if(root == null) {
        	return 0;
    	} else {
        	return root.data * depth + depthSum(root.left, depth + 1) + depthSum(root.right, depth + 1);
    	}
	}

	//doubles all data values greater than 0 in a binary tree of integers
	public void doublePositives() {
    	doublePositives(overallRoot);
	}
	private void doublePositives(IntTreeNode root) {
    	if(root != null) {
        	if(root.data > 0) {
            	root.data *= 2;
        	}
            doublePositives(root.left);
            doublePositives(root.right);
    	}
	}

	//returns the number of empty branches in a tree
	public int numEmpty() {
    	return numEmpty(overallRoot);
	}
	private int numEmpty(IntTreeNode root) {
    	if(root == null) {
        	return 1;
    	} else {
        	return numEmpty(root.left) + numEmpty(root.right);
    	}
	}

    //returns the height of a tree
    // The height is defined to be the number of levels (i.e., the number of nodes along the longest path from the root to a leaf)
	public int height() {
        return height(overallRoot);
    }
    private int height(IntTreeNode root) {
        if(root == null) {
            return 0;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

    //returns whether or not a binary tree is full (true, if it is, false if otherwise). A full binary tree is one in which every node has 0 or 2 children
    public boolean isFull(){
        return overallRoot == null || isFull(overallRoot);
    }

    private boolean isFull(IntTreeNode root) {
        if(root.left == null && root.right == null) {
            return true;
        }
        return root.left != null && isFull(root.left) && root.right != null && isFull(root.right);
    }

    //accepts an integer parameter n and that prints the values at level n from the left to right, one per line. 
    public void printLevel(int n) {
        if(n < 1) {
            throw new IllegalArgumentException();
        }
        printLevel(overallRoot, n);
    }

    private void printLevel(IntTreeNode root, int n) {
        if(root != null) {
            if(n == 1) {
                System.out.println(root.data);
            } else {
                printLevel(root.left, n - 1);
                printLevel(root.right, n - 1);
            }
        }
    }


    //return "empty" for an empty tree. 
    //For a leaf node, it should return the data in the node as a String. 
    //For a branch node, it should return a parenthesized String 
    //that has three elements separated by commas
    public String toString2() {
        return toString2(overallRoot);
    }

    private String toString2(IntTreeNode root) {
        if(root == null) {
            return "empty";
        }
        if(root.left == null && root.right == null) {
            return root.data + "";
        }
        return "(" + root.data + ", " + toString2(root.left) + ", " + toString2(root.right) + ")";
    }

    //outputs the leaves of a binary tree from right to left.
    public void printLeaves() {
        if(overallRoot == null) {
            System.out.println("no leaves");
        } else {
            System.out.print("leaves:");
            printLeaves(overallRoot);
        }
    }
    private void printLeaves(IntTreeNode root) {
        if(root != null) {
            if(root.left == null && root.right == null) {
                System.out.print(" " + root.data);
            } else {
                printLeaves(root.right);
                printLeaves(root.left);
            }
        }
    }

    //returns the number of branch nodes in a binary tree that contain even numbers.
    //doesn't count in leaves
    public int evenBranches() {
        return evenBranches(overallRoot);
    }
    private int evenBranches(IntTreeNode root) {
        if(root != null && (root.left != null || root.right != null)) {
            if(root.data % 2 == 0) {
                return 1 + evenBranches(root.left) + evenBranches(root.right);
            } else {
                return evenBranches(root.left) + evenBranches(root.right);
            }
        }
        return 0;
    }


    // prints the tree in a specific format. You are to perform a pre-order traversal of the tree, 
    //producing exactly one line of output for each node. 
    //Each output line should begin with a code indicating the type of node
    public void writeTree() {
        writeTree(overallRoot);
    }
    //awkward solution
    /*private void writeTree(IntTreeNode root) {
        if(root != null) {
            if(root.left == null && root.right == null) {
                System.out.println("0 " + root.data);
            } else if(root.left != null && root.right != null) {
                System.out.println("3 " + root.data);
                writeTree(root.left);
                writeTree(root.right);
            } else if(root.left != null) {
                System.out.println("1 " + root.data);
                writeTree(root.left);
            } else {
                System.out.println("2 " + root.data);
                writeTree(root.right);
            }
        }
    }*/
    //Better solution
    private void writeTree(IntTreeNode root) {
    if (root != null) {
        int type = 0;
        if (root.left != null) {
            type++;
        }
        if (root.right != null) {
            type += 2;
        }
        
        System.out.println(type + " " + root.data);
        
        writeTree(root.left);
        writeTree(root.right);
    }
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

    //accepts an integer n as a parameter and that adds nodes to a tree so that 
    //the first n levels are complete. 
    //A level is complete if every possible node at that level is not null.
    public void completeToLevel(int n) {
        if(n < 1) {
            throw new IllegalArgumentException();
        }
        overallRoot = completeToLevel(n, overallRoot);
    }
    private IntTreeNode completeToLevel(int n, IntTreeNode root) {
        if(n > 0) {
            if(root == null) {
                root = new IntTreeNode(-1);
            }
            root.left = completeToLevel(n - 1, root.left);
            root.right = completeToLevel(n - 1, root.right);
        }
        return root;
    }

    //changes the data stored in a binary tree, 
    //assigning sequential integers starting with 1 to each node 
    //so that a pre-order traversal will produce the numbers in order(1, 2, 3, etc.)
    public int numberNodes() {
        return numberNodes(overallRoot, 1);
    }
    private int numberNodes(IntTreeNode root, int num) {
        if(root != null) {
            root.data = num;
            return 1 + numberNodes(root.left, num + 1) + numberNodes(root.right, 
                                            num + 1 + numberNodes(root.left, num + 1));            
        }
        return 0;
    }
}
