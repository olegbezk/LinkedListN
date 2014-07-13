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

	private class LinkIterator implements Iterator<E> {

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
		first = null;
		size = 0;

	}

	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(int index, E element) {
		// TODO Auto-generated method stub

	}

	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
