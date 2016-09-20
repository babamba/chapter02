package bit2016.goodsman.db;

import bit2016.goodsman.data.Customer;

public class CustomerDB {
	
	
	
	void insert(){
		Customer c = new Customer();
		//public은 외부패키지에서 접근 가능.
		c.name = "김진원";
		
		
//		protected는 외부 패키지에서 접근 불가능
//		c.phone = "010-3110-5099";

//		private는 외부 패키지에서 접근 불가능
//		c.email = "ggg@ggg";
		c.setEmail("gg!gg");
		
		
		
//		c.setName("김진원");
	}
	
	
	
}
