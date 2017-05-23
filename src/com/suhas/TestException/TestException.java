package com.suhas.TestException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestException {
	

	public  double getTotalCost(List<Items> basketItems) throws Exception {
		double total = 0.0f;
		boolean storEmpty = false;
		Map<String, Items> availableItems  =  getAvailableItem();
		
		if(null == availableItems || availableItems.isEmpty()){
			storEmpty = true;
			throw new Exception("Store donesn't have any item for sell.");
		}
		
		if (null != basketItems && !basketItems.isEmpty()) {
			System.out.println("Basket Item         " + "     "+ "Price");
			for (Items basketItem : basketItems) {
				if(!storEmpty) {
					Items test = availableItems.get(basketItem.getName());
						if (basketItem.getName().equals(test.getName())) {
							System.out.println(basketItem.getName()+"         "+"     " +test.getPrice());
							total += test.getPrice();
					}
					
				} 

			}
			System.out.println("Basket Item  Total        " + "  -->   "+ total);
			
		} else {
			
			throw new Exception("Basket donesn't have any item");
		}
		return total;
	}

	public Map<String, Items> getAvailableItem() {
		Map<String, Items> availableItems = new HashMap<String, Items> ();
		   availableItems.put("Bananas", new Items("Bananas",10));
		   availableItems.put("Oranges", new Items("Oranges",20));
		   availableItems.put("Apples", new Items("Apples",30));
		   availableItems.put("Lamons", new Items("Lamons",10));
		   availableItems.put("Peaches", new Items("Peaches",10));
		   return  availableItems;
	}
	
	
	   
	   
	  
	
	
	

}
