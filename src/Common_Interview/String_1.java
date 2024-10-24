package Common_Interview;
//Time Complexity = O(N)
public class String_1 {

	public static void main(String[] args) {
		String s="coderbyte";
		String ct="cmhqe5b97";
		 StringBuilder sb = new StringBuilder(s);
	     String reversed = sb.reverse().toString();
	     reversed+=ct;
	     for(int i=0;i<reversed.length();i++)
	     {
	    	 if((i+1)%4==0)
	    	 {
	    		 System.out.print("_");
	    	 }
	    	 else
	    	 {
	    		 System.out.print(reversed.charAt(i));
	    	 }
	     }
		
	}

}
