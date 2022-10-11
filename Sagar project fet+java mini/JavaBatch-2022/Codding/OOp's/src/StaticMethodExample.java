class Circle
{
	static float pi=3.14f,ans;//Instance
	
	static void area(float r)
	{
		ans= pi*r*r;
		show();
	}
	static void show()
	{
		System.out.println("Area of the circle is:"+ans);
	}
}
public class StaticMethodExample {
	public static void main(String[] args) {
		Circle.area(2.3f);
	}
}
