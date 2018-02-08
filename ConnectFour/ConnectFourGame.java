//Lin,Xinzhe Period:7th
public class ConnectFourGame
{
	private int[][]board=new int[6][7];
	public static final int PLAYING=0;
	public static final int RED_WINS=1;
	public static final int BLACK_WINS=2;
	public static final int DRAW=3;
	public static final int RED=4;
	public static final int BLACK=5;
	public static final int EMPTY=6;
	
	public ConnectFourGame()
	{
		for(int x=0;x<board.length;x++)
		{
			for(int y=0;y<board[0].length;y++)
			{
				board[x][y]=EMPTY;
			}
		}
	}
	public boolean dropPiece(int column,int player)
	{
		for(int x=5;x>=0;x--)
		{
			if(board[x][column]==EMPTY)
			{	
				board[x][column]=player;
				return true;
			}
		}
		return false;
	}
	public int status()
	{
		for(int r=0;r<board.length;r++)//h
		{
			for(int c=0;c<board[0].length-3;c++)
			{
				if(board[r][c]==RED&&board[r][c+1]==RED&&board[r][c+2]==RED&&board[r][c+3]==RED)
					return RED_WINS;
				else if(board[r][c]==BLACK&&board[r][c+1]==BLACK&&board[r][c+2]==BLACK&&board[r][c+3]==BLACK)
					return BLACK_WINS;
				
			}
		}
		for(int r=5;r<board.length;r++)//h
		{
			for(int c=6;c<board[0].length-3;c--)
			{
				if(board[r][c]==RED&&board[r][c+1]==RED&&board[r][c+2]==RED&&board[r][c+3]==RED)
					return RED_WINS;
				else if(board[r][c]==BLACK&&board[r][c+1]==BLACK&&board[r][c+2]==BLACK&&board[r][c+3]==BLACK)
					return BLACK_WINS;
			}
		}
		for(int r=0;r<board.length-3;r++)//v
		{
			for(int c=0;c<board[0].length;c++)
			{
				if(board[r][c]==RED&&board[r+1][c]==RED&&board[r+2][c]==RED&&board[r+3][c]==RED)
					return RED_WINS;
				else if(board[r][c]==BLACK&&board[r+1][c]==BLACK&&board[r+2][c]==BLACK&&board[r+3][c]==BLACK)
					return BLACK_WINS;
			}
		}
		for(int r=0;r<board.length-3;r++)//d
		{
			for(int c=0;c<board[0].length-3;c++)
			{
				if(board[r][c]==RED&&board[r+1][c+1]==RED&&board[r+2][c+2]==RED&&board[r+3][c+3]==RED)
					return RED_WINS;
				else if(board[r][c]==BLACK&&board[r+1][c+1]==BLACK&&board[r+2][c+2]==BLACK&&board[r+3][c+3]==BLACK)
					return BLACK_WINS;
			}
		}
		for(int r=0;r<=3;r++)//d
		{
			for(int c=6;c>=3;c--)
			{
				if(board[r][c]==RED&&board[r+1][c-1]==RED&&board[r+2][c-2]==RED&&board[r+3][c-3]==RED)
					return RED_WINS;
				else if(board[r][c]==BLACK&&board[r+1][c-1]==BLACK&&board[r+2][c-2]==BLACK&&board[r+3][c-3]==BLACK)
					return BLACK_WINS;
			}
		}    
		for(int r=0;r<board.length;r++)
		{
			for(int c=0;c<board[0].length;c++)
			{
				if(board[r][c]==EMPTY)
					return PLAYING;
			}
		}
		return DRAW;
	}
	public boolean columnFull(int column)
	{
		if(board[0][column]!=EMPTY)
			return true;
		else
			return false;
	}
	public void draw()
	{
		for (int r=0;r<board.length;r++)
		{
			System.out.print("|"); 
			for(int c=0;c<board[0].length;c++)
			{
				if (board[r][c]== EMPTY)
					System.out.print("   |");
				else if(board[r][c] == RED)
					System.out.print(" R |");
				else
					System.out.print(" B |");
			}
			System.out.print("\n");
		}	
	}
	public int getSpot(int row,int col)
	{
		if(row<=5&&col<=5&&row>0&&col>0)
			return board[row][col];
		else
			return -1;
	}
}
	
