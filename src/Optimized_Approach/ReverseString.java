package Optimized_Approach;
// Time complexity =  O(N/2) for while loop only
public class ReverseString {

	public static void main(String[] args) {
		String s="hello world";
		char c[]=s.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<=j) {
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		System.out.println(new String(c));
				
	}

}
