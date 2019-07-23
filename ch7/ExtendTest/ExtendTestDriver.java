public class ExtendTestDriver {

	public static void main (String args[]) {

		ExtendTestDriver mTestDriver = new ExtendTestDriver();
//这一块是测试多态	
		Animal[] mAnimal = new Animal[2];

		mAnimal[0] = new Cat();
		mAnimal[1] = new Dog();
		

		for (int i = 0; i < mAnimal.length; i ++) { //多态测试，把Animal的子类放入Animal类型的数组里照样可以用。

//			
//			mAnimal[i].eat();
//			mAnimal[i].sleep();
//			mAnimal[i].bark();
			

			mTestDriver.EveryOneBark(mAnimal[i]); //多态测试，传入对象为形参的子类
		}

	}


	public void EveryOneBark(Animal a) { //此函数用来测试多态，传参多态
	
		a.bark();
	}
}
