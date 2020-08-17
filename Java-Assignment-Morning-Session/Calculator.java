// Code for evaluating expression that involve basic add, subtract, divide, modular.
import java.util.*;

public class Calculator {

	public static int applyOperator(char operator, int value1, int value2) throws Exception {

		switch (operator) {
		case '+':
			return value2 + value1;
		case '-':
			return value2 - value1;
		case '*':
			return value2 * value1;
		case '/':
			if (value1 == 0)
				throw new UnsupportedOperationException("Cannot divide by zero");
			return value2 / value1;
		case '%':
			return value2 % value1;

		}
		return 0;
	}

	public static boolean checkPrecedence(char op1, char op2) {
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/' || op1 == '%') && (op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}

	public static int evaluate(String expression) throws Exception {
		char token[] = expression.toCharArray();

		Stack<Integer> values = new Stack<>();
		Stack<Character> operator = new Stack<>();
		int len = token.length;
		for (int i = 0; i < len; i++) {

			if ((token[i] == '+' || token[i] == '-') && (i == 0 || token[i - 1] == '+' || token[i - 1] == '-'))
				values.push(0);

			if (token[i] >= '0' && token[i] <= '9') 
			{
				StringBuffer num = new StringBuffer();
				
				while (i < len && token[i] >= '0' && token[i] <= '9') 
				{
					num.append(token[i]);
					i++;
				}
				i--;

				values.push(Integer.parseInt(num.toString()));

			} 
			else if (token[i] == '(') 
			{
				operator.push(token[i]);
			} 
			else if (token[i] == ')')
			{
				while (!values.isEmpty() && !operator.empty() && operator.peek() != '(')
				{
					values.push(applyOperator(operator.pop(), values.pop(), values.pop()));

					System.out.println(values.peek());
				}

				operator.pop();
			} 
			else if (token[i] == '+' || token[i] == '-' || token[i] == '*' || token[i] == '/' || token[i] == '%')
			{
				while (!values.isEmpty() && !operator.isEmpty() && checkPrecedence(token[i], operator.peek()))
					values.push(applyOperator(operator.pop(), values.pop(), values.pop()));

				operator.push(token[i]);
			} 
			else {
			try {
				throw new Exception("Expression invalid.");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			}
		}

		while (!operator.empty() && !values.isEmpty())
		{
			values.add(applyOperator(operator.pop(), values.pop(), values.pop()));
		}
		
		if (!values.isEmpty())
			return values.pop();
		else
			return 0;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of test cases");

		int numOfTestCases = s.nextInt();

		while (numOfTestCases-- > 0) {
			System.out.println("Enter expression");
			String expression = s.next();

			try {
				System.out.println("Result : " + evaluate(expression));
			} catch (Exception e) {

				e.printStackTrace();
			}
			System.out.println();
		}
		s.close();
	}

}
/* Output
 Enter number of test cases
5
Enter expression
-5+8*6
Result : 43

Enter expression
(55+9)%9
64
Result : 1

Enter expression
20+-3*5/8
Result : 19

Enter expression
5+15/3*2-8%3
Result : 13

Enter expression
5^2
java.lang.Exception: Expression invalid.
Result : 2

	at Calculator.evaluate(Calculator.java:83)
	at Calculator.main(Calculator.java:115)

 */
