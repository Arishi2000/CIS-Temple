
// class TreeNode definition
class TreeNode<T extends Comparable<T>> {
    // package access members
    TreeNode<T> leftNode;
    T data; // node value
    TreeNode<T> rightNode;

    // constructor initializes data and makes this a leaf node
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // node has no children
    }

    // locate insertion point and insert new node; ignore duplicate values
    public void insert(T insertValue) {
        // insert in left subtree
        if (insertValue.compareTo(data) < 0) {
            // insert new TreeNode
            if (leftNode == null)
                leftNode = new TreeNode<T>(insertValue);
            else // continue traversing left subtree recursively
                leftNode.insert(insertValue);
        }
        // insert in right subtree
        else if (insertValue.compareTo(data) > 0) {
            // insert new TreeNode
            if (rightNode == null)
                rightNode = new TreeNode<T>(insertValue);
            else // continue traversing right subtree recursively
                rightNode.insert(insertValue);
        }
    }
} // end class TreeNode

// class Tree definition
public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;

    // constructor initializes an empty Tree
    public Tree() {
        root = null;
    }

    // insert a new node in the binary search tree
    public void insertNode(T insertValue) {
        if (root == null)
            root = new TreeNode<T>(insertValue); // create root node
        else
            root.insert(insertValue); // call the insert method
    }

    // begin preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }

    // recursive method to perform preorder traversal
    private void preorderHelper(TreeNode<T> node) {
        if (node == null) return;

        System.out.printf("%s ", node.data); // output node data
        preorderHelper(node.leftNode); // traverse left subtree
        preorderHelper(node.rightNode); // traverse right subtree
    }

    // begin inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    }

    // recursive method to perform inorder traversal
    private void inorderHelper(TreeNode<T> node) {
        if (node == null) return;

        // Inorder traversal means left -> root -> right
        inorderHelper(node.leftNode);
        System.out.print(node.data + " ");
        inorderHelper(node.rightNode);
    }

    // begin postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    }

    // recursive method to perform postorder traversal
    private void postorderHelper(TreeNode<T> node) {
        if (node == null) return;

        // Postorder traversal means left -> right -> root
        postorderHelper(node.leftNode);
        postorderHelper(node.rightNode);
        System.out.print(node.data + " ");
    }

    // return a reference to the root of this tree
    public TreeNode<T> getRoot() {
        return this.root;
    }

    // get the depth of this node
    private int depth(TreeNode<T> node) {
        //   base case
        if (node == null) {
            return 0;
        }
        // declaring left depth and assigning it to the left node
        int leftDepth = depth(node.leftNode);
        // declaring right depth and assigning it to the right node
        int rightDepth = depth(node.rightNode);

        // check if left is greater than right
        if (leftDepth > rightDepth) {
            return leftDepth + 1; // then return left +1
        }
        else {
            return rightDepth + 1; // else return right +1;
        }
    }

    // get depth of this tree
    public int depth() {
        return depth(this.root);
    }

    public void levelOrderTraversal() {
        levelOrderTraversalHelper(root);
    }


//       first Enqueue root node in queue then while queue is not empty:
//       tempNode = dequeue Queue then Print data of tempNode
//       Enqueue left and right node if present in queue

    private void levelOrderTraversalHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        Queue<TreeNode> queue = new Queue<>();
        queue.enqueue(node);

        while(!queue.isEmpty()) {
            TreeNode treeNode = queue.dequeue();
            System.out.print(treeNode.data + " ");
            if (treeNode.leftNode != null) {
                queue.enqueue(treeNode.leftNode);
            }
            if (treeNode.rightNode != null) {
                queue.enqueue(treeNode.rightNode);
            }
        }
    }
} // end class Tree