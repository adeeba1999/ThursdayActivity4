package com.Student;
class Student
{
	 String name;
	 String id;
	 double grade;
	 int age;
	 Student (String name, String id, int age )
	 {
		 this.name=name;
		 this.id=id;
		 this.age=age;
	 }
	 boolean isPassed(float grade)
	 {
		 return true;
	 }
}
class UnderGrad extends Student 
{
	UnderGrad(String name, String id, int age)
	{
		super(name,id,age);
	}
	
	boolean isPassed(float grade)
	{
		if(grade>=70.00)
		{
			return super.isPassed(grade);
					
		}
		else
		{
			return false;
		}
	}
}
class Grad extends Student
{
	Grad(String name,String id,int age)
	{
		super(name,id,age);
	}
	boolean isPassed(float grade)
	{
		if(grade>=80)
		{
			return super.isPassed(grade);
					
		}
		else
		{
			return false;
		}
	}
	
}
public class StudentDetails {

	public static void main(String[] args) {
		Grad g=new Grad("shabistha","890",22);
System.out.println("Grad is passed:"+g.isPassed(90));
UnderGrad ug=new UnderGrad("Shaistha","789",25);
System.out.println("UnderGrad is passed:"+ug.isPassed(50));

	}

}
