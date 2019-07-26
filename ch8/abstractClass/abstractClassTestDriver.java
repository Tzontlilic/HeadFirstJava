public class abstractClassTestDriver {
	
	public static void main(String args[]) {
	
		dog mdog = new dog();
		cat mcat = new cat();
		//Animal mAnimal = new Animal();
		//Animal无法被实例化！

		mdog.success();
		mdog.eat();
		mcat.success();
		mcat.eat();
		//mAnimal.success();
	}
		

}
