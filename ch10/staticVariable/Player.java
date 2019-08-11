class Player {

	public static final double MY_PI;
	static int playerCount = 1;
	private String name;
	
	static { //静态 final 变量初始化， 一个类只初始化一次
		
		MY_PI = Math.random();
	}

	public Player(String n) {
	
		name = n;
		playerCount ++;
	}

	public static double getRandom() {
		
		return Math.random(); //静态方法，只能通过类名进行调用
					// 静态方法不能调用非静态的变量
					//
		
	} 



}
