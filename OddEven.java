import java.util.Scanner;
public class OddEven {

	public static void main(String[] args){

		int number=0;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter the number: ");
		number=scanner.nextInt();

		String result=(number%2==0)?"Even number" :"Odd number";
		System.out.println(result+" "+number);
}
}