/** 
 * This class details a simple loop that prints HelloWorld ten times using a for loop
 * <p>
 *  This is being used in the preliminary investigation of normalizing Java code to a restricted
 *  and standard subset. The simplest test of this idea is to normalize all loops to the same
 *  looping construct.  Ideally, an assemply representation is best because of the restricted use
 *  of language constructs/is less expressive, and limited key words.
 *
 * @author Paul deGrandis
 **/
public class SimpleFor
{

	public static void main(String[] args)
	{
		testMethA();

		for(int i=0; i<10; i++)
		{
			System.out.println("Hello World");
		}
	}
	
	public static void testMethA()
	{
		System.out.println("Hello from A");
	}
}

