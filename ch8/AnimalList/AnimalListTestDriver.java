public class AnimalListTestDriver {

	// 这个测试的目的是学习如何建立一个自己的类似于ArarryList的
	// 可以存储不同类型对象的数组，并含有add方法来添加元素
	// 也就是多态的使用方法之一：传入参数是父类，那么传入子类同样有效
	//
	public static void main(String args[]) {
	
		AnimalList mAnimalList = new AnimalList();	
		Dog mDog = new Dog();
		Cat mCat = new Cat();
		
		mAnimalList.add(mDog);
		mAnimalList.add(mCat);
	}
}
