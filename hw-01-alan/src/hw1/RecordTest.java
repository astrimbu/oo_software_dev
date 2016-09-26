package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecordTest {

	@Test
	public void testRecord() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		try {
			new Record(null, 10, 1, 200);
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		
		try {
			new Record(v1, 0, 1, 200);
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		
		try {
			new Record(v1, 1, 2, 200);
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		
		try {
			new Record(v1, 10, 10, 9);
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
	}

	@Test
	public void testCopy() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		Record r1 = new Record(v1, 10, 1, 200);
		Record r2 = r1.copy();
		assert(r2.video.equals(v1));
		assert(r2.numOwned == 10);
		assert(r2.numOut == 1);
		assert(r2.numRentals == 200);
	}

	@Test
	public void testToString() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		Record r1 = new Record(v1, 10, 1, 200);
		assert(r1.toString().equals(v1 + " [10,1,200]"));
	}

}
