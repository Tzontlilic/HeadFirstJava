import java.util.ArrayList;
import java.io.*;
class GameHelper {
	
	public String getUserInput() {
		String inputLine = null;
		System.out.println("please enter number:  ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();

			if (inputLine.length() == 0)
				return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);	
		}
		return inputLine;
	}			

	public  ArrayList getRandomNumArray(int num) {
		ArrayList<Integer> localArray = new ArrayList<Integer>() ;
		int start = (int)((10 - num) * Math.random());
		localArray.add(start);
		localArray.add(start + 1);
		localArray.add(start + 2);
		return localArray;
	}
}
