package datastructures.trees;

public interface IBinarySearchTree<T>
{
	public void inOrder(BSTNode<T> root);
	public void preOrder(BSTNode<T> root);
	public void postOrder(BSTNode<T> root);
	
	public int nodesAmount(BSTNode<T> root);
	public void destroyTree();
	
	public BSTNode<T> createNode(T value);	
	public BSTNode<T> searchNode(BSTNode<T> root, T value);
	public BSTNode<T> insertNode(BSTNode<T> root, T value);
}
