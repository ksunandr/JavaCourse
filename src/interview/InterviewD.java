package interview;

import java.util.Map;
import java.util.TreeMap;

/*
* 23/02/23
* Company: Diffblue
* Interview Senior Java Software engineer 30 min
* Common questions about my experience
* What makes you unique?
* Questions about OOP
* What the difference between abstract class and interface?
* Life coding on semi Java code in google doc. One long task about Tree.
* Implement findMaximumValue in the not ordered tree. Recursion?
* One more method (don't remember, because I didn't start do it)
* Unit test for findMaximumValue
*/
public class InterviewD {
    public static void main(String[] args) {

        MyTree myTree = new MyTree();
        myTree.root = new Node(1);
        myTree.root.left = new Node(2);
        myTree.root.right = new Node(5);
        myTree.root.left.right = new Node(17);
        myTree.root.left.left = new Node(6);
        myTree.root.right.right = new Node(23);
        myTree.root.right.left = new Node(4);

        System.out.println("max value =" + myTree.findMaxValue(myTree.root));
        //print tree
        System.out.println(myTree.traversePreOrder(myTree.root));
    }
}

class Node {
    int value;
    Node left, right;

    public Node(int data) {
        this.value = data;
        left = right = null;
    }
}

class MyTree {
    Node root;

    int findMaxValue(Node node) {

        if (node == null) {
            return -1;

        }
        int res = node.value;
        int leftSide = findMaxValue(node.left);
        int rightSide = findMaxValue(node.right);

        if (res < leftSide) {
            res = leftSide;
        }
        if (res < rightSide) {
            res = rightSide;
        }


        return res;
    }

    public String traversePreOrder(Node root) {

        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.value);

        String pointerRight = "└──";
        String pointerLeft = (root.right != null) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, root.left, root.right != null);
        traverseNodes(sb, "", pointerRight, root.right, false);

        return sb.toString();
    }

    public void traverseNodes(StringBuilder sb, String padding, String pointer, Node node,
                              boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.value);

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.right != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.left, node.right != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.right, false);
        }
    }


    }





