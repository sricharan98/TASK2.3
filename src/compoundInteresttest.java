import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Nannuri.SriCharanReddy
 *
 */
public class compoundInteresttest {

	@Test
	public void compoundinteresttest()
	{
		InterestCalculation ic=new InterestCalculation();
		double result=ic.compoundInterest(10000,4,10);
		assertEquals(14641.0,result,0.1);
	}

}
