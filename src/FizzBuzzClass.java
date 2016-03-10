
public class FizzBuzzClass {
	
	static String FizzBuzz(int input){
		
		/* Kamel's Way
		String output="";
		if (input%3==0)
			output+= "Fizz";
		if (input%5==0)
			output+= "Buzz";
		if (output.equals(""))
			output = Integer.toString(input);
			return output;
		*/
		//Simplest Way
		
		if (input%3==0 && input%5==0)
			return "FizzBuzz";
		if (input%3==0)
			return "Fizz";
		if (input%5==0)
			return "Buzz";
		else 
			return Integer.toString(input);
		
		
		//Refactored way a la James
	/*
	 * 	String response = "";
	 * 
		if (isDivisibleBy(n,3))
			response += "Fizz";
		if (isDivisibleBy(n,5))
			return response += "Buzz";
		else 
			return response (return) n;
			
		boolean isDivisibleBy (n, divisor){
			if(n % divisor == 0){
			return true;
			else {
			return false; 
			}
	 */
	}
}

