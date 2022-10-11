class MyThread1 implements Runnable
{
	/*O/p---5 5  10
	 * Ready Queue ---t1, t2
	 * 
	 *cpu---- t2----------------------t1---------------------t2
	 *		Runnable-run()				Runnable-run()		i=2<=10
	 * 		i=1<=10						i=1<=10
	 * Non Runnable						Non Runnable			Non Runnable
	 */
	public void run()//Runnable
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*5+"\t"+Thread.currentThread().getName());
			try
			{
				Thread.sleep(3000);//Non Runnable
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}//Terminate
}
public class ThreadCreationFirstWay 
{
	public static void main(String[] args) {
		MyThread1 m1=new MyThread1();
		MyThread1 m2=new MyThread1();
		
		//convert our class object into Thread 
		Thread t1=new Thread(m1);//new
		Thread t2=new Thread(m2);
		
		t1.setName("1st Thread");
		t2.setName("2nd Thread");
		
		t1.start();//Ready
		t2.start();
		
	}

}
