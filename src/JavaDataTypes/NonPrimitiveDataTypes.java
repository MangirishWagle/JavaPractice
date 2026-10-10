package JavaDataTypes;

class Student {
	String name;
	int age;
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void displayInfoOfStudent() {
		System.out.println("Name of Student is: " + name);
		System.out.println("Age of Student is: " + age);
	}
}

public class NonPrimitiveDataTypes {
	public static void main(String[] args) {
		//Example of Class as non-primitive data type
		Student student = new Student("Mangirish", 38);
		student.displayInfoOfStudent();
		
		
		//Example of String as non-primitive data type and using String methods
		String myName = "Mangirish Wagle";
		System.out.println("My name in Lower case is: " + myName.toLowerCase());
		System.out.println("My name in upper case is: " + myName.toUpperCase());
		
		//Example of array as non-primitive data type and using Array methods
		int[] marks = {90, 85, 93};
		System.out.println("First mark is: " + marks[0]);
		System.out.println("Length of marks is: " + marks.length);
		int sumOfMarks = 0;
		for(int mark: marks) {
			sumOfMarks += mark;
		}
		System.out.println("Sum of marks is: " + sumOfMarks);
		
	}
	
	
}
