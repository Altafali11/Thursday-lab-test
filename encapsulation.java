package test;

public class Account {
	private float balance;
	private String Account_branch;
	private String email;
	private float accountno;
	
	// use getter setter
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAccountno() {
		return accountno;
	}
	public void setAccountno(float accountno) {
		this.accountno = accountno;
	}
	public String getAccount_branch() {
		return Account_branch;
	}
	public void setAccount_branch(String account_branch) {
		Account_branch = account_branch;
	}
	public static void main(String[] args) {
		// create instance of Account class
	 Account ac = new Account();
	 ac.setBalance(10000f);
	 ac.setEmail("altaf91ali@gmail.com");
	 ac.setAccountno(127000f);
	 ac.setAccount_branch("Jhansi");
	 System.out.println(ac.getBalance());
	 System.out.println(ac.getEmail());
	 System.out.println(ac.getAccountno());
	 System.out.println(ac.getAccount_branch());
	 
	 
	}
		
}
