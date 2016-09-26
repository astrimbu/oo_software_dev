package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class InventorySetTest {

	@Test
	public void testInventorySet() {
		try {
			new VideoObj("Something!", 2000, "Strimbu");
	    } catch(Exception e) { 
	    	fail("Should create InventorySet just fine.");
	    }
	}

	@Test
	public void testSize() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		VideoObj v2 = new VideoObj("Something!!", 2001, "Strimbu");
		VideoObj v3 = new VideoObj("Something!!!", 2002, "Strimbu");
		InventorySet is1 = new InventorySet();
		is1.addNumOwned(v1, 10);
		is1.addNumOwned(v2, 20);
		is1.addNumOwned(v3, 30);
		assert(is1.size() == 3);
	}

	@Test
	public void testGet() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		InventorySet is1 = new InventorySet();
		is1.addNumOwned(v1, 10);
		assert(is1.get(v1) != null);
	}

	@Test
	public void testToCollection() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		VideoObj v2 = new VideoObj("Something!!", 2001, "Strimbu");
		VideoObj v3 = new VideoObj("Something!!!", 2002, "Strimbu");
		InventorySet is1 = new InventorySet();
		is1.addNumOwned(v1, 10);
		is1.addNumOwned(v2, 20);
		is1.addNumOwned(v3, 30);
		Record r1 = new Record(v1, 10, 0, 0);
		Record r2 = new Record(v2, 20, 0, 0);
		Record r3 = new Record(v3, 30, 0, 0);
		assert(is1.toCollection().size() == 3);
		assert(is1.toCollection().contains(r1));
		assert(is1.toCollection().contains(r2));
		assert(is1.toCollection().contains(r3));
	}

	@Test
	public void testAddNumOwned() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		InventorySet is1 = new InventorySet();
		is1.addNumOwned(v1, 10);
		assert(is1.get(v1).numOwned == 10);
		is1.addNumOwned(v1, 20);
		assert(is1.get(v1).numOwned == 30);
	}

	@Test
	public void testCheckOut() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		InventorySet is1 = new InventorySet();
		is1.addNumOwned(v1, 2);
		is1.checkOut(v1);
		assert(is1.get(v1).numOut == 1);
		is1.checkOut(v1);
		assert(is1.get(v1).numOut == 2);
		try {
			is1.checkOut(v1);
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
	}

	@Test
	public void testCheckIn() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		InventorySet is1 = new InventorySet();
		is1.addNumOwned(v1, 2);
		is1.checkOut(v1);
		is1.checkOut(v1);
		assert(is1.get(v1).numOut == 2);
		is1.checkIn(v1);
		assert(is1.get(v1).numOut == 1);
		is1.checkIn(v1);
		assert(is1.get(v1).numOut == 0);
		try {
			is1.checkIn(v1);
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
	}

	@Test
	public void testClear() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		VideoObj v2 = new VideoObj("Something!!", 2001, "Strimbu");
		VideoObj v3 = new VideoObj("Something!!!", 2002, "Strimbu");
		InventorySet is1 = new InventorySet();
		is1.addNumOwned(v1, 10);
		is1.addNumOwned(v2, 20);
		is1.addNumOwned(v3, 30);
		assert(is1.size() == 3);
		is1.clear();
		assert(is1.size() == 0);
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
