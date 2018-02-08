public class YellowZombieDie extends ZombieDie
{
	public YellowZombieDie()
	{
		super(YELLOW);
	}
	public void roll()
	{
		int random=(int)(Math.random()*6)+1;
		if(random>=1&&random<=2)
		{
			setValue(RUNNER);
		}
		if(random>2&&random<=4)
		{
			setValue(BRAIN);
		}
		else if(random>4&&random<=6)
		{
			setValue(SHOT);
		}
	}
}