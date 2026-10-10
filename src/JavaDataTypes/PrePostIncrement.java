package JavaDataTypes;

public class PrePostIncrement {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int preIncrementResult = ++a;
		System.out.println("Pre incremented result: " + preIncrementResult);
		System.out.println("Value of a is: " + a);
		
		int postIncrementResult = b++;
		System.out.println("Post incremented result: " + postIncrementResult);
		System.out.println("Value of b is: " + b);
		
		//Demonstrating in expressions
		int x = 10;
		int y = ++x + 2; //x increments itself to 11 and adds 2 and becomes 13
		System.out.println("Value of y is: " + y);
		
		int v = 10;
		int w = v++ + 2; //v first adds 2 and becomes 12, then value of v increases to 11
		System.out.println("Value of w is: " + w);
		System.out.println(v);

	}

}
