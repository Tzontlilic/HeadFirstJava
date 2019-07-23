public class TestDriver {

	// 写这个测试的目的是弄清楚继承关系中
	// 子类中继承的属性是否会随着父类属性 
	// 的变化而改变
	// 
	// 事实证明，b在继承了a时，是继承了当时
	// a的属性，在a的属性后续被改变时，不能
	// 影响子类的属性
	public static void main(String args[]) {
		A mA = new A();	
		B mB = new B();	
		
		System.out.print("A的ID是：");
		mA.getmID();
		
		System.out.print("B的ID是：" );
		mB.getmID();	

		mA.setmID("NEW_A");

		
		System.out.println("A换了新id");

		System.out.print("A的ID是：");
		mA.getmID();

		System.out.print("B的新ID是：" );
		mB.getmID();	


	}

}
