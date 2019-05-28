class SimpleDotComGame {
	
	public static void main(String[] args) {
		SimpleDotCom mSimpleDotCom = new SimpleDotCom();
		GameHelper mHelper = new GameHelper();
		int numOfGuess = 0;
		int[] mLocation = mHelper.getRandomNumArray(3);	
		String mResult = "";
		mSimpleDotCom.setLocationCells(mLocation);


		while(true) {

			String guess = mHelper.getUserInput();
			numOfGuess += 1;
			System.out.print("num of guess: ");
			System.out.println(numOfGuess);
			mResult = mSimpleDotCom.checkYourself(guess);
			
			if(mResult == "kill") {
				break;
			}
		}
		System.out.print("You use ");
		System.out.print(numOfGuess);
		System.out.println(" time(s)");
	}
}
