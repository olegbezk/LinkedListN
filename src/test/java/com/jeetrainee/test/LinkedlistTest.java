package com.jeetrainee.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jeetrainee.tdd.Linkedlist;
import com.jeetrainee.tdd.List;

public class LinkedlistTest {

	private List<String> data;

	@Before
	public void seUp() {
		data = new Linkedlist<String>();
		for (int i = 0; i < 3; i++) {
			data.add("" + i);
		}
	}

	@After
	public void tearDown() {
		data.clear();
	}

	@Test
	public void testIsEmpty() {
		assertNotNull(data);
		assertFalse(data.isEmpty());
	}

	@Test
	public void testInsert() {
		assertEquals(data.size(), 3);
		data.add(1, "Insert");
		assertEquals(data.size(), 4);
		assertEquals(data.get(1), "Insert");
	}

	@Test
	public void testRemove() {
		assertEquals(data.size(), 3);
		data.remove(1);
		data.add(1, "Replace");
		assertEquals(data.size(), 3);
		assertEquals(data.get(1), "Replace");
	}

	@Test
	public void testContains() {
		assertTrue(data.contains(2));
	}

	@Test
	public void testAddAll() {
		Linkedlist<String> ldata = new Linkedlist<String>();
		ldata.add("3");
		ldata.add("4");
		data.addAll(ldata);
		assertEquals(data.size(), 5);
	}

	@Test
	public void testIterator() {
		int index = 0;
		for (String value : data) {
			assertEquals(data.get(index), value);
			index++;
		}
		assertEquals(index, data.size());
	}

	@Test
	public void testIndexOf() {
		assertEquals(3, data.size());

		assertEquals(0, data.indexOf(0));
		assertEquals(1, data.indexOf(1));
		assertEquals(2, data.indexOf(2));
	}

	@Test
	public void testRemoveAll() {
		data.removeAll(data);
		assertEquals(0, data.size());
	}
	
	@Test
	public void testSize(){
		assertEquals(3, data.size());
	}
	
	@Test
	public void testToArray(){
		Object[] dataArray = data.toArray();
		for (int i = 0; i < dataArray.length; i++) {
			assertEquals(dataArray[i], data.get(i));
		}
	}
	
	@Test
	public void testClear(){
		assertEquals(null, data.get(0));
		assertEquals(0, data.size());
	}

}
