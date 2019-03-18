/**
 *THIS PROGRAM WILL CALCULATE THE SIMPLE INTEREST AND COMPOUND INTEREST
 * @author Nannuri.SriCharanReddy
 */
import java.lang.Math;
public class InterestCalculation
{
	//Calculate simple interest
	public double simpleInterest(int principle,int time,double rateOfInterest)
	{
		return (principle*time*rateOfInterest)/100;
	}
	//Calculate compound interest
	public double compoundInterest(int principle,int time,double rateOfInterest)
	{
		return principle*(Math.pow((1+rateOfInterest/100),time));
	}
}