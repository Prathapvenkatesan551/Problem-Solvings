package Optimized_Approach;

import java.util.Arrays;

// Time Complexity = O(N log N)

public class TwoSum {

	public static void main(String[] args) {
		int arr[]= {5,2,17,9,3,12,13,4,1};
		int target=5;
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			if(arr[i]+arr[j]>target) j--;
			else if(arr[i]+arr[j]<target) i++;
			else {
				System.out.println(arr[i]+" "+arr[j]);
				break;
			}
		}
	}

}
