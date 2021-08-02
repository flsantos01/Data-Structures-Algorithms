package datastructures.general;

public abstract class Node<T> {
	protected T value;

	protected void setValue(T value) {
		this.value = value;
	}

	protected T getValue() {
		return value;
	}	
}
