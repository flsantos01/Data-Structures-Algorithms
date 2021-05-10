package datastructures.trees;

public class BinarySearchTree<T extends Comparable<T>> 
{
	private TreeNode<T> root;
	
	private void printValue(TreeNode<T> root) 
	{
		System.out.println(this.root.getValue());
	}
	
	public void inOrder(TreeNode<T> root) 
	{
		inOrder(root.getLeft());
		printValue(root);
		inOrder(root.getRight());
	}
	
	public void preOrder(TreeNode<T> root) 
	{
		printValue(root);
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	public void postOrder(TreeNode<T> root) 
	{
		postOrder(root.getLeft());
		postOrder(root.getRight());
		printValue(root);
	}
	
	public TreeNode<T> createNode(T value)
	{
		TreeNode<T> new_node = new TreeNode<T>(value, null, null);
		return new_node;
	}
	
	public int nodesAmount(TreeNode<T> root) 
	{
		if(root != null) 
		{
			return nodesAmount(root.getLeft()) + 1 + nodesAmount(root.getRight());
		}
		else 
		{
			return 0;
		}
	}
	
	public void destroyTree() 
	{
		this.root = null;
	}
	
	public TreeNode<T> searchNode(TreeNode<T> root, T value)
	{
		if(root != null) 
		{
			if(value.compareTo(root.getValue()) == 0) 
			{
				return root;
			}
			if(value.compareTo(root.getValue()) == 1) 
			{
				searchNode(root.getRight(), value);
			}
			else 
			{
				searchNode(root.getLeft(), value);
			}
		}
		return null;
	}
	
	public TreeNode<T> insertNode(TreeNode<T> root, T value)
	{
		if(root == null) 
		{
			return createNode(value);
		}
		if(value.compareTo(root.getValue()) == 1) 
		{
			root.setRight(insertNode(root.getRight(), value));
		}
		if(value.compareTo(root.getValue()) == -1) {
			root.setLeft(insertNode(root.getLeft(), value));
		}
		return root;
	}
}
