package Leetcode_problems;
import java.util.*;
// Time Complexity = O(N)
public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		int arr[]= {0,1,9,6,5,-1,11,13,12,14,15,19,18,17,16};
		HashMap<Integer,Boolean>map=new HashMap<>();
		for(int i=0;i<arr.length;i++)	map.put(arr[i], false);
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(map.get(arr[i])==false && map.containsKey(arr[i]-1)==false)
			{
				map.put(arr[i], true);
				int val=arr[i]+1;
				while(true)
				{
					if(map.containsKey(val))
					{
						count++;
						val++;
					}
					else
					{
						break;
					}
				}
				
			}
			
			if(count>max) max=count;
		}
		
		System.out.println(max);
		
	}

}
