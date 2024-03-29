package sports;

public class Player
{
	String name;
	int age;
	double height;
	String country;

	public Player(String name, int age, double height, String country) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.country = country;
	}

	void  displayInfo()
	{
		System.out.println("------Player Information--------");
		System.out.println("player name is "+name);
		System.out.println("player age is "+age);
		System.out.println("player height is "+height);
		System.out.println("player country is "+country);
	}
	
}
