public class ScaryException extends Exception {
	
	@Override // 这个玩意的作用是提示编译器这个方法是重写的
		  // 如果加上了这玩意，而重写的方法名字写错了，编译器会报错
		  // 如果没加上这玩意，重写的方法名字写错了，编译器不会报错，
		  // 并认为这是一个新的方法 	
	
	public void printStackTrace() {

		super.printStackTrace(); // 调用父类的此方法
		System.out.println("ScaryException");
	}
}
