import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * CacheThredPool used synchronous queue which
 * can hold simultaneously only one submitted task
 * In CacheThreadPool no thread pool size is not fixed
 * If required it will keep creating threads if existing 
 * thread is not available
 * And if Thread idle for more than 60sec
 *  it will then thread get kill
 */
class MyTask1 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class CacheThredPool {
	public static void main(String[] args) {
		ExecutorService s=Executors.newCachedThreadPool();
		for(int i=1;i<20;i++)
		{
			s.execute(new MyTask1());
		}
	}

}


















