//Question 3. Write your own unchecked Exception and throw it from you counter programme which counts 1 to 100.
//When you get Prime no while counting then throw this Exception and catch this to print you exception message.

class primeNumberException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
}
public class Question3 {

	//function for pre-calculating prime numbers
	public static void primeSeive(boolean visited[])
	{
		int len = visited.length;
		for(int i = 1; i < len; i++)
			visited[i] = false;
		
		visited[1] = true;
		visited[0] = true;
		
		for(int i = 2; i < len; i++)
		{
			if(visited[i] == false)
			{
				for(int p = i * i; p < len; p = p + i)
				{
					visited[p] = true;
				}
			}
		}
	}
	public static void counter(int num, boolean visited[]) 
	{
	   int len = visited.length;
	   for(int i = num; i < len; i++)
	   {
		   if(!visited[i])
		   {
			   try {
				throw new primeNumberException();
			} catch (primeNumberException e) {
			
				System.out.println(i + " is prime number");
				e.printStackTrace();
				
			}
		   }
	   }
	}
	public static void main(String[] args)
	{
		int len = 101;
		boolean visited[]=new boolean[len];
         
		primeSeive(visited);
		//after this call one which are marked false are prime
		counter(0, visited);
	}
}

/*
Output
2 is prime number
primeNumberException
3 is prime number
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
5 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
7 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
11 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
13 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
17 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
19 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
primeNumberException
23 is prime number
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
29 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
31 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
37 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
41 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
43 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
47 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
53 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
59 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
61 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
67 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
71 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
73 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
79 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
83 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
89 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)
97 is prime number
primeNumberException
	at Question3.counter(Question3.java:41)
	at Question3.main(Question3.java:58)

 */
