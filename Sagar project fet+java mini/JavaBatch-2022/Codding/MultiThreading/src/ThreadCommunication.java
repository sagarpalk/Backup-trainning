class Account
{
	int act_bal;
	
	Account(int act_bal)
	{
		this.act_bal=act_bal;
	}
	synchronized public void deposit(int dbal)
	{
		System.out.println("Going To Deposit!!!!");
		act_bal=act_bal+dbal;
		System.out.println("Deposit Complete Balance:"+act_bal);
		notify();
	}
	synchronized public void withdraw(int wbal)
	{
		System.out.println("Going to withdraw");
		if(wbal>act_bal)
		{
			System.out.println("Less balance waitting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		act_bal =act_bal-wbal;
		System.out.println("Withdraw complete Balance:"+act_bal);
	}
}
public class ThreadCommunication
{
	public static void main(String[] args) {
		Account a=new Account(60000);
		
		Runnable r1=()->{
			a.withdraw(80000);
		};
		
		Runnable r2=()->a.deposit(40000);
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
