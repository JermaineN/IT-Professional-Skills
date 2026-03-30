//Jermaine Ntoko G00432103

import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class mathsProject
{
	//creates the necessary objects
	static Random r = new Random();
	static Scanner kb = new Scanner(System.in);


	public static void main(String[] args)
	{
		//creates the board
		String[][] display = new String[10][10];
		int number = 100;

		for (int i = 0; i < display.length; i++)
		{
			for (int j = 0; j < display[0].length; j++)
			{
				display[i][j] = (""+number--);
			}
		}
		//initialises the player positions
		int p1 = 1, p2 = 1, turn = 0;
		board(display, p1, p2);
		//displays message

		System.out.println("Welcome to snakes and ladders!\n");

		
	public static void board(String[][] display, int one, int two)
	{
		int row = 10;
		one = 101 - one;
		two = 101 - two;
		one = snake(one);
		two = snake(two);

		one = ladder(one);
		two = ladder(two);

		int obj = 0;
		//re-creates the board the board
		int number = 100;

		for (int i = 0; i < display.length; i++)
		{
			for (int j = 0; j < display[0].length; j++)
			{
				display[i][j] = (""+number--);
			}
		}
		//snakes
		display[0][2] = "*1";
		display[4][7] = "*1";
		display[1][3] = "*2";
		display[3][5] = "*2";
		display[4][9] = "*3";
		display[6][5] = "*3";
		display[5][1] = "*4";
		display[8][8] = "*4";
		display[7][9] = "*5";
		display[9][2] = "*5";

		//ladders
		display[8][7] = "@1";
		display[9][3] = "@1";
		display[8][9] = "@2";
		display[2][7] = "@2";
		display[6][4] = "@3";
		display[4][2] = "@3";
		display[5][1] = "@4";
		display[8][8] = "@4";
		display[4][0] = "@5";
		display[0][9] = "@5";


		//prints the board and player positions
		for (int i = 0; i < display.length; i++)
		{
			if (one == two)
			{
				obj = 1;
			}

			//identifies the position of player one
			if (one != -11)
			{
				//gets the row number
				if (one/10 > 0)
				{
					//gets the column number
					int check = one%10;
					if (check == 0)
					{
						display[(one/10)-1][9] = ""+(-1);
					}
					else
					{
						display[one/10][check-1] = ""+(-1);
					}

					//makes 'one' equal to -11 to prevent continuous replacements
					one = -11;
				}
				else
				{
					//positions player one
					display[0][one - 1] = ""+(-1);
					one = -11;
				}
			}

			//identifies the position of player two
			if (two != -11)
			{
				//gets the row number
				if (two/10 > 0)
				{
					//gets the column number
					int check = two%10;
					//if player one and two are on the same spot, makes the icon '-3'
					if (obj == 1)
					{
						if (check == 0)
						{
							display[(two/10)-1][9] = ""+(-3);
						}
						else
						{
							display[two/10][check-1] = ""+(-3);
						}
					}
					else
					{
						if (check == 0)
						{
							display[(two/10)-1][9] = ""+(-2);
						}
						else
						{
							display[two/10][check-1] = ""+(-2);
						}
					}
					//makes 'two' equal to -11 to prevent continuous replacements
					two = -11;
				}
				else
				{
					//positions player two
					//if player one and two are on the same spot, makes the icon '-3'
					if (obj == 1)
					{
						display[0][two - 1] = ""+(-3);
					}
					else
					{
						display[0][two - 1] = ""+(-2);
					}
					two = -11;
				}
			}
	}

}
