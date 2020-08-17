//Question 1. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     System.out.println("Enter String :");
     String str = s.nextLine();
     System.out.println("Enter regular expression :");
     String pattern = s.nextLine();
     System.out.println();
     System.out.println("Enter replacement :");
     String replacement = s.nextLine();
     
     String result = str.replaceAll(pattern, replacement);
     System.out.println("Result");
     System.out.println(result);
     s.close();  
	}

}
/*
 Output
 Enter String :
Hey Hi
Enter regular expression :
H

Enter replacement :
B
Result
Bey Bi

 */
