public class GreenZombieDie extends ZombieDie
{
	public GreenZombieDie()
	{
		super(GREEN);
	}
	public void roll()
	{
		int random=(int)(Math.random()*6)+1;
		if(random==1)
		{
			setValue(SHOT);
		}
		if(random>=2&&random<=3)
		{
			setValue(RUNNER);
		}
		else if(random>=4&&random<=6)
		{
			setValue(BRAIN);
		}
	}
}