package datastructures.trees.BST;

import datastructures.general.Node;

public class BSTNode<T> extends Node<T> {	
	private BSTNode<T> left;
	private BSTNode<T> right;

	protected BSTNode(T value, BSTNode<T> left, BSTNode<T> right) {
		super(value);
		setLeft(left);
		setRight(right);
	}

	@Override
	public T getValue() {
		return super.getValue();
	}

	public BSTNode<T> getLeft() {
		return left;
	}

	public void setLeft(BSTNode<T> left) {
		this.left = left;
	}

	public BSTNode<T> getRight() {
		return right;
	}

	public void setRight(BSTNode<T> right) {
		this.right = right;
	}
}
