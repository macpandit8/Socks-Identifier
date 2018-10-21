/**
 * Main class which is entry point to the application
 * @author Mayank
 *
 */
public class SocksIdentifier {

	public static void main(String[] args) {
		
		//Given socks string (Basket of socks)
		
		String socksString = "1/blue/right,2/blue/right,3/red/right,4/blue/left,5/purple/left,6/red/left,7/green/left,8/red/left,9/blue/left";

//		Method-1

		SocksSeparator socksSeparator = new SocksSeparator();
		
		System.out.println();
		
		System.out.println("Output for finding Matched Pair in order by unique identifier");
		
		socksSeparator.separateAndMatchFrom(socksString);
		
//		System.out.println();
//		
//		System.out.println("Output for Bonus Task - Unmatched Pair in order by colour");
		
		
		
//		Method-2		
//		
//		int indexOfComma = socksString.lastIndexOf(",");
//		String socks = socksString.substring(indexOfComma+1); 
//		socksString = socksString.substring(0, indexOfComma);
//		
//		int indexOfSymbol = socks.lastIndexOf("/");
//		String side = socks.substring(indexOfSymbol+1);
//		socks = socks.substring(0, indexOfSymbol);
//		
//		System.out.println(socks);
//		System.out.println(socksString);
//		
//		System.out.println(side);
		
//		int socksPointer = 1;
//		
//		String test = "1/blue/right";
//		
//		System.out.println(test.substring(test.lastIndexOf("/")+1));
//		System.out.println(test.substring(2, test.lastIndexOf("/")));

	}
	
}