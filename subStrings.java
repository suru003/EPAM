package EPAM;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class subStrings {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the String");
		String string=scanner.next();
		long  count=0;
		Set<String> set=new HashSet<>();

		for (int i = 0; i <string.length(); i++)
		{
			for (int j = string.length(); j >i ; j--)
			{
				if(!set.contains(string.substring(i, j)))
				{
				System.out.println(string.substring(i, j));
				set.add(string.substring(i, j));
				count++;
				}
			}				
		}
	System.out.println("\nCount "+count);
	}
}
