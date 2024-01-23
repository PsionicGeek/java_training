package basicjava;

public class Account {
	String name;
	int balance;
	int accId;

	public Account(String name, int balance, int accId) {
		super();
		this.name = name;
		this.balance = balance;
		this.accId = accId;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + ", accId=" + accId + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public int debit(int n) {
		if (n < this.balance) {
			int a = this.balance;
			a = a - n;
			return a;
		}
		System.out.println("insufficient balance");
		return this.balance;
	}

	public int credit(int n) {
		return n + this.balance;
	}
}
