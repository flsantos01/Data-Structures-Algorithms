package datastructures.trees.AVL;

import datastructures.trees.BST.BSTNode;

public class AVLNode<T> extends BSTNode<T> {
	
	private int height;

	protected AVLNode(T value, BSTNode<T> left, BSTNode<T> right, int height) {
		super(value, left, right);
		setHeight(height);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
