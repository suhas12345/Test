package com.suhas.TestException;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ItemLogicTest extends TestCase{
	
	TestException testException;
	@Before 
	   public void setUp() {
		testException = new TestException();
	   }

	@Test
	public void testGetTotalCost() {

		List<Items> basketItems = new ArrayList<Items>();
		basketItems.add(new Items("Bananas", 10));
		basketItems.add(new Items("Bananas", 10));
		basketItems.add(new Items("Apples", 30));
		basketItems.add(new Items("Lamons", 10));

		
		double totalAmount = 0;
		try {
			totalAmount = testException.getTotalCost(basketItems);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double sample =60.0f;
		assertEquals(sample, totalAmount);

	}
	
	@Test
	public void testGetTotalCostEmpty() {
		Throwable e = null;
		List<Items> basketItems = new ArrayList<Items>();
		
		try{
			testException.getTotalCost(basketItems);
		}catch(Throwable ex){
			e=ex;
		}
		assertTrue(e instanceof Exception);
		String errorMessage = "Basket donesn't have any item";
		assertEquals(errorMessage, e.getLocalizedMessage());

	}
	
	@Test
	public void testGetAvailableItem() {
		
		assertEquals(false, testException.getAvailableItem().isEmpty());

	}

}
