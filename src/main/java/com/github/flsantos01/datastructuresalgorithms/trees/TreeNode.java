package com.github.flsantos01.datastructuresalgorithms.trees;

import com.github.flsantos01.datastructuresalgorithms.general.Node;

public class TreeNode<T> extends Node<T> {
	private TreeNode<T> left;
	private TreeNode<T> right;
	private int height;
	
	public TreeNode(T value, int height) {
		setValue(value);
		
	}
	
	@Override
	public T getValue() {
		return super.getValue();
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}