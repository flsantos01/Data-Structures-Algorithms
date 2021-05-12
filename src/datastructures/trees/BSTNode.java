package datastructures.trees;

import datastructures.general.Node;

public class BSTNode<T> extends Node<T> 
{
	private BSTNode<T> left;
	private BSTNode<T> right;
	
	public BSTNode(T value, BSTNode<T> left, BSTNode<T> right) 
	{
		setLeft(left);
		setRight(right);
		super.setValue(value);
	}

	public BSTNode<T> getLeft() 
	{
		return left;
	}

	public void setLeft(BSTNode<T> left) 
	{
		this.left = left;
	}

	public BSTNode<T> getRight() 
	{
		return right;
	}

	public void setRight(BSTNode<T> right) 
	{
		this.right = right;
	}	
}
