import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * SingleThreadPoolExecutor use blocking queue but thread pool sized is only one 
 * If in the middle of task if exception occurred and thread get kill it will create thread
 * again and continue with further tasks.
 */
class My_Task implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class SingleThreadExecutorExample
{
	public static void main(String[] args) {
		ExecutorService s=Executors.newSingleThreadExecutor();
		for(int i=0;i<10;i++)
		{
			s.execute(new My_Task());
		}
	}

}
