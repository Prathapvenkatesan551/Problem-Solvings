package Optimized_Approach;

public class longestPalindrome_Substring 
{
	public static void main(String[] args) 
	{
		String s="AC-MalayalamC-B".toLowerCase();
		String res="";
		for(int i=1;i<s.length();i++) 
		{
			//Odd leangth
			int l=i-1;
			int r=i+1;
			while(l>=0 && r<s.length()) 
			{
				if(s.charAt(l)!=s.charAt(r)) break;
				else {
					l--;
					r++;
				}
			}
			if(res.length()<s.substring(l+1,r).length()) {
				res=s.substring(l+1,r);
			}
			
			
			//Even length
			int l2=i-1;
			int r2=i;
			while(l2>=0 && r2<s.length()) 
			{
				if(s.charAt(l2)!=s.charAt(r2)) break;
				else {
					l2--;
					r2++;
				}
			}
			if(res.length()<s.substring(l2+1,r2).length()) {
				res=s.substring(l2+1,r2);
			}
		}
		System.out.println(res);
	}

}
