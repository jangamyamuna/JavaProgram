package packageA1;

public class ClassSum
{
	void sum()
	{
		int sum= 0;
		for(int i=7;i<=21;i++)
		{
			if(i%2!=0)
			{
				sum = sum+i;
			}
		}
		System.out.println("Sum of numbers: "+sum);
	}
	public static void main(String[] args)
	{
		ClassSum c =new ClassSum();
		c.sum();
	}
}