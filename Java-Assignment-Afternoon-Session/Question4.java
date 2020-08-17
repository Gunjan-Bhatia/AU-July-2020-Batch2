/* Question 4. Find the replacement of continue keyword when you are iterating over a collection using forEach() method.
   eg-List<integer> ints=new ArrayList<>();
      ints.forEach(x->System.out.println(x))
	  
	  Now using this method if we want to skip some object contditionally. Then How are we gonna do. (In for loop we have continue keyword but here how we'll do)
	  Please write a program for the same.

*/
import java.util.ArrayList;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
		
        List<Integer> arr = new ArrayList<>();
         
         for(int i = 0; i < 51; i++)
         {
        	 arr.add(i);
         }
         
         // by using the return it will just skip the present iteration that means it will
         //come out of lambda function
         arr.forEach(x->{
        	 if(x%2==0) 
        		return;
        	 else {
        	 System.out.println(x + " is not a even number");}
         });

	}

}
/*
Output
1 is not a even number
3 is not a even number
5 is not a even number
7 is not a even number
9 is not a even number
11 is not a even number
13 is not a even number
15 is not a even number
17 is not a even number
19 is not a even number
21 is not a even number
23 is not a even number
25 is not a even number
27 is not a even number
29 is not a even number
31 is not a even number
33 is not a even number
35 is not a even number
37 is not a even number
39 is not a even number
41 is not a even number
43 is not a even number
45 is not a even number
47 is not a even number
49 is not a even number

*/
