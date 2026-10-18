package JavaLoops;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Iteration number: " + i);
		}
		
		/*
		 * 
		 *	Initialization (int i = 1) --> sets up the loop counter variable i with a starting value of 1.
			
		   	Condition (i <= 5)  --> Before each iteration, Java checks this condition. If it’s true, the loop runs; if false, the loop stops.
			Here, the loop runs as long as i is less than or equal to 5.
			
			Increment (i++)  --> After each iteration, the counter i increases by 1. This ensures the loop progresses and eventually stops.
			
			Loop Body (System.out.println(...))  
			This is the code that executes each time the loop runs. In this case, it prints the current iteration number.
		 * 
		 * */
		

	}

}
