package bit2016.goodsman.data;

public class Customer {
	public String name;		//주로 메소드
	protected String phone;	
	private String email;	//주로 필드(변수)
	
	
	
	void setName(){
		//public은 자기 안에서 가능
		name = "도우넛";
		
		//protected는 자기 안에서 가능
		phone = "010-3110-5099";
		
		//private는 자기 안에서 가능
		email = "glancejw@hh.ww";
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	


}


