import java.util.*;
public class DotComBust {
	
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame() {
	
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
		Systm.out.println("Try to sink them all in the fewest number of guesses");

		for (DotCom dotComToSet : dotComsList) {

			ArrayList<String> newLocation = helper.placeDotCom();	
			dotComToSet.setLocation(newLocation);
		}
	}

	private void startPlaying() {
		
		while(!dotComeList.isEmpty()) {
			
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) {
		
		numOfGuess ++;
		String result = "miss";
		for (DotCom dotComToSet : dotComsList) {
			
			result = dotComToTest.checkYouserlf(userGuess);
			if (result.equals("hit")) {
				break;	
			}
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}

		System.out.println(result);
	}

	private void finishGame() {
		
		System.out.println("All dotcoms are dead! Your stock is now worthless");

		if (numOfGuess <= 18) {
			System.out.println("It only took you" + numOfGuess + "guesses.");
			System.out.println("You got out before you options sank.");
		}
		else {
			System.out.println("Took you long enouth." + numOfGuess + "guesses.");	
			System.out.println("fish are dancing with your option");
		}
	}

	public static void main(String[] args) {
		
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
