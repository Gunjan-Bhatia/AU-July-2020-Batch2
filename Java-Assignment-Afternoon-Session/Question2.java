//Question 2 Demonstrate that local variable used in lamda expression must be final or effectively final and
//instance variable can be changed inside the lambda expression.
/*
 Output
 
Changed value of instance variable b is 11

Changed value of instance variable c is 11

 */
interface Test {
	void func();
}

public class Question2 {

	private int b = 10;
	static int c = 10;

	public static void main(String[] args) {
		// int a = 10;
		Question2 q2 = new Question2();
		Test t = () -> {

			// a = a -1; this will give error since inside lambda function variable can't be
			// changed
			// it should be final or effectively finally(that is assigned only once).
			q2.b = q2.b + 1; // it will not lead to any issue we can easily change it
			// so this demonstrate instance variable need not be final

			System.out.println("Changed value of instance variable b is " + q2.b);
			System.out.println();
			c = c + 1;// it will not lead to any issue we can easily change it
			// so this demonstrate static variable need not be final
			System.out.println("Changed value of instance variable c is " + c);
		};
		t.func();
	}
}
