
public class FinallyBlockExample
{
	public static void main(String[] args) {
		try
		{
			String str=null;
			System.out.println("Length is:"+str.length());
		}
		finally {
			System.out.println("finally Block...");
		}
		System.out.println("Rest of the code....");
	}

}
