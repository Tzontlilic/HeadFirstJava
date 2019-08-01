public class MakeHippo {
	
	public static void main(String args[]) {
		
		// 每个对象都要执行构造函数
		// 生成一个对象时，会回溯到所有父类
		// 在执行完所有父类的构造函数之后 
		// 才会执行到这个对象的构造函数
		//
		Hippo mHippo = new Hippo("aa");	
		Animal mAnimal = new Animal();
		mHippo.getName();
		mAnimal.getName();
	}
}
