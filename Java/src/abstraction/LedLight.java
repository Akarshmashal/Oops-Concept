package abstraction;

//implementation logic
public class LedLight implements Switch
{

	@Override
	public void sOn() 
	{
		System.out.println("Led Light switch on");
	}

	@Override
	public void sOff() 
	{
		System.out.println("Led Light switch off");
	}

}
