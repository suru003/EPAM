package EPAM;

public class StringComp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Kam";
		String string2="Jon";
		String res=compare(string,string2);
		System.out.println(res);
		}

	private static String compare(String string, String string2) {
		// TODO Auto-generated method stub
		char []str1=string.toCharArray();
		char []str2=string2.toCharArray();
		int n=str1.length;
		if(str2.length>n){n=str2.length;}
		
		for (int i = 0; i < n; i++) {
			if(i>=str1.length){return string;}
			if(i>=str2.length){return string2;}
			if(str1[i]>str2[i]){return string;}
			else return string2;
		}
		return null;
	}
}
