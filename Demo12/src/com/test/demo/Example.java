package com.test.demo;

public class Example {
	public static int display(int x,int y,int z)
	{
		return x+y+z;
	}
public static void main(String args[])
{
	Example obj=new Example();
	int s1=obj.display(10, 5, 5);
	int s2=obj.display(10, 5, 0);
	System.out.println("Main class Addition is: "+s1);
	System.out.println("Main class Addition with default value: "+s2);
	Multiplication1 a=new Multiplication1();
	System.out.println("Multiplication of Three numbers: "+a.multiply(5, 4, 10));	
}
}

class Multiplication1
{
	int multiply(int a,int b,int c)
	{
		return a*b*c;
	}
}

class Multiplication2 extends Multiplication1
{
	int multiply(int a,int b,int c)
	{
		return a*b*c;
	}
}
