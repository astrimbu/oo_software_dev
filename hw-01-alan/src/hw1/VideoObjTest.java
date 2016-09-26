package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoObjTest {

	@Test
	public void testHashCode() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		VideoObj v2 = new VideoObj("Something!", 2000, "Strimbu");
		assert(v1.hashCode() == v2.hashCode());
		
		VideoObj v3 = new VideoObj("Something, else!", 2000, "Strimbu");
		assert(v1.hashCode() != v3.hashCode());
		
		VideoObj v4 = new VideoObj("Something!", 2500, "Strimbu");
		assert(v1.hashCode() != v4.hashCode());
		
		VideoObj v5 = new VideoObj("Something!", 2000, "Stromboli");
		assert(v1.hashCode() != v5.hashCode());
		
		VideoObj v6 = new VideoObj("Something, else!", 2500, "Stromboli");
		assert(v1.hashCode() != v6.hashCode());
	}

	@Test
	public void testVideoObj() {
		try {
			new VideoObj(null, 2000, "Strimbu");
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		try {
			new VideoObj(" Something!", 2000, "Strimbu");
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		try {
			new VideoObj("Something! ", 2000, "Strimbu");
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		try {
			new VideoObj("", 2000, "Strimbu");
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		
		try {
			new VideoObj("Something!", 1799, "Strimbu");
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		try {
			new VideoObj("Something!", 5001, "Strimbu");
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		
		try {
			new VideoObj("Something!", 2000, null);
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		try {
			new VideoObj("Something!", 2000, " Strimbu");
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		try {
			new VideoObj("Something!", 2000, "Strimbu ");
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
		try {
			new VideoObj("Something!", 2000, "");
		    fail("Should throw IllegalArgumentException.");
	    } catch(IllegalArgumentException e) { }
	}

	@Test
	public void testDirector() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		assert(v1.director().equals("Strimbu"));
	}

	@Test
	public void testTitle() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		assert(v1.title().equals("Something!"));
	}

	@Test
	public void testYear() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		assert(v1.year() == 2000);
	}

	@Test
	public void testEqualsObject() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		VideoObj v2 = new VideoObj("Something!", 2000, "Strimbu");
		assert(v1.equals(v2));
		
		VideoObj v3 = new VideoObj("Some!", 2000, "Strimbu");
		assert(!v1.equals(v3));
		
		VideoObj v4 = new VideoObj("Something!", 2005, "Strimbu");
		assert(!v1.equals(v4));
		
		VideoObj v5 = new VideoObj("Something!", 2000, "Stromboli");
		assert(!v1.equals(v5));
	}

	@Test
	public void testCompareTo() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		VideoObj v2 = new VideoObj("Something!", 2000, "Strimbu");
		assert(v1.compareTo(v2) == 0);
		
		VideoObj v3 = new VideoObj("Some!", 2000, "Strimbu");
		assert(v1.compareTo(v3) > 0);
		VideoObj v4 = new VideoObj("Somethings!", 2000, "Strimbu");
		assert(v1.compareTo(v4) < 0);
		
		VideoObj v5 = new VideoObj("Something!", 2005, "Strimbu");
		assert(v1.compareTo(v5) < 0);
		VideoObj v6 = new VideoObj("Something!", 1995, "Strimbu");
		assert(v1.compareTo(v6) > 0);
		
		VideoObj v7 = new VideoObj("Something!", 2000, "Stromboli");
		assert(v1.compareTo(v7) < 0);
		VideoObj v8 = new VideoObj("Something!", 2000, "Strim");
		assert(v1.compareTo(v8) > 0);
	}

	@Test
	public void testToString() {
		VideoObj v1 = new VideoObj("Something!", 2000, "Strimbu");
		assert(v1.toString().equals("Something! (2000) : Strimbu"));
	}

}
