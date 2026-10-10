package JavaDataTypes;

public class VariablesOperators {

	public static void main(String[] args) {
		
		//Primitive variables
		int num1 = 100;
		int num2 = 200;
		int[] numbers = {10, 230, 21, 23, 33, 89};
		
		//Non-primitive variables
		String message = "Hello Java!";
		char grade = 'A';
		
		//Arithmetic Operators
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		//Relational Operators
		boolean isEqual = (num1 == num2);
		boolean isGreater = (num1 > num2);
		boolean isSmaller = (num1 < num2);
		
		//Logical Operators
		boolean andResult = (num1 > 0 && num2 > 0);
		boolean orResult = (num1 > 0 || num2 < 0);
		boolean notResult = !(num1 == num2);
		
		//Unary Operators
		int unaryNumToDecrement = 10;
		int preDecrementUnaryNum = --unaryNumToDecrement;
		
		
		int postDecrementUnaryNum = unaryNumToDecrement--;
		
		int unaryNumToIncrement = 20;
		int preIncrementUnaryNum = ++unaryNumToIncrement;
		int postIncrementUnaryNum = unaryNumToIncrement++;
		
		int negativeUnaryNum = -unaryNumToIncrement;
		
		//Assignment Operators
		int assignExample = 20;
		assignExample += 5;
		assignExample -= 1;
		assignExample *= 2;
		
		
		System.out.println("\n\nArithmetic Operators:");
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        System.out.println("\nRelational Operators:");
        System.out.println("isEqual = " + isEqual);
        System.out.println("isGreater = " + isGreater);
        System.out.println("isLess = " + isSmaller);

        System.out.println("\nLogical Operators:");
        System.out.println("AND Result = " + andResult);
        System.out.println("OR Result = " + orResult);
        System.out.println("NOT Result = " + notResult);

        System.out.println("\nAssignment Operators:");
        System.out.println("assignExample = " + assignExample);

        System.out.println("\nUnary Operators:");
        
        System.out.println("Pre-decremented unaryNum: " + preDecrementUnaryNum);
        System.out.println("unaryNum value: " + unaryNumToDecrement);
        
        System.out.println("Post-decremented unaryNum: " + postDecrementUnaryNum);
        System.out.println("unaryNum value: " + unaryNumToDecrement);
        
        System.out.println("Pre-incremented unaryNum: " + preIncrementUnaryNum);
        System.out.println("unaryNum value: " + unaryNumToIncrement);
        
        System.out.println("Post-incremented unaryNum: " + postIncrementUnaryNum);
        System.out.println("unaryNum value: " + unaryNumToIncrement);
        
        System.out.println("Negative unaryNum: " + negativeUnaryNum);
	}

}

