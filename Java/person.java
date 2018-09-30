import java.io.*;
import java.util.*;
class person
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
		String name;
		int age;
		System.out.println("Please Enter the name");
		name=input.next();
		System.out.println("Enter the age of the person");
		age=input.nextInt();
		System.out.print("The name is "+name+"and age is "+age);
	}
}
