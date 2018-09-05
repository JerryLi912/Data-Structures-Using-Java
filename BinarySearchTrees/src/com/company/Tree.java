package com.company;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if(root == null)
            root = new TreeNode(value);
        else
            root.insert(value);
    }

    public void traverseInOrder(){
        if(root != null)
            root.traverseInOrder();
    }

    public TreeNode get(int value){
        if(root != null)
            return root.get(value);

        return null;
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value){
        if(subtreeRoot == null)
            return subtreeRoot;

        if(value < subtreeRoot.getData())
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));

        else if(value > subtreeRoot.getData())
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));

        else{
            // case 1 and 2: node to delete has 1 or 0 child(ren)

            if(subtreeRoot.getLeftChild() == null)
                return subtreeRoot.getRightChild();

            else if(subtreeRoot.getRightChild() == null)
                return subtreeRoot.getLeftChild();

            // case 3: node to delete has 2 children

            // Replace the value in subtreeRoot node with the smallest value from right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            // Delete the node that has smallest value in right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }
        return subtreeRoot;
    }


    public int height() {
        if(root == null)
            return 0;
        // Counting max depth edges
        // If want to nodes remove -1
        return heightrec(root) - 1;
    }

    private int heightrec(TreeNode node){
        if(node == null)
            return 0;

        int ldepth = heightrec(node.getLeftChild());
        int rdepth = heightrec(node.getRightChild());

        return ldepth > rdepth ? ldepth + 1 : rdepth + 1 ;
    }

    public int max(){
        if(root != null)
            return  root.max();

        return Integer.MAX_VALUE;
    }

    public int min(){
        if(root != null)
            return root.min();

        return Integer.MIN_VALUE;
    }

}
