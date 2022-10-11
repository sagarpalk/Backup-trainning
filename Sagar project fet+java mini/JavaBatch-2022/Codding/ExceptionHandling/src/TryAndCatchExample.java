import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatchExample
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter 2 no's:");
			int arr[]=new int[3];//index--0,1,2
			arr[0]=s.nextInt();
			arr[1]=s.nextInt();
			arr[2]=arr[0]/arr[1];//----Create object of ArithmeticException--throw
			System.out.println("Division is :"+arr[2]);
			try
			{
				String str="null";
				System.out.println("Length is:"+str.length());
			}
			catch (NullPointerException e) {
				System.out.println(e);
			}
			finally {
				System.out.println("Inner Finally");
			}
		}
		catch (InputMismatchException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);//toString()
			System.out.println("Can't devide ob zero");
		}
		//generic catch block
		catch (Exception e) {
			System.out.println(e);
		}		
		finally
		{
			System.out.println("Outer Finally Block");
		}
		System.out.println("Rest of the code.....");
	}


}
