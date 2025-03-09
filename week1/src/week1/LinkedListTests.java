package week1;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class LinkedListTests {	
	LinkedList small;
	LinkedList matt;
	LinkedList notMatt;

	@Before
	public void setup(){
		small = new LinkedList('m');
		matt = new LinkedList('m', new LinkedList('a', new LinkedList('t', new LinkedList('t'))));
		notMatt = new LinkedList('s');
		notMatt.add('o');
		notMatt.add('m');
		notMatt.add('e');
		notMatt.add('o');
		notMatt.add('n');
		notMatt.add('e');
		notMatt.add('e');
		notMatt.add('l');
		notMatt.add('s');
		notMatt.add('e');
	}

	@Test
	public void testLength(){
		assertEquals(small.length(), 1);
		assertEquals(small.length_iterative(), 1);
		assertEquals(matt.length(), 4);
		assertEquals(matt.length_iterative(), 4);
		assertEquals(notMatt.length(), 11);
		assertEquals(notMatt.length_iterative(), 11);
	}

	@Test
	public void constructorBuildsUnaryList() {
	    assertTrue(small.length() == 1);
	}

	@Test
	public void addWillBuildList(){
		assertTrue(matt.toString().equals("matt"));
	}
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList('c');
		ll.add('a');
		LinkedList matt = new LinkedList('m', new LinkedList('a', new LinkedList('t', new LinkedList('t'))));
		LinkedList notMatt = new LinkedList('s');
        System.out.println(ll.toString());
        System.out.println(matt.toString_iterative());
    }
}