package EPAM;
import java.util.HashMap;
import java.util.Map;


public class ShopEg {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org[]={"a","b","c","d"};
		String sold[]={"a","b","d"};
		float orgP[]={12,22,24,20};
		float soldP[]={11,22,24,19};
				
		int cnt=check(org,orgP,sold,soldP);
		System.out.println("Changed Prices count :"+cnt);
	}

	private static int check(String[] org, float[] orgP, String[] sold,float[] soldP) {
		// TODO Auto-generated method stub
		int cnt=0;
		
		for (int i = 0; i < org.length; i++)
		{
			for (int j = 0; j < sold.length; j++)
			{
					if(org[i].equals(sold[j]))
					{
						if(orgP[i]!=soldP[j])
							cnt++;
					}
			}
		}
		
		return cnt;
	}

}
