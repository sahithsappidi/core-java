package Oops;

public class Account {
	
	private int number;
	private double balance;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
	      return String.format("Account[number=%d,balance=$%.2f]", number, balance);
	   }
	public Account(int number) {
		this.number=number;
		this.balance=0;	
	}
	public Account(int number,double balance) {
		this.number=number;
		this.balance=balance;
	}
	public void credit(double amount) {
		balance+=amount;		
	}
	public void debit(double amount){
		if(balance>=amount) {
			balance-=amount;
		}else{
			System.out.println("amount exceeded");
		}
	}
	public void transferTo(double amount, Account a1) {
		if(balance>=amount) {
			this.balance-=amount;
			a1.balance+=amount;
		}else {
			System.out.println("amount exceeded");
		}
		
	}

}
