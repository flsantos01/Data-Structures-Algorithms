package datastructures.trees;

import datastructures.general.Node;

public class TreeNode<T> extends Node<T> {

	private TreeNode<T> left;
	private TreeNode<T> right;

	protected TreeNode(T value) {
		super(value);
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

}
