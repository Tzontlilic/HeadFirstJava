class GameHelperTestDrive {
	
	public static void main(String[] args) {
		GameHelper mHelper = new GameHelper();
		System.out.println(mHelper.getUserInput());
		int[] mArray = mHelper.getRandomNumArray(3);
		for(int i : mArray) {
			System.out.println(i);	
		}	
		
	}
}
