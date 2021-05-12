package datastructures.trees;

public class BinarySearchTree<T extends Comparable<T>> implements IBinarySearchTree<T>
{
	private BSTNode<T> root;
	
	@Override
	public void inOrder(BSTNode<T> root) 
	{
		inOrder(root.getLeft());
		printValue(root);
		inOrder(root.getRight());
	}
	
	@Override
	public void preOrder(BSTNode<T> root) 
	{
		printValue(root);
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	@Override
	public void postOrder(BSTNode<T> root) 
	{
		postOrder(root.getLeft());
		postOrder(root.getRight());
		printValue(root);
	}
	
	@Override
	public BSTNode<T> createNode(T value)
	{
		BSTNode<T> new_node = new BSTNode<T>(value, null, null);
		return new_node;
	}
	
	@Override
	public int nodesAmount(BSTNode<T> root) 
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
	
	@Override
	public void destroyTree() 
	{
		this.root = null;
	}
	
	@Override
	public BSTNode<T> searchNode(BSTNode<T> root, T value)
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
	
	@Override
	public BSTNode<T> insertNode(BSTNode<T> root, T value)
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

	private void printValue(BSTNode<T> root) 
	{
		System.out.println(this.root.getValue());
	}
}
