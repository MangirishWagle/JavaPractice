package JavaSingletonClass;

public class LoggerSingletonClass {

	//Step 1: Create a private static instance
	private static LoggerSingletonClass singleLoggerInstance;
	
	private static LoggerSingletonClass secondLoggerInstance;
	
	//Step 2: Create a private constructor
	 private LoggerSingletonClass() {
	        System.out.println("Logger initialized...");
	 }
	
	public static LoggerSingletonClass getFirstLoggerInstance() {
		if(singleLoggerInstance == null) {
			singleLoggerInstance = new LoggerSingletonClass();
			
		} 
		return singleLoggerInstance;
		
	}
	
	public static LoggerSingletonClass getSecondLoggerInstance() {
	
		if(secondLoggerInstance == null) {
			singleLoggerInstance = new LoggerSingletonClass();
			
		}
		return secondLoggerInstance;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Single Log generated ");
		System.out.println("Second Log generated ");
	}

}
