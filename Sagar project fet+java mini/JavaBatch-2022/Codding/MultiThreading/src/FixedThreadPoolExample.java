import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * FixedThreadPool used Blocking Queue which hold all the submitted
 * task 
 * Here we have fixed thread pool sized and all threads 
 * are suppose to fetch task from pool and execute it.
 */

class Task implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class FixedThreadPoolExample
{
	public static void main(String[] args) {
	ExecutorService s=Executors.newFixedThreadPool(10);
	for(int i=0;i<20;i++)
	{
		s.execute(new Task());
	}
	
		
	}

}
