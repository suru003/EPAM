package EPAM;

import java.util.Scanner;

public class StringMerge {

	/**
	 * @param args
	 */
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1,str2;
		System.out.println("Enter 1st");
		str1=scanner.next();
		System.out.println("Enter 2nd");
		str2=scanner.next();
		
		String res=merge(str1,str2);
		System.out.println(res);
	}
	private static String merge(String str1, String str2) {
		// TODO Auto-generated method stub
		char [] arr1=str1.toCharArray();
		char [] arr2=str2.toCharArray();
		StringBuffer stringBuffer=new StringBuffer();
		
		int i=0,j=0;
		
		for (int t = 0; t < str1.length()+str2.length(); t++) {
			if(t%2==0)
				{
				stringBuffer.append(arr1[i]);
				i++;
				}
			else
			{
				stringBuffer.append(arr2[j]);
				j++;
				
			}
		}
		if(i<arr1.length){for (int l = i; l < arr2.length; l++) {
			stringBuffer.append(arr1[l]);
		}
		if(j<arr2.length){for (int l = j; l < arr2.length; l++) {
			stringBuffer.append(arr2[l]);
		}
		
		
		}
		}
		return stringBuffer.toString();
	
	}
}

//