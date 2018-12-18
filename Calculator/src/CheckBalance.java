/**
 * @author Emmanuel Sedicol
 * 
 * This class is for checking wether we a balance open and close (parenthesis and brackets).
*/

import java.util.Stack;


public class CheckBalance {
	
	Stack<String> stack  = new Stack<>();
	String nextChar;
	
	public static void main(String args[])
	{
		CheckBalance cb = new CheckBalance();
		

	}
	
	public String[] splitToTokens(String string)
	{
		string.trim();
		return string.split("\\s"); 
	}
	

	
	
	//Check if parenthesis opening and closing match
	public boolean checkPairs(String openDelim, String nextChar)
	{
		if ( (openDelim.equals("(")) && (nextChar.equals(")")) )
		{
			return true;
		}
		return false;

	}

}
