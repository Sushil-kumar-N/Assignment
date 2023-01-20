
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {

		int num1=0,num2=0;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter first number: ");
		num1=scanner.nextInt();
		System.out.println("Enter second number: ");
		num2=scanner.nextInt();

		int add,sub,mul,div,modulo;
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		modulo=num1%num2;

		System.out.println("Addition of two numbers: "+add);
		System.out.println("Subtraction of two numbers: "+sub);
		System.out.println("Multipliucation of two numbers: "+mul);
		System.out.println("Division of two numbers: "+div);
		System.out.println("modulo of two numbers: "+modulo);
	}

}