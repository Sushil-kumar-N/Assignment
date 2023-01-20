import java.util.Scanner; 
public class ArithmeticAssignment { 

	public static void main(String[] args) { 

		int num1,num2; 

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the first number: "); 
		num1=scanner.nextInt(); 

		System.out.println("Enter the second number: "); 
		num2=scanner.nextInt(); 

		System.out.println("Addition of two numbers:"+(num1+=num2)); 
		System.out.println("Subtraction of two numbers:"+(num1-=num2)); 
		System.out.println("Multiplication of two numbers:"+(num1*=num2)); 
		System.out.println("Division of two numbers:"+(num1/=num2)); 
		System.out.println("Modulus of two numbers:"+(num1%=num2)); 
	} 
}
