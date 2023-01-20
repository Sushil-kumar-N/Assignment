import java.util.Scanner; 
public class Logical { 

	public static void main(String[] args) { 

		int num1=0,num2=0; 

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the first number: "); 
		num1=scanner.nextInt(); 

		System.out.println("Enter the second number: "); 
		num2=scanner.nextInt(); 

		System.out.println((num1>num2)&&(num1<num2)); 
		System.out.println((num1<num2)&&(num1>num2)); 
		System.out.println((num1>num2)||(num1<num2)); 
		System.out.println((num1<num2)||(num1>num2)); 

	} 
}