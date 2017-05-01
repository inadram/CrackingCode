package Moderate.Thirteen;

public class BiNodeOptimiseDataStructure {

	public static BiNode fromTreeToDoubleLinkedList(BiNode root) {
		if (root == null) {
			return null;
		}

		BiNode left = fromTreeToDoubleLinkedList(root.first);
		BiNode right = fromTreeToDoubleLinkedList(root.second);

		if (left == null && right == null) {
			root.first = root;
			root.second = root;
			return root;
		}
		BiNode rightTail = right == null ? null : right.first;

		/* join left to root */
		if (left == null) {
			concat(right.first, root);
		} else {
			concat(left.first, root);
		}

		/* join right to root */
		if (right == null) {
			concat(root, left);
		} else {
			concat(root, right);
		}

		/* join right to left */
		if (left != null && right != null) {
			concat(rightTail, left);
		}

		return left == null ? root : left;
	}


	public static void concat(BiNode x, BiNode y) {
		x.second = y;
		y.first = x;
	}


}
