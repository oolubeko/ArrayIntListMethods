import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayIntListTest {

	@Test
	public void testLastIndexOf() {
		ArrayIntList list1 = new ArrayIntList(10);
		list1.add(1);
		list1.add(18);
		list1.add(2);
		list1.add(7);
		list1.add(18);
		list1.add(39);
		list1.add(18);
		list1.add(40);
		
		assertEquals(list1.lastIndexOf(18), 6);
		assertEquals(list1.lastIndexOf(6), -1);
	}

	@Test
	public void testReplaceAll() {
		ArrayIntList list2 = new ArrayIntList(10);
		list2.add(11);
		list2.add(-7);
		list2.add(3);
		list2.add(42);
		list2.add(3);
		list2.add(0);
		list2.add(14);
		list2.add(3);
		
		list2.replaceAll(3, 999);
		
		assertEquals(list2.get(2), 999);
		assertEquals(list2.get(4), 999);
		assertEquals(list2.get(7), 999);
	}

}
