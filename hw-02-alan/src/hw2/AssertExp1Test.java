package hw2;

import java.util.Arrays;

import org.junit.Test;

public class AssertExp1Test {

	@Test
	public void testMinValue() {
		double[] a = {-7};
		double[] b = {1, -4, -7, 7, 8, 11};
		double[] c = {-13, -4, -7, 7, 8, 11};
		double[] d = {1, -4, -7, 7, 8, 11, -9};
		assert AssertExp1.minValue(a) == -7;
		assert AssertExp1.minValue(b) == -7;
		assert AssertExp1.minValue(c) == -13;
		assert AssertExp1.minValue(d) == -9;
	}

	@Test
	public void testMinPosition() {
		double[] a = {-7};
		double[] b = {1, -4, -7, 7, 8, 11};
		double[] c = {-13, -4, -7, 7, 8, 11};
		double[] d = {1, -4, -7, 7, 8, 11, -9};
		assert AssertExp1.minPosition(a) == 0;
		assert AssertExp1.minPosition(b) == 2;
		assert AssertExp1.minPosition(c) == 0;
		assert AssertExp1.minPosition(d) == 6;
	}

	@Test
	public void testNumUnique() {
		double[] a = { };
		double[] b = {11};
		double[] c = {11, 11, 11, 11};
		double[] d = {11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88};
		double[] e = {11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88};
		assert AssertExp1.numUnique(a) == 0;
		assert AssertExp1.numUnique(b) == 1;
		assert AssertExp1.numUnique(c) == 1;
		assert AssertExp1.numUnique(d) == 8;
		assert AssertExp1.numUnique(e) == 8;
				
	}

	@Test
	public void testRemoveDuplicates() {
		double[] a = { };
		double[] b = {11};
		double[] c = {11, 11, 11, 11};
		double[] d = {11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88};
		double[] e = {11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88};
		assert Arrays.equals(AssertExp1.removeDuplicates(a), new double[] { });
		assert Arrays.equals(AssertExp1.removeDuplicates(b), new double[] {11});
		assert Arrays.equals(AssertExp1.removeDuplicates(c), new double[] {11});
		assert Arrays.equals(AssertExp1.removeDuplicates(d), new double[] {11, 22, 33, 44, 55, 66, 77, 88});
		assert Arrays.equals(AssertExp1.removeDuplicates(e), new double[] {11, 22, 33, 44, 55, 66, 77, 88});
	}

}
