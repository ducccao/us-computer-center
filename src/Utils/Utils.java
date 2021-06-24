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
	
	public void logArray1DimenssonalString(String a[]) {
		for(int i=0;i<a.length;++i)System.out.print(a[i]+" ");
		System.out.println("");
	}
	
	public String[] addEleIntoArray1DimesonalString(String[] a,String ele) {
		if(a.length==0)
		{
			String []ret=new String[1];
			ret[0]=ele;
			return ret;
		}
		String[]ret=new String[a.length+1];
		
		for(int i=0;i<a.length;++i) {
			ret[i]=a[i];
		}
		ret[ret.length-1]=ele;
		
		return ret;
	
	}
	
	public void logArr2String(String[][]a) {
		for(int i=0;i<a.length;++i) {
			for(int j=0;j<a[i].length;++j) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public String[][] addArr1StrIntoArr2String(String[][]a2,String[]a1) {
		// function: add array 1 dimessonal into array 2 dimessional
		// type array: string
		if(a2.length==0) {
			String[][]ret=new String[1][a1.length];
			ret[0]=a1;
			return ret;
		}
		String[][]ret=new String[a2.length+1][a1.length];
		
		for(int i=0;i<a2.length;++i) {
			ret[i]=a2[i];
		}
		
		ret[ret.length-1]=a1;
		
		return ret;
	}
}
