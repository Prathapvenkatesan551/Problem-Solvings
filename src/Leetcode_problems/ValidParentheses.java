package Leetcode_problems;
import java.util.*;
public class ValidParentheses {

	public static boolean isValid(String s) 
    {
    Stack<Character>stk=new Stack<>();
			char c[]=s.toCharArray();
			int k=0;
			for(int i=0;i<c.length;i++)
			{
				if(c[i]=='{'|| c[i]=='('||c[i]=='[')
				{
					stk.push(c[i]);
				}
				else
				{
                    try{
					if(stk.peek()=='{' && c[i]=='}')
					{
						stk.pop();
					}
					else if(stk.peek()=='(' && c[i]==')')
					{
						stk.pop();
					}
					else if(stk.peek()=='[' && c[i]==']')
					{
						stk.pop();
					}
					else
					{
						return false;
					}
                    }
                    catch(Exception e){
                        return false;
                    }
				}
			}
			if(k==0 && stk.empty())
			{
				return true;
			}
    return false;
   }
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		isValid(s);
	}

}
