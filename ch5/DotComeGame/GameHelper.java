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

	public int[] getRandomNumArray(int num) {
		int[] localArray = new int[num];	
		int start = (int)((10 - num) * Math.random());

		for (int i = 0; i < localArray.length; i++) {
			localArray[i] = start + i;	
		}
		return localArray;
	}
}
