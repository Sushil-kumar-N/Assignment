import java.util.Scanner; 
public class Age { 

	public static void main(String[] args) { 

		int age; 
		Scanner scanner=new Scanner(System.in); 

		do 
		{ 
			System.out.println("Enter the age of the student: "); 
			age=scanner.nextInt(); 
		}while(age==18 && age<=18); 
		System.out.println("Age is >= 18"); 

	} 
}