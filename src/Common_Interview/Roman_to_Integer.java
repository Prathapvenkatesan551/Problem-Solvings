package Common_Interview;
import java.util.*;

public class Roman_to_Integer {
	public static int find(String s ,HashMap<Character,Integer>map) {
		int roman=0;
		char c[]=s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			if(map.get(c[i])>=map.get(c[i+1])) {
				roman+=map.get(c[i]);
			}
			else
			{
				roman+=(map.get(c[i+1]) - map.get(c[i]));
			}
		}
		roman+=map.get(c[c.length-1]);
		return roman;
	}

	public static void main(String[] args) {
		HashMap<Character,Integer>map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		String inp="IXIII";
		System.out.println(find(inp,map));
	}
}
