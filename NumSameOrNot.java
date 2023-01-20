import java.util.Scanner; 
public class NumSameOrNot { 

	public static void main(String[] args) { 

		int num1,num2; 

		Scanner scanner=new Scanner(System.in); 
		System.out.println("enter a number: "); 
		num1=scanner.nextInt(); 

		System.out.println("enter another number: "); 
		num2=scanner.nextInt(); 

		while(num1==num2) 
		{ 
			System.out.println("Both the numbers are same"); 
			break; 
		} 
		while(num1!=num2) 
		{ 
			System.out.println("Both the numbers are different"); 
			break; 
		} 
	}
}