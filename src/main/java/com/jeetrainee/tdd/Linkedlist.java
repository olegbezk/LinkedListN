package com.jeetrainee.tdd;

import java.util.Collection;
import java.util.Iterator;

public class Linkedlist<E> implements List<E> {

	private class Link<E> {

		private E data;
		private Link<E> next;
		private Link<E> prev;

		public Link(Link<E> next, E data, Link<E> prev) {
			this.next = next;
			this.prev = prev;
			this.data = data;
		}

	}

	private Link<E> first;
	private Link<E> last;
	private int size = 0;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new LinkIterator();
	}

	private class LinkIterator<E> implements Iterator<E> {

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		public E next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean add(E e) {
		final Link<E> l = last;
		final Link<E> newNode = new Link<>(l, e, null);
		last = newNode;
		if (l == null)
			first = newNode;
		else
			l.next = newNode;
		size++;
		return true;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		for (Link<E> x = first; x != null;) {
			Link<E> next = x.next;
			x.data = null;
			x.next = null;
			x.prev = null;
			x = next;
		}
		first = last = null;
		size = 0;

	}

	public E get(int index) {
		checkElementIndex(index);
		return link(index).data;
	}

	public void add(int index, E element) {
		// TODO Auto-generated method stub

	}

	public Link<E> link(int index) {

		if (index < (size >> 1)) {
			Link<E> x = first;
			for (int i = 0; i < index; i++)
				x = x.next;
			return x;
		} else {
			Link<E> x = last;
			for (int i = size - 1; i > index; i--)
				x = x.prev;
			return x;
		}
	}

	public E remove(int index) {

		checkElementIndex(index);

		final Link<E> x = link(index);
		final E element = x.data;
		final Link<E> next = x.next;
		final Link<E> prev = x.prev;

		if (prev == null) {
			first = next;
		} else {
			prev.next = next;
			x.prev = null;
		}

		if (next == null) {
			last = prev;
		} else {
			next.prev = prev;
			x.next = null;
		}

		x.data = null;
		size--;
		return element;
	}

	public int indexOf(Object o) {
		int index = 0;
        if (o == null) {
            for (Link<E> x = first; x != null; x = x.next) {
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Link<E> x = first; x != null; x = x.next) {
                if (o.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
	}
	
	
	private void checkElementIndex(int index) {
        if (!(index >= 0 && index < size))
            throw new IndexOutOfBoundsException();
    }

}
