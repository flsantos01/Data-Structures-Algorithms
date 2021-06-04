package datastructures.trees;

import datastructures.trees.TreeNode;

public interface Tree<T> {
	public void inOrder(TreeNode<T> root);
	public void preOrder(TreeNode<T> root);
	public void postOrder(TreeNode<T> root);
	
	public TreeNode<T> createNode(T value);
	public TreeNode<T> insertNode();
	public TreeNode<T> searchNode();
	public int getNodesAmount();
	
	public void destroyTree();
	public String toString();
}
