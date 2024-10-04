package Leetcode_problems;

public class CountandSay {

	public static void main(String[] args) 
	{
		String s="1";
		int n=5;
		System.out.println(s);
		for(int i=0;i<n;i++)
		{
			String res="";
			int count=0;
			char c=s.charAt(0);
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==c) {
					count++;
				}
				else
				{
					res+=(String.valueOf(count)+c);
					c=s.charAt(j);
					count=0;
					j--;
					
				}
			}
			res+=(String.valueOf(count)+c);
			
			count=0;
			s=res;
			System.out.println(res);
		}
	}

}
