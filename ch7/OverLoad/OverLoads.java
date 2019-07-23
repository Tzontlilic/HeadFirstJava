public class OverLoads {

	String uniqueID;
	// 重载，重载的定义是 使用相同的方法名称，但可以有不同的返回类型，或者不同类型的形参

	// 不同的返回类型	
	// 
	// 重载的合法规范
	// 1 返回类型可以不同
	// 2 不能只改变返回类型
	// 3 可以更改存取权限
	public int addNums(int a ,int b) {
		
		return a + b;
	}

	public float addNums(float a, float b) {

		return a + b;
	}

	public double addNums(double a, double b) {

		return a + b;
	}
	//**********end***********//
	



	// 不同的形参
	
	public void setUniqueID(String theID) {
	
		uniqueID = theID;
	}

	public void setUniqueID(int theIDNums) {

		String theIDString = "" + theIDNums;	
		setUniqueID(theIDString);

	}
	//***********end************//
}
