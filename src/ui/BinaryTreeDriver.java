package ui;

import domain.BinaryTree;

public class BinaryTreeDriver {

	public static void main(String[] args) {
/*	Orginele boom van oefening 2.2	*/
//		BinaryTree<String> nodeD = new BinaryTree<>("D");
//		BinaryTree<String> nodeF = new BinaryTree<>("F");
//		BinaryTree<String> nodeB = new BinaryTree<>("B");
//		BinaryTree<String> nodeH = new BinaryTree<>("H");
//
//		// knoop A heeft links D en rechts F
//		BinaryTree<String> nodeA = new BinaryTree<>("A",nodeD, nodeF);
//		// knoop E heeft links H
//		BinaryTree<String> nodeE = new BinaryTree<>("E",nodeH,null);
//		// knoop G heeft links E en rechts B
//		BinaryTree<String> nodeG = new BinaryTree<>("G",nodeE, nodeB);
//
//		// boom heeft root C en heeft links A en rechts G
//		BinaryTree<String> boom = new BinaryTree<>("C",nodeA, nodeG);
//		boom.printPreorder();


/*	Boom oefening 2.1	*/


		BinaryTree<String> nodeA = new BinaryTree<>("A");
		BinaryTree<String> nodeC = new BinaryTree<>("C");
		BinaryTree<String> nodeE = new BinaryTree<>("E");
		BinaryTree<String> nodeH = new BinaryTree<>("H");

		// knoop D heeft links C en rechts E
		BinaryTree<String> nodeD = new BinaryTree<>("D", nodeC, nodeE);
		// knoop B heeft links A en rechts D
		BinaryTree<String> nodeB = new BinaryTree<>("B", nodeA, nodeD);
		// knoop I heeft links H
		BinaryTree<String> nodeI = new BinaryTree<>("I", nodeH, null);
		// knoop G heeft rechts I
		BinaryTree<String> nodeG = new BinaryTree<>("G",null, nodeI);

		// boom heeft root F en heeft links B en rechts G
		BinaryTree<String> boom = new BinaryTree<>("F",nodeB, nodeG);
		boom.printPreorder();

		/* OPDRACHT 2.3 */
		System.out.println("\n");
		boom.printInorder();

		/* OPDRACHT 2.4 */
		System.out.println("\n");
		boom.printPostorder();

		/* OPDRACHT 2.5 */
		System.out.println("\n");
		System.out.println("Er zijn in totaal " + boom.countNodes() + " nodes");

		/* OPDRACHT 2.6 */
		System.out.println("\n");
		System.out.println("De dieptegang van de boom is: " + boom.getDepth());

		/* OPDRACHT 2.7 */
		System.out.println("\n");
		System.out.println("De boom is een blad: " + boom.isLeaf());

		/* OPDRACHT 2.8 */
		System.out.println("\n");
		System.out.println("De boom heeft in totaal " + boom.countLeaves() + " aantal bladeren.");

		/* OPDRACHT 2.9 */
		System.out.println("\n");
		boom.getDataLeaves();

		/* OPDRACHT 2.10 */
		System.out.println("\n");
		System.out.println("Het dataveld 'D': " + boom.contains("D"));
		System.out.println("\n");
		System.out.println("Het dataveld 'H': " + boom.contains("H"));
		System.out.println("\n");
		System.out.println("Het dataveld 'F': " + boom.contains("F"));
		System.out.println("\n");
		System.out.println("Het dataveld 'Q': " + boom.contains("Q"));
	}

}
