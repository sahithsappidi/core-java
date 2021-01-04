package Oops;

public class AccountTest {

	public static void main(String[] args) {
		Account a1=new Account(23);
		System.out.println(a1);
		Account a2=new Account(25,999.99);
		System.out.println(a2);
		System.out.println(a2.getNumber());
		System.out.println(a2.getBalance());
		
		a1.credit(21.1);
		System.out.println(a1);
		
		a1.credit(2.3);
		System.out.println(a1);
		
		a2.transferTo(1.0,a1);
		
		System.out.println(a1);
		System.out.println(a2);
	}

}
