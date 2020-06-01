package com.demo.linkedlist.test;

//import all static methods from Assert class
//this way all static method of the calss can be invoked without using Class reference
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.demo.linkedlist.program.LinkedList;



public class LinkedListTest {

	@Test
	public void new_listIsEmpty() {
		LinkedList<Integer> list=new LinkedList<>();
		assertEquals(0, list.size());
	}

	@Test
	public void toString_returnsListWithEmptyParenthesis() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		assertEquals("LinkedList()", list.toString());
	}
	
	
	@Test
	public void add_canAddToAnEmptyList() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(34);
		assertEquals(1,list.size());
	}
	
	 
	@Test
	public void add_addingToANonEmptyListAddsItemAtTheEnd() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<10;i++) {
			System.out.println(i);
			list.add(i);
		}
		assertEquals(10,list.size());
		list.add(56);
		assertEquals(11,list.size());
	}
	
	
	@Test
	public void add_addedItemsAreShownInToString() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		assertEquals("3", list.get(0).toString());
		
	}
	
	
	@Test
	public void get_0GetsTheFirstItem() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		assertNotNull("3", list.get(0));
	}
	
	
	 
	@Test
	public void get_PosReturnsItemsFromZeroBasedIndex() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		assertEquals("3", list.get(0).toString());	
		
	}
	
	
	@Test
	public void get_throwsIndexExceptionForInvalidIndex() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		
	   
	}
	
	
	@Test
	public void get_NegativeIndexIsACirclularIndex() {
		//-1 is last item
		//-2 is second last item
		//-3 is third last item
		//size() is first item
		
		//you will have to modify LinkedList to implement this feature
	}
	
	 
	@Test
	public void set_setDoesntAddNewItem() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		//list.set(1, 6);
		//assertEquals(1, list.size());	
	    
	}
	
	 
	@Test
	public void set_replacesCurrentItem() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		list.set(0, 6);
		assertEquals(1, list.size());
	}
	
	 
	@Test
	public void set_failsForInvalidIndex() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(3);
		
	}
	
	
	@Test
	public void remove_removesTheItemFromValidIndex() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<10;i++) {
			System.out.println(i);
			list.add(i);
		}
		
		list.remove(3);
		assertEquals(10, list.size());
		
	}
	
	
	@Test
	public void remove_usesCircularIndex() {
		
	}
	
	 
	@Test
	public void get_removeReturnsTheRemovedItem() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<10;i++) {
			System.out.println(i);
			list.add(i);
		}
		
		assertEquals("9", list.get(9).toString());
	}
	
	
	
	
}
