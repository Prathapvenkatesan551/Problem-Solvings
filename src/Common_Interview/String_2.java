package Common_Interview;
//worst-case time complexity is O(n^2)
public class String_2 {

	public static void main(String[] args) {
		String s="233445667798";
		
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length()-1;i++)
		{
			int a=Character.getNumericValue(sb.charAt(i));
			int b=Character.getNumericValue(sb.charAt(i+1));
			if(a%2==0 && b%2==0 && a==b)
			{
				sb.insert(i+1, "*");
			}
			else if(a%2!=0 && b%2!=0 && a==b)
			{
				sb.insert(i+1, "-");
			}
			
		}
		System.out.println(sb);
	}

}
