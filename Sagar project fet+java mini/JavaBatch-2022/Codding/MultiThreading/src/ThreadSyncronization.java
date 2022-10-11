
class PrintTable
{
	synchronized public void table(int no)
	{
		//synchronized (this)
		//{
				for(int i=1;i<=10;i++)
				{
					System.out.println(no*i);
					try
					{
						Thread.sleep(3000);
					}
					catch (InterruptedException e) {
					System.out.println(e);
					}
				}
		//}
	}
}
class MyThread3 extends Thread
{
	PrintTable t;//reference
	
	public MyThread3(PrintTable t) {
		this.t=t;//Object
	}
	
	public void run()
	{
		t.table(3);
	}
	
}

class MyThread4 extends Thread
{
	PrintTable t;
	
	MyThread4(PrintTable t)
	{
		this.t=t;
	}
	public void run()
	{
		t.table(7);
	}
}


public class ThreadSyncronization 
{
	public static void main(String[] args) {
		PrintTable  t=new PrintTable();
		
		MyThread3 t1=new MyThread3(t);
		MyThread4 t2=new MyThread4(t);
		
		t1.start();
		t2.start();
	}

}











