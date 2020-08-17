// Question 3. Write your own unchecked Exception and throw it from you counter programme which counts 1 to 100.
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
