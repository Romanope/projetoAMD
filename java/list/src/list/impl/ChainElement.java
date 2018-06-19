package list.impl;

public class ChainElement<E> {

	private int index;
	
	private E item;
	
	private ChainElement<E> nextNode;

	public ChainElement(E node, ChainElement<E> nextNode, int index) {
		super();
		this.index = index;
		this.item = node;
		this.nextNode = nextNode;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}

	public ChainElement<E> getNextNode() {
		return nextNode;
	}

	public void setNextNode(ChainElement<E> nextNode) {
		this.nextNode = nextNode;
	}
}
