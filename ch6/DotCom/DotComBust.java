import java.util.*;
public class DotComBust {
	
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame() { //初始化游戏

		//创建DotCom对象	
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");

		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);

		System.out.println("Your goal is to sink three dot coms");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");

		//依次将DotComList中的对象部署到地图上
		for (DotCom dotComToSet : dotComsList) {

			ArrayList<String> newLocation = helper.placeDotCom(3);	
			dotComToSet.setLocation(newLocation);
		}
		System.out.println("游戏初始化完毕");
	}

	private void startPlaying() { //开始游戏
		
		while(!dotComsList.isEmpty()) {
			
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) {
		
		numOfGuesses ++;
		String result = "miss";
		for (DotCom dotComToSet : dotComsList) {
			
			result = dotComToSet.checkYourself(userGuess);
			if (result.equals("击中")) {
				break;	
			}
			if (result.equals("击杀")) {
				dotComsList.remove(dotComToSet);
				System.out.print( "你击沉了" );
				dotComToSet.getName();
				break;
			}
		}

		System.out.println(result);
	}

	private void finishGame() {
		
		System.out.println("所有的战舰都被击沉。");
		System.out.println("你用了 " + numOfGuesses + " 次机会");
	}
	public static void main(String[] args) {
		
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
