package datastructures.general;

public class Node<T> 
{
	protected T value;
	
	protected Node(T value)
	{
		setValue(value);
	}
	
	protected void setValue(T value) 
	{
		this.value = value;
	}
	
	protected T getValue() 
	{
		return value;
	}
}
