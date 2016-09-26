package hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedTest {

//	MyLinked b = new MyLinked ();
//    b.add (1);
//    print ("singleton", b);
//    b.delete (0);
//    print ("deleted", b);
//    for (double i = 1; i < 13; i++) {
//        b.add (i);
//    }
//    print ("bigger list", b);
//    b.delete (0);
//    print ("deleted at beginning", b);
//    b.delete (10);
//    print ("deleted at end", b);
//    b.delete (4);
//    print ("deleted in middle", b);
	@Test
	public void testDelete() {
		MyLinked b = new MyLinked();
		assert b.size() == 0;
		
		b.add(1);
		assert b.size() == 1;
		assert b.first.item == 1;
		assert b.first.next == null;
		
		b.delete(0);
		assert b.size() == 0;
		
		for (int i = 1; i < 13; i++) b.add(i);
		// Why are these added backward?
		assert b.size() == 13;
		assert b.first.item == 12;
		assert b.first.next.item == 11;
		assert b.first.next.next.item == 10;
		assert b.first.next.next.next.item == 9;
		
		b.delete(0);
		System.out.println(b.first.item);
		assert b.first.item == 12;
	}

//	MyLinked b = new MyLinked ();
//    b.reverse ();
//    print ("reverse empty", b);
//    b.add (1);
//    print ("singleton", b);
//    b.reverse ();
//    print ("reverse singleton", b);
//    b.add (2);
//    print ("two", b);
//    b.reverse ();
//    print ("reverse two", b);
//    b.reverse ();
//    print ("reverse again", b);
//    for (double i = 3; i < 7; i++) {
//        b.add (i);
//        b.add (i);
//    }
//    print ("bigger list", b);
//    b.reverse ();
//    print ("reversed", b);
	@Test
	public void testReverse() {
		fail("Not yet implemented");
	}

//	MyLinked b = new MyLinked ();
//    b.remove (4);
//    print ("removed 4 from empty", b);
//    b.add (1);
//    b.remove (4);
//    print ("removed 4 from singelton", b);
//    b.remove (1);
//    print ("removed 1 from singelton", b);
//    for (double i = 1; i < 5; i++) {
//        b.add (i);
//        b.add (i);
//    }
//    for (double i = 1; i < 5; i++) {
//        b.add (i);
//        b.add (i);
//        b.add (i);
//        b.add (i);
//        b.add (i);
//    }
//    print ("longer list", b);
//    b.remove (9);
//    print ("removed all 9s", b); // does nothing
//    b.remove (3);
//    print ("removed all 3s", b);
//    b.remove (1);
//    print ("removed all 1s", b);
//    b.remove (4);
//    print ("removed all 4s", b);
//    b.remove (2);
//    print ("removed all 2s", b); // should be empty
	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

}