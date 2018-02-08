public abstract class ZombieDie
{
	public static final int NOT_ROLLED=0;
	public static final int RUNNER=1;
	public static final int BRAIN=2;
	public static final int SHOT=3;
	public static final int RED=1;
	public static final int GREEN=2;
	public static final int YELLOW=3;
	private int dieColor;
	private int value;
	
	public ZombieDie(int dieColor)
	{
		this.dieColor=dieColor;
		this.value=NOT_ROLLED;
	}
	
	public int getValue()
	{ return value; }
	
	public int getDieColor()
	{ return dieColor; }
	
	public void setDieColor(int dieColor)
	{ this.dieColor=dieColor; }
	
	public void setValue(int value)
	{ this.value=value; }
	
	public String toString()
	{
		String s="";
	
			if(dieColor==RED)
				s+="Red";
			if(dieColor==GREEN)
				s+="Green";
			if(dieColor==YELLOW)
				s+="Yellow";
	
		if(value!=NOT_ROLLED)
		{
			if(value==RUNNER)
				s+="-Runner";
			if(value==SHOT)
				s+="-Shot";
			if(value==BRAIN)
				s+="-Brain";
		}
		return s;
	}
	public abstract void roll();
}