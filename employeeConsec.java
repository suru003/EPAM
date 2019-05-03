package EPAM;
import java.awt.List;
import java.util.Scanner;


public class employeeConsec {

	/**
	 * @param args
	 */
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no. of employees to be checked");
		int m=scanner.nextInt();
		List list=new List();
		System.out.println("Enter the daily employee count for 20 days(if no one enter \"na\")");
		for (int i = 0; i < 20; i++) {
			list.add(scanner.next());
		}
		
		int maxDays=check(m,list);
		
			System.out.println("Max consecutive days of "+m+" is "+maxDays);
		
		
	}
	private static int check(int m, List list) {
		// TODO Auto-generated method stub
		int days=0,temp=0;
		int k=0;
		for (int i = 0; i < list.getItemCount(); i++) {
			if(list.getItem(i).equalsIgnoreCase("na"))
			{
				list.remove(i);
			}
		}
		for (int i = 0; i < list.getItemCount(); i++) {
			if(Integer.parseInt(list.getItem(i))==m)
			{
				temp++;
				k=i+1;
				if(k<list.getItemCount())
				while(Integer.parseInt(list.getItem(k))==m)
				{
					temp++;
					if(k<list.getItemCount())k++;
					else break;
				}
				
				i=k;
			}
			if(days<temp){days=temp;}	
			temp=0;
		}		
		return days;
	}
	

}
