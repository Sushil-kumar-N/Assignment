import java.util.Scanner; 
public class Relational{ 

	public static void main(String[] args){ 

		int num1,num2; 

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the first number: "); 
		num1=scanner.nextInt(); 

		System.out.println("Enter the second number: "); 
		num2=scanner.nextInt(); 

		System.out.println(num1+" < "+num2+(num1<num2)); 
		System.out.println(num1+" > "+num2+(num1>num2)); 
		System.out.println(num1+" <= "+num2+(num1<=num2)); 
		System.out.println(num1+" >= "+num2+(num1>=num2)); 
		System.out.println(num1+" != "+num2+(num1!=num2)); 
		System.out.println(num1+" == "+num2+(num1==num2)); 

	} 
}