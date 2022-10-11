class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*5+"\t"+
		Thread.currentThread().getName()+"\t"
		+Thread.currentThread().getPriority());
			try
			{
				Thread.sleep(3000);//Non Runnable
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadCreationSecondWay
{
	public static void main(String[] args) {
		MyThread2 t2=new MyThread2();
		MyThread2 t1=new MyThread2();
		MyThread2 t3=new MyThread2();

		t1.setName("1st Thread");
		t2.setName("2nd Thread");
		t3.setName("3rd Thread");
		
		t1.setPriority(6);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}






