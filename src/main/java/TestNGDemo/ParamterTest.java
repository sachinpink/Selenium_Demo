package TestNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest 
{
	@Parameters("browser")
	@Test
	public void testparameter(String bro)
	{
		if(bro.equalsIgnoreCase("chrome1S"))
		{
			System.out.println("launched chrome browser");
		
		}
		else
		{
			System.out.println("launched firefox browser");
		}
	}

}
