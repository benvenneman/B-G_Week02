package domain;

public class BinaryTree<E> {
	private E data;
	private BinaryTree<E> leftTree, rightTree;
	
	public BinaryTree(E data){
		this(data,null,null);
	}

	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree){
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data= data;
		this.leftTree= leftTree;
		this.rightTree= rightTree;
	}

	public void printPreorder(){
		System.out.print(this.data + " ");
		if (this.leftTree != null) this.leftTree.printPreorder();
		if (this.rightTree != null) this.rightTree.printPreorder();
	}

	/* OPDRACHT 2.3 */
	public void printInorder(){
		if (this.leftTree != null) this.leftTree.printInorder();
		System.out.print(this.data + " ");
		if (this.rightTree != null) this.rightTree.printInorder();
	}

	/* OPDRACHT 2.4 */
	public void printPostorder() {
		if (this.leftTree != null) this.leftTree.printPostorder();
		if (this.rightTree != null) this.rightTree.printPostorder();
		System.out.print(this.data + " ");
	}

	/* OPDRACHT 2.5 */
	public int countNodes() {
		int som = 0;
		if (this.leftTree != null) {
			som += this.leftTree.countNodes();
		}
		if (this.rightTree != null) {
			som += this.rightTree.countNodes();
		}
		return 1 + som;
	}

	/* OPDRACHT 2.6 */
	public int getDepth() {
		int som = 0;
		int somlinks = 1;
		int somrechts = 1;
		if (this.leftTree != null) {
			somlinks += this.leftTree.getDepth();
		}
		if (this.rightTree != null) {
			somrechts += this.rightTree.getDepth();
		}
		/* Zelfde code als onderstaande code */
//		if (somlinks < somrechts) {
//			return somrechts;
//		} else {
//			return somlinks;
//		}
		return Math.max(somlinks, somrechts);
	}

	/* OPDRACHT 2.7 */
	public boolean isLeaf() {
		if (this.leftTree == null && this.rightTree == null) {
			return true;
		} else {
			return false;
		}
	}

	/* OPDRACHT 2.8 */
	public int countLeaves() {
		int total = 0;
		if (this.leftTree == null && this.rightTree == null) {
			total += 1;
		}
		if (this.leftTree != null) {
			total += this.leftTree.countLeaves();
		}
		if (this.rightTree != null) {
			total += this.rightTree.countLeaves();
		}
		return total;
	}

	/* OPDRACHT 2.9 */
	public void getDataLeaves() {
		int total = 0;
		if (this.leftTree == null && this.rightTree == null) {
			System.out.print(this.data + " ");
		}
		if (this.leftTree != null) {
			this.leftTree.getDataLeaves();
		}
		if (this.rightTree != null) {
			this.rightTree.getDataLeaves();
		}
	}

	/* OPDRACHT 2.10 */
	public boolean contains(String node) {
		System.out.println(this.data);
		if (this.data.equals(node)) {
			System.out.println(this.data + " isTrue");
			return true;
		} else {
			if (this.leftTree != null) leftTree.contains(node);
			if (this.rightTree != null) rightTree.contains(node);
		}

		return false;
	}
}
