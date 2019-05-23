public class GuessGame {
	Player p1; //创建Player对象
	Player p2;
	Player p3;

	public void startGame() {
		
		p1 = new Player(); //创建玩家对象
		p2 = new Player();
		p3 = new Player();

		boolean p1isRight = false; // 创建判断结果变量
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int p1GuessNumber = 0; //创建玩家们所猜的数字
	        int p2GuessNumber = 0;
		int p3GuessNumber = 0;
        	
	        int targetNumber = (int) (Math.random() * 10); //生成目标数字
		System.out.println("Let's begain to guess a number between 0 to 10");
        	System.out.println("The target number is " + targetNumber);	

		while (! (p1isRight || p2isRight || p3isRight)) {

			p1.guess();
			p1GuessNumber = p1.guessNumber;
			System.out.println("Player 1 guess the number is " + p1GuessNumber);

			p2.guess();
			p2GuessNumber = p2.guessNumber;
			System.out.println("Player 2 guess the number is " + p2GuessNumber);

			p3.guess();
			p3GuessNumber = p3.guessNumber;
			System.out.println("Player3 guess the number is " + p3GuessNumber);
			
			if (p1GuessNumber == targetNumber) {
				p1isRight = true;
			}
			if (p2GuessNumber == targetNumber) {
				p2isRight = true;
			}
			if (p3GuessNumber == targetNumber) {
				p3isRight = true;
			}

			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("OH It seems like we have a winner");
				if (p1isRight) {
					System.out.println("The winner is player 1 !");
				}

				if (p2isRight) {
					System.out.println("The winner is player 2 !");
				}

				if (p3isRight) {
					System.out.println("The winner is Player 3 !");
				}

				break;
			}
			else {
				System.out.println("Nobody have curect answer, Let's try again");
			}
		}
	}
}
