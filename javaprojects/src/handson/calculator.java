package handson;


import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the basic Calculator");
		System.out.println("Please Enter the two number to perform operation:  ");
		
		num1=sc.nextDouble();
		num2=sc.nextDouble();
	

		System.out.println(" 1. Addition\n 2.Subtraction\n 3.Multiplication\n 4.divison");
		System.out.println("Enter the operation to perform:  ");
		double ch=sc.nextDouble();
		operations o = new operations();
		double res=o.opr(ch,num1,num2);
		System.out.println("The result is: "+res);
		
				
	}
}

