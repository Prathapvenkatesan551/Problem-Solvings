package Dynamic_Programming;

public class Max_SubArraySum {

	public static void main(String[] args) {
		int arr[]= {-2,-5,6,3,-1,-2,-3};
		
		int max=arr[0];
		int curr=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			curr=Math.max(arr[i], arr[i]+curr);
			max=Math.max(curr, max);
		}
		System.out.println(max);
	}

}
