import java.util.ArrayList;
public class ZombieDiceBucket
{
	private ArrayList<ZombieDie> bucket;
	
	public ZombieDiceBucket()
	{
		bucket=new ArrayList<ZombieDie>();
		
	}
	
	public void loadBucket()
	{
		bucket.clear();
		for(int a=0;a<=5;a++)
		{
			bucket.add(new GreenZombieDie());
		}
		for(int a=0;a<=3;a++)
		{
			bucket.add(new YellowZombieDie());
		}
		for(int a=0;a<=2;a++)
		{
			bucket.add(new RedZombieDie());
		}
	}
	public ZombieDie draw()
	{
		int size = bucket.size();
		int random=(int)(Math.random()*size-1);
		if(bucket.size()==0)
		{
			return null;
		}
		else
		{
			return bucket.remove(random);
		}
	}
}