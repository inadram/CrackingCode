package Moderate.Thirteen;

public class BiNode {
	public int data;

	public BiNode(int data) {
		this.data = data;
	}

	public BiNode() {
	}

	public BiNode first;

	public BiNode addFirst(int data) {
		return this.first = new BiNode(data);
	}

	public BiNode next(int data) {
		BiNode biNode = this;
		while (biNode.first != null) {
			biNode = biNode.first;
		}
		BiNode next = new BiNode(data);
		biNode.first = next;
		next.second = biNode;
		return next;
	}

	public BiNode second;

	public BiNode addSecond(int data) {
		return this.second = new BiNode(data);
	}
}
