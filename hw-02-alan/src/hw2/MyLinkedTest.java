package hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedTest {

	
	@Test
	public void testDelete() {
		MyLinked b = new MyLinked();
		assert b.size() == 0;
		assert b.first == null;
		
		b.add(1);
		assert b.size() == 1;
		assert b.first.item == 1;
		assert b.first.next == null;
		
		b.delete(0);
		assert b.size() == 0;
		
		b.add(1);
		assert b.size() == 1;
		assert b.first.item == 1;
		assert b.first.next == null;
		
		b.delete(0);
		
		for (int i = 1; i < 13; i++) b.add(i);
		assert b.size() == 12;
		assert b.first.item == 12;
		assert b.first.next.item == 11;
		assert b.first.next.next.item == 10;
		assert b.first.next.next.next.item == 9;
		assert b.first.next.next.next.next.item == 8;
		assert b.first.next.next.next.next.next.item == 7;
		assert b.first.next.next.next.next.next.next.item == 6;
		assert b.first.next.next.next.next.next.next.next.item == 5;
		assert b.first.next.next.next.next.next.next.next.next.item == 4;
		assert b.first.next.next.next.next.next.next.next.next.next.item == 3;
		assert b.first.next.next.next.next.next.next.next.next.next.next.item == 2;
		assert b.first.next.next.next.next.next.next.next.next.next.next.next.item == 1;
		assert b.first.next.next.next.next.next.next.next.next.next.next.next.next == null;

		b.delete(0);
		assert b.size() == 11;
		assert b.first.item == 11;
		
		b.delete(10);
		assert b.size() == 10;
		assert b.first.next.next.next.next.next.next.next.next.next.item == 2;
		assert b.first.next.next.next.next.next.next.next.next.next.next == null;
		
		b.delete(4);
		assert b.size() == 9;
		assert b.first.next.next.next.next.item == 6;
	}

	@Test
	public void testReverse() {
		MyLinked b = new MyLinked();
		b.reverse();
		assert b.first == null;
		
		b.add(1);
		b.reverse();
		assert b.first.item == 1;
		
		b.add(2);
		assert b.first.item == 2;
		assert b.first.next.item == 1;
		b.reverse();
		assert b.first.item == 1;
		assert b.first.next.item == 2;
		b.reverse();
		assert b.first.item == 2;
		assert b.first.next.item == 1;
		
		for (int i = 3; i < 7; i++) {
	        b.add(i);
	        b.add(i);
	    }
		assert b.first.item == 6;
		assert b.first.next.item == 6;
		assert b.first.next.next.item == 5;
		assert b.first.next.next.next.item == 5;
		assert b.first.next.next.next.next.item == 4;
		assert b.first.next.next.next.next.next.item == 4;
		assert b.first.next.next.next.next.next.next.item == 3;
		assert b.first.next.next.next.next.next.next.next.item == 3;
		assert b.first.next.next.next.next.next.next.next.next.item == 2;
		assert b.first.next.next.next.next.next.next.next.next.next.item == 1;
		
		b.reverse();
		assert b.first.item == 1;
		assert b.first.next.item == 2;
		assert b.first.next.next.item == 3;
		assert b.first.next.next.next.item == 3;
		assert b.first.next.next.next.next.item == 4;
		assert b.first.next.next.next.next.next.item == 4;
		assert b.first.next.next.next.next.next.next.item == 5;
		assert b.first.next.next.next.next.next.next.next.item == 5;
		assert b.first.next.next.next.next.next.next.next.next.item == 6;
		assert b.first.next.next.next.next.next.next.next.next.next.item == 6;
	}

	@Test
	public void testRemove() {
		MyLinked b = new MyLinked();
		b.remove(4);
		assert b.size() == 0;
		
		b.add(1);
		b.remove(4);
		assert b.size() == 1;
		assert b.first.item == 1;
		
		b.remove(1);
		System.out.println(b.size());
		assert b.first == null;
		assert b.size() == 0;
		
		for (int i = 1; i < 5; i++) {
	        b.add(i);
	        b.add(i);
	    }
		for (int i = 1; i < 5; i++) {
	        b.add(i);
	        b.add(i);
	        b.add(i);
	        b.add(i);
	        b.add(i);
	    }
		b.remove(9);
		b.remove(3);
		b.remove(1);
		b.remove(4);
		b.remove(2);
		assert b.size() == 0;
	}

}
