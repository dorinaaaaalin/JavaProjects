public class MyLine
{
	private MyPoint p1;
	private MyPoint p2;
	private double slope;
	private double xInt;
	private double yInt;

	//
	public MyLine(MyPoint p1,MyPoint p2)
	{
		this.p1=p1;
		this.p2=p2;
		slope=(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
		yInt=p1.getY()-slope*p1.getX();
		xInt=-yInt/slope;
	}
	
	public MyPoint getPoint1()
	{ return p1; }
	public MyPoint getPoint2()
	{ return p2; }
	public void setPoint1(MyPoint p1)
	{
		this.p1=p1;
		//
		slope=(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
		yInt=p1.getY()-slope*p1.getX();
		xInt=-yInt/slope;
		
	}
	public void setPoint2(MyPoint p2)
	{
		this.p2=p2;
		//
		slope=(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
		yInt=p1.getY()-slope*p1.getX();
		xInt=-yInt/slope;
	}
	public double getXInt()
	{
	//	xInt=(l2.getYInt-l1.getXInt)/(l1.getSlope-l2.getSlope);
		return xInt;
	}
	public double getYInt()
	{
	//	yInt=l1.getSlope*(xInt)+l1.getXInt;
		return yInt;
	}
	public double getSlope()
	{
		slope=(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
		yInt=p1.getY()-slope*p1.getX();
		xInt=-yInt/slope;
		return slope;
	}
	public String toString()
	{
		String s="";
		s+="Point 1 "+p1+"\n";
		s+="Point 2 "+p2+"\n";
		s+="Slope "+slope+"\n";
		s+="X Intercept:"+xInt+"\n";
		s+="Y Intercept:"+yInt+"\n";
		s+="Equation: y= "+slope+"x + "+yInt+"\n";
		return s;
	}
}