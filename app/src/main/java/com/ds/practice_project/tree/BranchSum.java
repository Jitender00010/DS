package com.ds.practice_project.tree;

class BranchSum {

    public static void main(String[] ar){
      BST root = new BST(1);
      root.left = new BST(2);
      root.left.left = new BST(4);
      root.left.right = new BST(5);
      root.left.left.left = new BST(8);
      root.left.left.left.left = new BST(11);
      root.left.left.right = new BST(9);
      root.right = new BST(3);
      root.right.left = new BST(6);
      root.right.right = new BST(7);

      //inOrder(root);

        //int s = depth(root,0,0);
        System.out.println(calculateNodeDepth(root,0));
    }

    public static int height(BST root){
        int l,r;
        if (root == null)
            return -1;

         l =  height(root.left) +1;
         r = height(root.right) +1;

         if (l>r)
             return l;
         else return r;
    }

    public static int calculateNodeDepth(BST node , int sumOfDepth ){
        //check if node is null then return.
        if(node == null)
            return 0;
        return	sumOfDepth + calculateNodeDepth(node.left, sumOfDepth + 1 ) + calculateNodeDepth(node.right, sumOfDepth + 1);
    }

    public static class BST{
        BST left,right;
        int node;

        BST(int node){
           this.node = node;
           left = right = null;
        }
    }

    public static void inOrder(BST node){
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(" "+node.node);
        inOrder(node.right);
    }
}
