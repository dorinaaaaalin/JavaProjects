import java.util.Scanner;
public class MainFile
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("---ConnectFourGame---\n");
		int rc;
		int bc;
		int turn;
		boolean test=false;
		
		
		ConnectFourGame c = new ConnectFourGame(); 
		System.out.println("Who are you going to play with?\n11.Your partner\n22.Computer");
		int choice=keyboard.nextInt();
		if(choice==11)
		{
		do
		{
			do
			{
				c.draw();
				System.out.println("Red enter a column for your move <0-6>:");
				rc = keyboard.nextInt();
			/*	if(c.dropPiece(rc,c.RED)=false)
					test=true;*/
			}while(rc<0||rc>6||c.columnFull(rc)==true);
			c.dropPiece(rc,c.RED);
			do
			{
				c.draw();
				System.out.println("Black enter a column for your move <0-6>:");
				bc = keyboard.nextInt();	
			/*	if(c.dropPiece(rc,c.BLACK)=false)
					test=true;*/
			}while(bc<0||bc>6||c.columnFull(bc)==true);
			c.dropPiece(bc,c.BLACK);
		}while(c.status()==c.PLAYING);
		if(c.status()==1)
		{
			System.out.println("Red wins!");
		}
		else if(c.status()==2)
		{
			c.draw();
			System.out.println("Black wins!");
		}
		else
		{
			System.out.println("TIE");
		}
		}
		if(choice==22)
		{
				do
		{
			do
			{
				c.draw();
				System.out.println("Red enter a column for your move <0-6>:");
				rc = keyboard.nextInt();
			/*	if(c.dropPiece(rc,c.RED)=false)
					test=true;*/
			}while(rc<0||rc>6||c.columnFull(rc)==true);
			c.dropPiece(rc,c.RED);
			do
			{
				c.draw();
				System.out.println("Black enter a column for your move <0-6>:");
				bc = (int)(Math.random()*6);	
			/*	if(c.dropPiece(rc,c.BLACK)=false)
					test=true;*/
			}while(bc<0||bc>6||c.columnFull(bc)==true);
			c.dropPiece(bc,c.BLACK);
		}while(c.status()==c.PLAYING);
		if(c.status()==1)
		{
			System.out.println("Red wins!");
		}
		else if(c.status()==2)
		{
			c.draw();
			System.out.println("Computer wins!");
		}
		else
		{
			System.out.println("TIE");
		}
		}
	}
}