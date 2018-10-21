/**
 * Socks class creates each individual sock
 * with its individual colour and side of pair(left or right)
 * @author Mayank
 *
 */
public class Socks {
	
	private int socksNumber;
	private String socksColour;
	private String sideOfPair;
	private boolean matched = false;	//To identify whether sock is matched with its pair

	public Socks() {
		
		
		
	}

	public int getSocksNumber() {
		return socksNumber;
	}

	public void setSocksNumber(int socksNumber) {
		this.socksNumber = socksNumber;
	}

	public String getSocksColour() {
		return socksColour;
	}

	public void setSocksColour(String socksColour) {
		this.socksColour = socksColour;
	}

	public String getSideOfPair() {
		return sideOfPair;
	}

	public void setSideOfPair(String sideOfPair) {
		this.sideOfPair = sideOfPair;
	}
	
	public boolean isMatched() {
		return matched;
	}

	public void setMatched(boolean matched) {
		this.matched = matched;
	}

}
