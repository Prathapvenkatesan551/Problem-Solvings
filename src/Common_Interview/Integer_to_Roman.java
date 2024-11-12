package Common_Interview;

import java.util.HashMap;

public class Integer_to_Roman {
	
	public static String find(int inp,HashMap<Integer,String>map) 
	{
		int arr[]= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String ans="";
		while(inp>0) {
			for(int i=arr.length-1;i>=0;i--)
			{
				if(inp>=arr[i])
				{
					ans+=map.get(arr[i]);
					inp-=arr[i];
					break;
				}
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1,"I");
		map.put( 4,"IV");
		map.put(5,"IV");
		map.put(9,"IX");
		map.put(10,"X");
		map.put(40,"XL");
		map.put(50,"L");
		map.put(90,"XC");
		map.put(100,"C");
		map.put(400,"CD");
		map.put(500,"D");
		map.put(900,"CM");
		map.put(1000,"M");
		
		int inp=1994;
		System.out.println(find(inp,map));

	}

}
