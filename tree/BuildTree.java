public class BuildTree {

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

    // Builds a binary tree from an array in preorder format where -1 means "null".
    static class BinaryTree {
        private static int idx;

        public static Node buildTree(int[] nodes) {
            idx = -1;
            return buildTreeHelper(nodes);
        }

        private static Node buildTreeHelper(int[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTreeHelper(nodes);
            newNode.right = buildTreeHelper(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = BinaryTree.buildTree(nodes);
        BinaryTree.preorder(root);
    }
}

