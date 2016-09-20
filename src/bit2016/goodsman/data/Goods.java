package bit2016.goodsman.data;

public class Goods {
	
	public Goods(){	//Goods 생성자  생성자는 함수다 생성자는 new뒤에서만
 		System.out.println("생성자 호출");
 		count++;
	}
	public static int count;	//static이 붙으면 클래스변수
	//데이터는 private로 보호하는게 맞다.
	//사용시 메소드로 접근. public은 메소드전용 private는 변수전용
	
	private String name;		//인스턴스 변수
	private int price;			// 어디서든지
	private int countStock;  // protected 는 상속에서
	private int countSold;

	//getter setter = 은닉화를 위한 기능(캡슐화) 데이터가 상하지 않도록.
	public String getName() {
		return name;
	}
	
	//return값이 없고 매개변수(parameter)가 있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	//return값이 있고 매개변수(parameter)가 없는 메소드
	public int getPrice() {
		return price;
	}//리턴문이 꼭 하나 있어야함.없으면 에러
	
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
	
	
	//return 값이 매개변수(parameter)가 없는 메소드
	
	public void showInfo(){
		System.out.println(
				"name=" + name + 
				", price=" + price + 
				", countStock=" + countStock+
				", countSold=" + countSold);
	}
	
	
	//return 값이 있고 매개변수(parameter)도 있는 메소드
	public int calcDiscountPrice(double rate){
		int discountPrice = (int)(price * rate);
		return discountPrice;
	}
	
	
	
	
	
	
	public void setPrice(int price) {
		
		//정보보호. 마이너스값이 들어가지않는다.
		if(price < 0){
			price = 0;
		}
		
		this.price = price;
	}

	
	
}




