package basicprac.binarytree;
//the inorder traversal lrootright is the sorted for any binary search tree

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode {
        private int data;//Generic Type
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
//            this.left=null;
//            this.right=null;

        }
    }

    //How to search a given key in a Binary Search Tree(Recursive)
    public TreeNode search(int key) {
        return search(root, key);
    }

    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key) {//base case
            //when we are finding our key we are returning key or root and when we are not finding the key we are returning null
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    //How to insert a value in a Binary Search Tree (Recursive) |

    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);

        } else {
            root.right = insert(root.right, value);

        }
        return root;
    }

    //for print in sorted form we use inorder traversal in binary search tree its a property of bst that when we use
    //in order traversal it prints data in sorted form.
    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    // Maximum Depth in Binary Tree
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }
//Check if a tree is a BST or BT | Validate a BST

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, int minVal, int maxVal) {
        if (root == null) {
            return true;
        }
        if (root.data >= maxVal || root.data <= minVal) {
            return false;

        }
        return isValidBST(root.left, minVal, root.data) && isValidBST(root.right, root.data, maxVal);
    }


    // Checked for Balanced tree
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    int dfsHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }


    // Diameter of Binary Tree
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    private int height(TreeNode root, int[] diameter) {
        if (root == null) {
            return 0;
        }
        //f Instead of an array if I am taking an int variable, then it's not working can you please explain why??
        //Yeah in java variable is not referenced..


        int leftHeight = height(root.left, diameter);
        int rightHeight = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    //💡 Mirror property is    left == right and right == left
    //💡 pre-order traversal on root->left subtree, (root, left, right)
    //💡 modified pre-order traversal on root->right subtree, (root, right, left)
    //💡 compare the node val's if they are the same
    //💡 Do both traversals at the same time
    //💡 if left is null or right is null, then both sides must match and return true (base case)

    // Check for Symmetrical Binary Trees

    public boolean isSymmetric(TreeNode root) {

        return root == null && isSymmetricHelper(root.left, root.right);
    }

    public boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.data != right.data) {
            return false;
        }
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }


    // Determine if two trees are identical

    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return (root1 == root2);
        }
        return (root1.data == root2.data) && isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }


    //CONVERT SORTED ARRAY TO BINARY SEARCH TREE

    public TreeNode sortedArrayToBst(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        return constructBSTRecursive(arr, 0, arr.length - 1);//two pointers
    }

    private TreeNode constructBSTRecursive(int[] arr, int start, int end) {
        if (start > end) {//base case
            return null;

        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = constructBSTRecursive(arr, start, mid - 1);
        root.right = constructBSTRecursive(arr, mid + 1, end);
        return root;
    }
//postOrder

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //KTH SMALLEST ELEMENT IN A BST

    public int kthSmallest(TreeNode root, int k) {
        int nums[] = new int[2];
        inOrder(root, nums, k);
        return nums[1];

    }

    public void inOrder(TreeNode root, int[] arr, int k) {
        if (root == null) {
            return;
        }
       // inOrder(root.right, arr, k);// max
        inOrder(root.left, arr, k);// min
        if (++arr[0] == k) {

            arr[1] = root.data;
            return;
        }
        inOrder(root.left, arr, k);

    }

    public static void main(String[] args) {
        BinarySearchTree btree = new BinarySearchTree();
//        BinarySearchTree btree1 = new BinarySearchTree();
        btree.insert(5);
        btree.insert(3);
        btree.insert(7);
        btree.insert(1);
//
//        btree1.insert(5);
//        btree1.insert(3);
//        btree1.insert(7);
//        btree1.insert(1);

        //btree.inOrder();
//        System.out.println(btree.isSameTree(btree.root, btree1.root));
//        System.out.println(btree.isSymmetric(btree.root));


        //   System.out.println();
//        if (btree.search(2) != null) {
//            System.out.println("Key Found");
//        } else {
//            System.out.println("Key not found");
//        }
//        int height = btree.maxDepth(btree.root);
//        System.out.println(height);
//
//        int diameter = btree.diameterOfBinaryTree(btree.root);
//        System.out.println(diameter);
//
//        System.out.println(btree.isBalanced(btree.root));
//        System.out.println(btree.isValidBST(btree.root));

        //Sorted Array To Binary tree
//        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
//
//        TreeNode root = btree.sortedArrayToBst(arr);
//        System.out.println("\"PostOrder traversal of constructed BST\"");
//        btree.preOrder(root);

        int data = btree.kthSmallest(btree.root, 2);
        int data1 = btree.kthSmallest(btree.root, 2);
        System.out.println(data);
    }
}
