package abstraction;

//Object creation logic
public class LightFactory 
{
	public static Switch getlight(String type)
	{
		
	
	//Factory or Helper class
	if(type.equalsIgnoreCase("TubeLight"))
	{
		return new TubeLight();
	}
	else if(type.equalsIgnoreCase("LedLight"))
	{
		return new LedLight();
	}
	else
	{
		System.out.println("Invalid Light");
		return null;

	}
}
}
