public class PlayerTestDriver {
	
	// 这个测试的目的是弄清楚静态变量的初始化
	//
	// 测试结果为，静态变量会在对象被创建之前初始化
	// 在这个类被加载的时候就已经有初值了
	// 
	//
	//
	public static void main(String args[]) {
		
		System.out.println(Player.MY_PI);
		Player one = new Player("one");
		System.out.println(Player.MY_PI);
		Player two = new Player("two");
		System.out.println(Player.MY_PI);
		
		System.out.println(Player.getRandom());
	}
}
