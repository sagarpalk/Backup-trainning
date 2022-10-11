package Polymorphism;
class Shape
{
	float ans;
	//Function defination
	void area(float r)
	{
		ans=3.14f*r*r;
		System.out.println("Area of the Circle is :"+ans);
	}
	void area(int s)
	{
		ans=s*s;
		System.out.println("Area of the Square is :"+ans);
	}
	void area(float h,float b)
	{
		ans=.5f*b*h;
		System.out.println("Area of the Triangle is:"+ans);
	}
	
}
public class MethodOverloading
{
	public static void main(String[] args) {
		Shape s=new Shape();
		//Function call
		s.area(2.3f, 5.6f);//T
		s.area(4);//S
		s.area(5f);//C
	}

}







