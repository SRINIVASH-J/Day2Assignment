package week1.day2;

public class Mobile {
public void sendsms() {
	System.out.println("redmi");
}
public long makecall(long phno) {
	return phno;
}


	public static void main(String[] args) {
		Mobile s=new Mobile();
		
	//	mobileObj.sendsms();
		long phonenumber=s.makecall(7708380);
		s.sendsms();
		System.out.println("phone number:" + phonenumber);
		
	}
	
}