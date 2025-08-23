public class Sum_of_Nodes {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int  idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newnNode = new Node(nodes[idx]);
            newnNode.left = buildTree(nodes);
            newnNode.right = buildTree(nodes);

            return newnNode;
        }
    }


    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right); 

        return leftsum+rightsum+root.data;
    }


    public static void main(String[] args) {  //O(n)
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

       System.out.println( sumOfNodes(root));
    }
}
