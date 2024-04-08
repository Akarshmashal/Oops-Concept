package abstraction;

//implementation logic
public class TubeLight implements Switch
{

	@Override
	public void sOn() 
	{
	System.out.println("Tube Light Switch on ");	
	}

	@Override
	public void sOff()
	{
		System.out.println("Tube Light switch off");
	}
	
}
