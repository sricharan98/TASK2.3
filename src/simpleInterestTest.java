import static org.junit.Assert.*;

import org.junit.Test;

public class simpleInterestTest {

	@Test
	public void simpleInteresttest()
	{
		InterestCalculation ic=new InterestCalculation();
		double result=ic.simpleInterest(10000,4,10);
		assertEquals(4000.0,result,0.1);
	}

}
