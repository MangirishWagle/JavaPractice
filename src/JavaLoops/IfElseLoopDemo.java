package JavaLoops;
import java.util.Scanner;

public class IfElseLoopDemo {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a statusCode 1: ");
			int statusCode = sc.nextInt();
			System.out.print("Enter a statusCode 2: ");
			int statusCode2 = sc.nextInt();
			if(statusCode == 200) {
				System.out.println("OK. Passed");
			} else {
				System.out.println("Failed");
			}
			
			if(statusCode2 == 500) {
				System.out.println("Internal Server Error");
			} else {
				System.out.println("Failed");
			}
			
		}
		catch (Exception e) {
			System.out.println("Invalid Input entered");
		}
		
	}

}
