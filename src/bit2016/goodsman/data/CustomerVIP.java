package bit2016.goodsman.data;

public class CustomerVIP extends Customer {
	void setName(){
		// public은 자식 패키지에서 접근이 가능
		name = "둘리";	
		
		// protected는 자식에서 접근이 가능
		phone = "010-3110-5099";
		
		// private는 자식에서 접근이 불가능
//		email = "glancejw@aa";
		
		
	}
}
