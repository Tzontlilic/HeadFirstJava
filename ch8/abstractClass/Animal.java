abstract class Animal {
	
	// 这是一个抽象类，
	// 抽象类的概念大概是：
	// 这个类不能被初始化为实例
	// 在被继承之前，这个类没有意义
	
	public void success() {
		
		System.out.println("初始化成功！");
	}
	


	// 注意，抽象的方法只能在抽象类中定义
	// 抽象的方法表明，子类在调用这个方法
	// 前必须覆盖此方法。
	// 子类必须实现所有定义过的抽象方法，
	// 可以选择在所有子类中实现所有的抽象方法
	// 也可以在一个抽象的子类中实现所有或几个父类的抽象方法
	// 总之抽象方法必须全部有实现

	public abstract void eat() ; //抽象的方法!

				

	
	
}
