// Write code to form American Flag
public class AmericanFlag {

	public static void main(String[] args) {
		
		System.out.println("Americarn Flag");
		System.out.println();
		for(int i = 1; i <= 15; i++)
		{
			if(i % 2 != 0 && i <= 9)
			{
				System.out.println("* * * * * * ------------------------------");
			}
			else if(i % 2 == 0 && i <= 9)
			{
				System.out.println(" * * * * *  ------------------------------");
			}
			else
			{
				System.out.println("------------------------------------------");
			}
		}
	}

}
