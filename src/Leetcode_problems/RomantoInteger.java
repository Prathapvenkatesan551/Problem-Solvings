package Leetcode_problems;
import java.util.*;

public class RomantoInteger {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		 HashMap<Character,Integer> map=new HashMap<>();
			map.put('I', 1);
			map.put('V', 5);
			map.put('X', 10);
			map.put('L', 50);
			map.put('C', 100);
			map.put('D', 500);
			map.put('M', 1000);
			char c[]=s.toCharArray();
			int sum=0;
			
			for(int i=0;i<s.length();i++)
			{
	            if(i==s.length()-1)
	            {
	            char cr=c[s.length()-1];
				sum=sum+map.get(cr);
	            System.out.println(sum);
	            break;
	            }
				if(map.get(c[i])>=map.get(c[i+1]))
				{
					sum=sum+map.get(c[i]);
				}
				else if(map.get(c[i])<map.get(c[i+1]))
				{
					int set=map.get(c[i+1])-map.get(c[i]);
					sum=sum+(map.get(c[i+1])-map.get(c[i]));
					i++;	
				}
			}
		
	}
}
