package sports;

class Cricket extends Player
{
	int runs;
	int Wicket;
	
	public Cricket(String name, int age, double height, String country,int Wicket,int runs) 
	{
		super(name, age, height, country);
		this.Wicket=Wicket;
		this.runs=runs;
	}

	void  displayInfo()
	{
		super.displayInfo();
		System.out.println("player Wickets is "+this.Wicket);
		System.out.println("player run is "+this.runs);
		System.out.println("Rating: "+(this.Wicket+this.runs)/2);
		
	}
}