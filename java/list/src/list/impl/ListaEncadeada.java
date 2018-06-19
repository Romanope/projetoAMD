package list.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListaEncadeada<T> implements List<T> {

	private ChainElement<T> rootElement;

	private ChainElement<T> lastElement;
	
	private Integer currentIndex;
	
	public ListaEncadeada(ListaEncadeada<T> lista) {
		this.rootElement = lista.getRootElement();
		this.lastElement = lista.lastElement;
		this.currentIndex = lista.getCurrentIndex();
	}
	
	public ListaEncadeada(T[] array) {
		currentIndex = -1;
		for (T t: array) {
			add(t);
		}
	}

	public ListaEncadeada() {
		currentIndex = -1;
	}

	@Override
	public String toString () {
		
		String retorno = "";
		ChainElement<T> original = rootElement;
		retorno = "Element: " + original.getItem() + "\n";
		while (original.getNextNode() != null) {
			original = original.getNextNode();
			retorno = retorno.concat("Element: " + original.getItem() + "\n");
		}
		
		return retorno;
	}
	
	@Override
	public int size() {
		return currentIndex+1;
	}


	@Override
	public boolean isEmpty() {
		return currentIndex < 0;
	}


	@Override
	public boolean contains(Object o) {
		return false;
	}


	@Override
	public Iterator<T> iterator() {
		return null;
	}


	@Override
	public Object[] toArray() {
		
		Object[] array = new Object[currentIndex+1];
		if (currentIndex == 0) {
			array[0] = rootElement.getItem();
		} else if (currentIndex > 0) {
			int i = 0;
			array[i] = rootElement.getItem();
			ChainElement<T> original = rootElement;
			i++;
			while (rootElement.getNextNode() != null) {
				array[i] = rootElement.getNextNode().getItem();
				rootElement = rootElement.getNextNode();
				i++;
			}
			rootElement = original;
		}
		
		return array;
	}


	@Override
	public <T> T[] toArray(T[] a) {
		
        int i = 0;
        Object[] result = a;
        
        result[i++] = rootElement.getItem();
        while (rootElement.getNextNode() != null) {
			result[i++] = rootElement.getNextNode().getItem();
			rootElement = rootElement.getNextNode();
		}
        
		return a;
	}

	@Override
	public boolean add(T e) {
		currentIndex++;
		
		ChainElement<T> newElement = new ChainElement<T>(e, null, currentIndex);
		if (lastElement != null) {
			lastElement.setNextNode(newElement);
		} else if (rootElement == null) {
			rootElement = newElement;
		} else {
			throw new IllegalStateException("Erro durante a insercao de elemento na lista " + e);
		}
		
		lastElement = newElement;
		
		return true;
	}

	@Override
	public boolean remove(Object o) {

		return false;
	}


	@Override
	public boolean containsAll(Collection<?> c) {

		return false;
	}


	@Override
	public boolean addAll (Collection<? extends T> c) {

		try {
			for (T e: c) {
				add(e);
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}


	@Override
	public boolean addAll(int index, Collection<? extends T> c) {

		return false;
	}


	@Override
	public boolean removeAll(Collection<?> c) {

		return false;
	}


	@Override
	public boolean retainAll(Collection<?> c) {

		return false;
	}


	@Override
	public void clear() {
		
	}


	@Override
	public T get(int index) {
		ChainElement<T> element = rootElement;
		if (element.getIndex() == index) {
			return element.getItem();
		}
		
		while (element.getNextNode() != null) {
			element = element.getNextNode();
			if (element.getIndex() == index) {
				return element.getItem();
			}
		}
		
		throw new IndexOutOfBoundsException("index ".concat(String.valueOf(index)).concat(" not exists!"));
	}

	@Override
	public void add(int index, T element) {
		
	}


	@Override
	public T remove(int index) {
		ChainElement<T> element = rootElement;
		if (element.getIndex() == index) {
			if (element.getNextNode() == null) {
				rootElement = null;
			} else {
				rootElement =  element.getNextNode();
			}
		}
		
		ChainElement<T> previous = null;
		while (element.getNextNode() != null) {
			previous = element;
			element = element.getNextNode();
			if (element.getIndex() == index) {
				if (element.getNextNode() == null) {
					rootElement.setNextNode(null);
					break;
				} else {
					ChainElement<T> nodeChild = element.getNextNode();
					previous.setNextNode(nodeChild);
					break;
				}
			}
		}
		
		return null;
	}

	@Override
	public int indexOf(Object o) {

		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {

		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {

		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {

		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {

		return null;
	}
	
	@Override
	public T set(int index, T element) {

		return null;
	}

	public void setChainElement(ChainElement<T> chainElement) {
		this.rootElement = chainElement;
	}
	
	public ListaEncadeada<T> clone () {
		
		ListaEncadeada<T> lista = new ListaEncadeada<T>();
		
		lista.setChainElement(rootElement);
		
		return lista;
		
	}
	
	public void sort() {
		
		Double[] array = this.toArray(new Double[size()]);
		
		double aux = 0;
		for (int i = 0; i < array.length; i++) {
			double valor1 = array[i];
			for (int j = i+1; j < array.length; j++) {
				double valor2 = array[j];
				if (valor1 > valor2) {
					aux = valor1;
					array[i] = valor2;
					array[j] = aux;
					valor1 = valor2;
				}
			}
		}
		currentIndex = -1;
		rootElement = null;
		lastElement = null;
		
		for (Double v : array) {
			add((T) v);
		}
	}
	
	
	public static void main(String[] args) {
		ListaEncadeada<Double> lista = new ListaEncadeada<Double>();
		
		lista.add(1D);
		lista.add(4D);
		lista.add(2D);
		
		lista.sort();
		
		System.out.println(lista);
	}
	
	protected ChainElement<T> getRootElement() {
		return this.rootElement;
	}

	protected ChainElement<T> getLastElement() {
		return this.lastElement;
	}
	
	protected int getCurrentIndex() {
		return this.currentIndex;
	}
	
	
}
