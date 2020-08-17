// Question 1. Create a functional interface and use - lambda, static method, instance method and contructor references to instantiate it.
/*
 Output
 
 Output of Instance by lambda method: 80
Output of Instance by static method: -20
Output of Instance by instance method: 1500
It is for showing that how functional interface are instantiated via constructor

 */
@FunctionalInterface
interface Calculator {
	long calculate(long num1, long num2);
}

@FunctionalInterface
interface Display {
	void print(String s);
}

public class Question1 {

	public Question1() {

	}

	public Question1(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		// Instantiating by lambda method
		Calculator calc = (n1, n2) -> n1 + n2;
		System.out.println("Output of Instance by lambda method: " + calc.calculate(30, 50));

		// Instantiating by static method
		Calculator calc1 = Question1::subtract;
		System.out.println("Output of Instance by static method: " + calc1.calculate(30, 50));

		// Instantiating by instance method
		Question1 object = new Question1();
		Calculator calc2 = object::multiply;
		System.out.println("Output of Instance by instance method: " + calc2.calculate(30, 50));

		// Instantiating by constructor method
		String str = "It is for showing that how functional interface are instantiated via constructor";
		Display display1 = Question1::new;
		display1.print(str);
	}

	public static long subtract(long num1, long num2) {
		return num1 - num2;
	}

	public long multiply(long num1, long num2) {
		return num1 * num2;
	}
}
