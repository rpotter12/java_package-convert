package convert;
public class FahToKel
{
	public double ftk(double a)
	{
		double b,c;
		b=((a-32)*5)/9;
		c=b+273.15;
		return c;
	}
}