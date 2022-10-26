package operators;
import java.util.Scanner;
public class IncrDecr {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value for increment");
	
	int a = sc.nextInt();
	System.out.println("increment of a is"+(++a));
	System.out.println("enter a value for decrement");
	int b = sc.nextInt();
	sc.close();
	System.out.println("decrement of b is"+(--b));
	}

}
