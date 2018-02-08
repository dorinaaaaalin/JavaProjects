import java.util.Scanner;
public class MainFile
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Line one point one....");
		System.out.println("Enter the x value:");
		int l1p1x=kb.nextInt();
		System.out.println("Enter the y value:");
		int l1p1y=kb.nextInt();
		System.out.println("Line one point two....");
		System.out.println("Enter the x value:");
		int l1p2x=kb.nextInt();
		System.out.println("Enter the y value:");
		int l1p2y=kb.nextInt();
		System.out.println("Line two point one....");
		System.out.println("Enter the x value:");
		int l2p1x=kb.nextInt();
		System.out.println("Enter the y value:");
		int l2p1y=kb.nextInt();
		System.out.println("Line two point two....");
		System.out.println("Enter the x value:");
		int l2p2x=kb.nextInt();
		System.out.println("Enter the y value:");
		int l2p2y=kb.nextInt();
		MyLine l1= new MyLine(new MyPoint(l1p1x,l1p1y),new MyPoint(l1p2x,l1p2y));
		MyLine l2= new MyLine(new MyPoint(l2p1x,l2p1y),new MyPoint(l2p2x,l2p2y));
		do
		{
			System.out.println("-Main Menu-");
			System.out.println("1.Change Line 1");
			System.out.println("2.Change Line 2");
			System.out.println("3.View Line 1");
			System.out.println("4.View Line 2");
			System.out.println("5.View Line Intersection");
			System.out.println("6.Exit");
			System.out.println("Enter selection");
			int selection=kb.nextInt();
			if(selection==1)
			{
				System.out.println(l1);
				System.out.println("-Main Menu-");
				System.out.println("1.Change Point 1");
				System.out.println("2.Change Point 2");
				System.out.println("3.Change Both Points");
				System.out.println("4.Cancel");
				System.out.println("Enter selection");
				int selectiont = kb.nextInt();
				if(selectiont == 1)
				{
					System.out.println("Enter the x value:");
					int x=kb.nextInt();
					System.out.println("Enter the y value:");
					int y=kb.nextInt();
					l1.setPoint1(new MyPoint (x,y));
				}
				if(selectiont == 2)
				{
					System.out.println("Enter the x value:");
					int x=kb.nextInt();
					System.out.println("Enter the y value:");
					int y=kb.nextInt();
					l1.setPoint2(new MyPoint (x,y));
				}
				if(selectiont == 3)
				{
					System.out.println("New point one for Line one...");
					System.out.println("Enter the x value:");
					int x=kb.nextInt();
					System.out.println("Enter the y value:");
					int y=kb.nextInt();
					l1.setPoint1(new MyPoint (x,y));
					
					System.out.println("New point two for Line one...");
					System.out.println("Enter the x value:");
					int x2=kb.nextInt();
					System.out.println("Enter the y value:");
					int y2=kb.nextInt();
					l1.setPoint2(new MyPoint (x2,y2));
				}
				if(selectiont == 4)
				{
					System.exit(4);
				}
			}
			if(selection==2)
			{
				System.out.println(l1);
				System.out.println("-Main Menu-");
				System.out.println("1.Change Point 1");
				System.out.println("2.Change Point 2");
				System.out.println("3.Change Both Points");
				System.out.println("4.Cancel");
				System.out.println("Enter selection");
				int selectiont = kb.nextInt();
				if(selectiont == 1)
				{
					System.out.println("Enter the x value:");
					int x=kb.nextInt();
					System.out.println("Enter the y value:");
					int y=kb.nextInt();
					l2.setPoint1(new MyPoint (x,y));
				}
				if(selectiont == 2)
				{
					System.out.println("Enter the x value:");
					int x=kb.nextInt();
					System.out.println("Enter the y value:");
					int y=kb.nextInt();
					l2.setPoint2(new MyPoint (x,y));
				}
				if(selectiont == 3)
				{
					System.out.println("New point one for Line one...");
					System.out.println("Enter the x value:");
					int x=kb.nextInt();
					System.out.println("Enter the y value:");
					int y=kb.nextInt();
					l2.setPoint1(new MyPoint (x,y));
					
					System.out.println("New point two for Line one...");
					System.out.println("Enter the x value:");
					int x2=kb.nextInt();
					System.out.println("Enter the y value:");
					int y2=kb.nextInt();
					l2.setPoint2(new MyPoint (x2,y2));
				}
				if(selectiont == 4)
				{
					System.exit(4);
				}
			}
			if(selection==3)
			{
				System.out.println(l1);
			}
			if(selection==4)
			{
				System.out.println(l2);
			}
			if(selection==5)
			{
				if(l1.getSlope()==l2.getSlope())
				{
					System.out.println("The two lines do not intersect");
				}
				else if(l1.getSlope()!=l2.getSlope())
				{
					double xInt=(l2.getYInt()-l1.getYInt())/(l1.getSlope()-l2.getSlope());
					double yInt=l1.getSlope()*xInt+l1.getYInt();
					System.out.println("("+xInt+","+yInt+")");
				}
			}
			if(selection==6)
			{
				System.exit(6);
			}	
		}while(true);
	}
}