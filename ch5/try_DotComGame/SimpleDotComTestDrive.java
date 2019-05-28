class SimpleDotComTestDrive {

	public static void main(String[] args) {
		SimpleDot dot = new SimpleDot();
		String testResult = "false";
		
		int[] location = {2, 3, 4}; 
		int userGuess ;
		String result;
		dot.setLocationCells(location);

		userGuess = 5;
		result = dot.checkYourSelf(userGuess);
		if(result.equals("hit")){
			testResult = "passed";
		}
		System.out.println(testResult);
		
	}
}
