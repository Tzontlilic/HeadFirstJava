public class Player {
	int guessNumber = 0;
	public void guess() {
		guessNumber = (int) (Math.random() * 10);
		System.out.println("I guess the number is " + guessNumber);
	}
}
