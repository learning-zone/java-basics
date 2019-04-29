package misc;
/**
 * Note:- In BST all the nodes in the left sub-tree of the root node should be
 * less than or equals to the data of the root. The data of all the nodes in the
 * right subtree of the root node should be greater than the data of the root.
 *
 */
public class BinarySearchTreeImpl {

	public class BSTNode {

		private BSTNode left;
		private BSTNode right;
		private Integer data;

		public BSTNode(Integer data) {
			this.data = data;
		}

		public BSTNode getLeft() {
			return left;
		}

		public void setLeft(BSTNode left) {
			this.left = left;
		}

		public BSTNode getRight() {
			return right;
		}

		public void setRight(BSTNode right) {
			this.right = right;
		}

		public Integer getData() {
			return data;
		}
	}

	private BSTNode root;

	public boolean isEmpty() {
		return (this.root == null);
	}

	public void insert(Integer data) {
		System.out.print("[input: " + data + "]");
		if (root == null) {
			this.root = new BSTNode(data);
			System.out.println(" -> inserted: " + data);
			return;
		}
		insertNode(this.root, data);
		System.out.println(" -> inserted: " + data);
		System.out.println();
	}

	private BSTNode insertNode(BSTNode root, Integer data) {
		BSTNode tmpNode = null;
		System.out.print(" -> " + root.getData());
		if (root.getData() >= data) {
			System.out.print(" [L]");
			if (root.getLeft() == null) {
				root.setLeft(new BSTNode(data));
				return root.getLeft();
			} else {
				System.out.println(" [R]");
			}

		} else {
			System.out.print(" [R]");
			if (root.getRight() == null) {
				root.setRight(new BSTNode(data));
				return root.getRight();
			} else {
				tmpNode = root.getRight();
			}
		}
		return insertNode(tmpNode, data);
	}

	public static void main(String[] args) {
		BinarySearchTreeImpl bst = new BinarySearchTreeImpl();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);
	}
}
