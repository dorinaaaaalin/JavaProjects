import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//int player=1;
		int players=0;
		int turn=0;
		int Brains=0;
		int c=1;
		boolean live = false;
		do
		{
			System.out.println("How many players will be playing today?");
			players=keyboard.nextInt();
		}while(players<2||players>5);
		String[] names=new String[players];
		int[] scores=new int[players];
		ZombieDiceBucket bucket = new ZombieDiceBucket();
		ArrayList<ZombieDie> hands=new ArrayList<ZombieDie>();
		ArrayList<ZombieDie> brains=new ArrayList<ZombieDie>();
		ArrayList<ZombieDie> shots=new ArrayList<ZombieDie>();
		ArrayList<ZombieDie> runners=new ArrayList<ZombieDie>();
		
		for(int x=0;x<players;x++)
		{
				System.out.print("Enter a player's name:\n");
				String name=keyboard.next();
				names[x]=name;
		}
		shuffleNames(names);
		do
		{
			turn=(turn+1)%(names.length);
			System.out.println(names[turn]+" it is your turn and you have "+scores[turn]+" brains in your bank.");
			
				do
				{
	
				bucket.loadBucket();//
				System.out.println("Turn summary");
			    System.out.println("\tBrains:"+brains);
			    System.out.println("\tShots:"+shots);
			    System.out.println("\tRunners:"+runners);
			    System.out.println("1.Keep Going");
			    System.out.println("2.Stop & add to bank");
			    System.out.println("Enter selection:");
			    c=keyboard.nextInt();
			    System.out.println("\n");
			    hands.clear();
			    while(runners.size()>0)
			    {
			    	hands.add(runners.remove(0));
			    }
		
			    for(int x=hands.size();x<3;x++)
			    {
			    	ZombieDie y=bucket.draw();
			    	if(y==null)
			    	{
			    		hands.clear();
			    		x=0;
			    		bucket.loadBucket();
			    	}
			    	hands.add(y);
			    
			    }
			    
			    for(ZombieDie y:hands)
			   	{
				   		y.roll();
			   		
		   			if(y.getValue()==ZombieDie.BRAIN)
		   				brains.add(y);
		   			if(y.getValue()==ZombieDie.SHOT)
		   				shots.add(y);
		   			if(y.getValue()==ZombieDie.RUNNER)
		   				runners.add(y);
		   			
		   			
		   		}	
		   		if(c==2)
				{
					shots.clear();
					runners.clear();
					scores[turn]=brains.size();
					brains.clear();
				}
			//call roll on each index
			//count how many have value brain/shots/runner
				if(shots.size()<3)
				{
					live=true;
				}
				else if(shots.size()>=3)
				{
					System.out.println("You got more than 3 shots!");
					brains.clear();
					shots.clear();
					runners.clear();
					break;
				}
				
			
			}while(c==1&&live);
			brains.clear();
			//turn=(turn+1)%(names.length);
			findWinner(names,scores);
		}while(scores[turn]<13);
		//System.out.println(scores[turn]+" WIN!");
		
	}
	public static void shuffleNames(String[] names)
	{
		int z=names.length;
		int x=1;
		int y=1;
		for(int i=1;i<100;i++)
		{
			x=(int)(Math.random()*z);
			y=(int)(Math.random()*z);
			if(x==y)
				i--;
		}
		String temp;
		temp=names[x];
		names[x]=names[y];
		names[y]=temp;
	}
	public static String findWinner(String[] names,int[] scores)
	{
		for(int x=0;x<names.length;x++)
		{
			if(scores[x]>=13)
				return("\n"+names[x]+"wins the game!");
		}
		return "";
	}
}