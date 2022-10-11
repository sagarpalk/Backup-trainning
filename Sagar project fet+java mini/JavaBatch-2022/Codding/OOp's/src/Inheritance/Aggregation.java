package Inheritance;
class Student
{
	int id;
	String name;
	float per;
	Date dob;//reference
	
	Student(int id,String name,
			float per,Date dob)
	{
		this.id=id;
		this.name=name;
		this.per=per;
		this.dob=dob;//Object
	}
	public String toString()
	{
		return
	id+"\t"+name+"\t"+per+"\t"+dob;
	}
}
public class Aggregation
{
	public static void main
	(String[] args) 
	{
Date obj=new Date(26, 03, 1990);
		Student s1=
new Student(1, "Amit", 76.46f,obj);
		System.out.println(s1);//toString()
	}

}


/*
 * Address class---state /pincode/ dist
 * ---const/toString
 * Employee---id name,salary, 
 * Date date_joining,Address add;
 * Const/toString
 * 
 */







