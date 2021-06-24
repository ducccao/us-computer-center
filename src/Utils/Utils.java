package Utils;

public class Utils {
	public Utils() {
		// TODO Auto-generated constructor stub
	}
	
	public String randomString(int n) {
		// n = 5 -> abcde
		// solution 
		// random index in pure string
		String pure="abcdefghijklmnopqrstuvwxyz";
		String carry="";
		String ret="";
		
		for(int i=1;i<=n;++i) {
			int rand=(int)(Math.random()*(n-1+1)+1);
			carry=String.valueOf(pure.charAt(rand));
			ret+=carry;
		}
		
		return ret;
	}
}
