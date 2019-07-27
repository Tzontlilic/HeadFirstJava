public class InterfaceTestDriver {

	// 这个测试的目的是学习接口
	// 接口就是一个包含了一些抽象方法的玩意
	// 这样就能有多种继承层次，不再是只继承一个父类
	// 同时，接口规定了“合约” 即规矩，让开发更有调理，能充分使用多态
	//
	// 如果以接口取代具体的子类或抽象的父类作为传递参数或返回类型
	// 则就可以传入任何有实现该接口的东西
	// 一个类可以实现多个接口，你想要什么功能，只需要implements 就行了！
	public static void main(String args[]) {
		
		Dog mDog = new Dog();
		Cat mCat = new Cat();

		mDog.bark();
		mCat.bark();

		mDog.play();
		mCat.play();

		mDog.beFrandly();
		mCat.beFrandly();
		
	}
}
