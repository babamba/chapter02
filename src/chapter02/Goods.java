package chapter02;

public class Goods {

	//데이터는 private로 보호하는게 맞다.
	//사용시 메소드로 접근.
	
	private String name;
	private int price;			// 어디서든지
	private int countStock;  // protected 는 상속에서
	private int countSold;
	
	
	
	//getter setter = 은닉화를 위한 기능(캡슐화) 데이터가 상하지 않도록.
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public void setPrice(int price) {
		
		//정보보호. 마이너스값이 들어가지않는다.
		if(price < 0){
			price = 0;
		}
		
		this.price = price;
	}

	
	
}




