package operators;
import java.util.Scanner;
public class Logical {
	public static void main(String[]args) {
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		value=sc.nextInt();
		sc.close();
		if((value>=10)&&(value%2==0)) {
				System.out.println("Vaue>10 and even");
			
		}
		else {
			System.out.println("Condition not met");
	}
}
}
