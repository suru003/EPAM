package EPAM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ChessQueensCheck {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String string[]=new String[8];
		int inp[][]=new int[8][2];
		for (int j = 0; j < 8; j++) 
		{
		string[j]=scanner.next();
		int in[]=tokenize(string[j]);
		inp[j][0]=in[0];
		inp[j][1]=in[1];
		}
//		for (int i = 0; i < inp.length; i++)
//		{
//		System.out.println(inp[i][0]+" "+inp[i][1]);	
//		}
		int flag=0;
		for(int i=0;i<8;i++)
		{
			if(checkRow(i,inp))
			{
				flag=1;
				break;
			}
			if(checkCol(i,inp))
			{
				flag=1;
				break;
			}
			if(checkDia(i,inp))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("true");
		}
	}

	private static boolean checkRow(int i, int[][] inp) {
		for(int a=0;a<8;a++)
		{
			if(a!=i)
			{
				if(inp[a][0]==inp[i][0])
				{
					if(inp[a][1]>inp[i][1])
					{
						System.out.println("("+inp[i][0]+","+inp[i][1]+")");
						return true;
					}
					else
					{
						System.out.println("("+inp[a][0]+","+inp[a][1]+")");
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean checkCol(int i, int[][] inp) {
		for(int a=0;a<8;a++)
		{
			if(a!=i)
			{
				if(inp[a][1]==inp[i][1])
				{
					if(inp[a][0]>inp[i][0])
					{
						System.out.println("("+inp[i][0]+","+inp[i][1]+")");
						return true;
					}
					else
					{
						System.out.println("("+inp[a][0]+","+inp[a][1]+")");
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean checkDia(int i, int[][] inp)
	{
		for(int a=0;a<8;a++)
		{
			if(a!=i)
			if(Math.abs(inp[i][0]-inp[a][0]) == Math.abs(inp[i][1]-inp[a][1]))
			{
				if(inp[i][0]>inp[a][0])
				{
					System.out.println("("+inp[a][0]+","+inp[a][1]+")");
					return true;
				}
				else
				{
					System.out.println("("+inp[i][0]+","+inp[i][1]+")");
					return true;
				}
			}
		}
		return false;
	}

	private static int[] tokenize(String string) {
		int ret[]=new int[2];
		ret[0]=Character.getNumericValue(string.charAt(1));
		ret[1]=Character.getNumericValue(string.charAt(3));
		return ret;
	}

}
