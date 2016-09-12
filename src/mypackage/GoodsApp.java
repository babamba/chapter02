package mypackage;

import chapter02.Books;
import chapter02.Goods;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods goods = new Goods();
		goods.setName("NiKon");
//		goods.Price = -1;
		goods.setPrice(200000);
		goods.setCountStock(50);
		goods.setCountSold(10);
		
		System.out.println(
				goods.getName()+ ":" + 
				goods.getPrice() + ": " + 
				goods.getCountStock() + ":"  + 
				goods.getCountSold());
		
	}
	
	
	
}

