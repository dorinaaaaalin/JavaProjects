public class RedZombieDie extends ZombieDie
{
	public RedZombieDie()
	{
		super(RED);
	}
	public void roll()
	{
		int random=(int)(Math.random()*6)+1;
		if(random==1)
		{
			setValue(BRAIN);
		}
		else if(random>1&&random<=3)
		{
			setValue(RUNNER);
		}
		else if(random>3&&random<=6)
		{
			setValue(SHOT);
		}
	}
}