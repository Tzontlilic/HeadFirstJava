import java.util.ArrayList;
class SimpleDotComGame {
	
	public static void main(String[] args) {
		SimpleDotCom mSimpleDotCom = new SimpleDotCom(); //创建一张战舰地图
		GameHelper mHelper = new GameHelper(); 		//创建一个游戏帮助者，里面包含了输入检测和随机数组生成器
		int numOfGuess = 0;
		ArrayList<Integer> mLocation = new ArrayList<Integer>() ; //准备随机生成一个战舰
		mLocation = mHelper.getRandomNumArray(3);
		String mResult = "";
		mSimpleDotCom.setLocationCells(mLocation); 		//将生成的战舰部署到战舰地图当中


		while(true) { 				//开始游戏

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
