public class ObjectTestDriver {
			
	public static void  main(String args[]) {

		// 这个测试的目的是，了解万类之源Object
		// Object是所有类的父类，它有一些方法
		// 能够被所有类使用
		//
		// equals() 方法，这里注意有个面试经常问的问题需要注意就是equals() 和 == 的区别,之后留意一下
		// hashCode() 方法，列出这个对象的哈希代码，是一个唯一的ID
		// getClass() 方法，用来告诉你这个对象是从哪里初始化的
		// toString() 方法，列出类的名称和一个神他妈数字
	
		Son mSon = new Son();
		Son mSecondSon = new Son();
		Daughter mDaughter = new Daughter();
		
		// ********** equals() 方法试水*****//
		if (mSon.equals(mDaughter)) {
			
			System.out.println("Son = Daughtert");
		}
		else {
			
			System.out.println("Son != Daughtert");
		}

		if (mSecondSon.equals(mSon)) {
			
			System.out.println("Son = son2");
		}
		else {
		
			System.out.println("Son != son2");
		}
		// ********** END **********************//

		// ********* hashCode() 方法试水 *******//

		System.out.println("mSon 的hashcode是：" + mSon.hashCode());
		
		System.out.println("mSecondSon 的hashcode是：" + mSecondSon.hashCode());
		
		System.out.println("mDaughter 的hashcode是：" + mDaughter.hashCode());

		// ********** END ********************//
	
		
		// ************* getClass() 方法试水 ****//
		System.out.println("初始化 mSon的类是：" + mSon.getClass());
		System.out.println("初始化 mSecondSon的类是：" + mSecondSon.getClass());
		System.out.println("初始化 mDaughter的类是：" + mDaughter.getClass());
		// ************ END *******************//

		// ********* toString() 方法试水 ******//
		System.out.println("mSon 的类的名称和一个奇怪的代码：" + mSon.toString());
		System.out.println("mSecondSon 的类的名称和一个奇怪的代码：" + mSecondSon.toString());
		System.out.println("mDaughter 的类的名称和一个奇怪的代码：" + mDaughter.toString());
		// ******** END ***********//


	}
}
