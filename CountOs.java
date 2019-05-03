package EPAM;
import java.util.Scanner;

public class CountOs {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int Os=countOs(num);
		System.out.println("O's in "+num+" : "+Os);
	}
	private static int countOs(int num) {
		int cnt=0;
		int nums[]=intTOarray(num);
		
			for (int i = 0; i < nums.length; i++) {
				switch (nums[i])
				{
					case 1:
					case 2:
					case 3:
					case 4:
					case 7:
					case 5:break;
					case 0:
					case 6:
					case 9:cnt++;break;
					case 8:cnt++;cnt++;break;
					default:break;
				}
			}
		return cnt;
		}
	
	private static int[] intTOarray(int num) {
		int temp=num,size=0;
		while(temp>0)
		{
			size++;
			temp/=10;
		}
		int arr[]=new int[size];
		int ptr=0;
		while(num>0)
		{
			arr[ptr]=num%10;
			num/=10;
			ptr++;
		}
		return arr;
	}
}
