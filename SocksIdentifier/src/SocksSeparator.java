import java.util.ArrayList;
/**
 * Class separates and matches the sock with its matched pair
 * @author Mayank
 *
 */
public class SocksSeparator {
	
	public SocksSeparator() {
		
		
		
	}
	
	
	
	/**
	 * This method separates and returns ArrayList of socks from the given string
	 * 
	 * @param socksString
	 * @return
	 */
	public void separateAndMatchFrom(String socksString) {
		
		ArrayList<String> separatedSocksStrings = new ArrayList<>();
		ArrayList<Socks> socks = new ArrayList<>();
		int socksPointer = 0;
				
		//Starting point for for extracting socks from main string
		int startingPoint = 0;
		
		//Loop through main string to extract out each socks after ","
		for(int i = 0; i < socksString.length(); i++) {
			
			
			if(String.valueOf(socksString.charAt(i)).equals(",")) {
				
				
				separatedSocksStrings.add(socksString.substring(startingPoint, i));
				
				startingPoint = i+1;
				
			}
			
		}
		
		//Adding last sock which will not be extracted from the loop
		separatedSocksStrings.add(socksString.substring(socksString.lastIndexOf(",")+1));
		
		

//	   Go to each separated string and separate out the colour and side or pair
//	   and assign it to the Socks attributes
		 
		for(String separatedSocksString : separatedSocksStrings) {
		
			socks.add(new Socks());
			socks.get(socksPointer).setSocksNumber(socksPointer+1);
			socks.get(socksPointer).setSideOfPair(separatedSocksString.substring(separatedSocksString.lastIndexOf("/")+1));
			socks.get(socksPointer).setSocksColour(separatedSocksString.substring(2, separatedSocksString.lastIndexOf("/")));
			socksPointer++;
			
		}
		
		
		/**
		 * Checking each sock with its subsequent sock
		 * to find out its pair
		 */
		for(int i = 0; i < socks.size(); i++) {
			
			for(int j = 1; j < socks.size(); j++) {
				
				if(!socks.get(i).isMatched()) {
					
					if(!socks.get(j).isMatched()) {
						
						if(socks.get(i).getSocksColour().equals(socks.get(j).getSocksColour())) {
							
							if(!socks.get(i).getSideOfPair().equals(socks.get(j).getSideOfPair())) {
								
								//Pair is matched
								socks.get(i).setMatched(true);
								socks.get(j).setMatched(true);
								System.out.println(socks.get(i).getSocksNumber() + " " + socks.get(j).getSocksNumber());
								
							}
							
						}
						
					}
					
				}
				
			}
			
		}

	}

}
