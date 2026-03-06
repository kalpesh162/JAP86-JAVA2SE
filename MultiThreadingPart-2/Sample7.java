class Account{
	 int balance=5000;
	 public synchronized  void deposit(int amt){
	 		System.out.println("deposit  Current balance is    "+this.balance);
	 		this.balance+=amt;
	 		System.out.println("deposit  Updated balance is    "+this.balance);

	 		notify();
	 }

	 public synchronized void withdraw(int amt){
	 	System.out.println("Before withdraw  Current balance is    "+this.balance);

	 	if(amt>this.balance){
	 		try{wait();}catch(InterruptedException e){}  // Lock release
	 	}

	 	this.balance-=amt;

		System.out.println("After withdraw  Current balance is    "+this.balance);	 	
	 }
}

class Ram extends Thread{
	private Account account;
	public Ram(Account account){ this.account=account;}
	 @Override
	 public void run(){
	 		account.deposit(5000);
	 }
}


class Shyam extends Thread{
	private Account account;
	public Shyam(Account account){ this.account=account;}
	 @Override
	 public void run(){
	 		account.withdraw(10000);
	 }
}

public class Sample7{
	public static void main(String[] args) {
			final Account account=new Account();
			Ram t1=new Ram(account);
			t1.setName("Ram");
			Shyam t2=new Shyam(account);
			t2.setName("Shyam");

			t1.start();
			t2.start();

	}

}