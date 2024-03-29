package sports;

class Football extends Player
{
	int goal;
	String Position;
	
	public Football(String name, int age, double height, String country,int goal,String Position)
	{
		super(name, age, height, country);
		this.goal=goal;
		this.Position=Position;
		
	}

	void  displayInfo()
	{
		super.displayInfo();
		System.out.println("player goal is "+this.goal);
		System.out.println("player Position is "+this.Position);
		System.out.println("Rating: "+this.goal);
		
	}

}

