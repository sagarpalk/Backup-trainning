package Inheritance;
class Abc
{
	int val=400;
	void show()
	{
		System.out.println("Abc Class");
	}
}
class Pqr extends Abc
{
	int val=500;
	void show()
	{
		System.out.println("PQR class");
		System.out.println("Value is:"+val);
		System.out.println("Parent Value is:"+super.val);
		super.show();

	}
}
public class Demo {
	public static void main(String[] args) {
		Pqr p=new Pqr();
		p.show();
	}
}



//class A
//{
//	A()
//	{
//		System.out.println("A");
//	}
//}
//class B extends A
//{
//	B()
//	{
//		super();//Added Implicitly by Compiler during compilation
//		System.out.println("B");
//	}
//}










