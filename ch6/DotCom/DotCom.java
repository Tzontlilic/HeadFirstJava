import java.util.*;
public class DotCom {

	private  String mName;
	private  ArrayList<String> mLocation = new ArrayList<String>();
	
	public void getName() {
	
		System.out.println(mName);	
	}

	public void setName(String localName) {
		
		mName = localName; 
	}

	public void setLocation(ArrayList<String> newLocation) {

		mLocation = newLocation;
	}

	public String checkYourself(String userGuess) {
		
		int index ;
		index = mLocation.indexOf(userGuess);
		String result;	
		result = "miss";

		if (index >= 0) { //如果数组中包含猜数，则认为击中，再判断是否击杀
			
			mLocation.remove(index);
			
			if (mLocation.isEmpty()) {
				
				result = "击杀";
			}
			else {

				result = "击中";
			}
		}
		return result;
	}
}
