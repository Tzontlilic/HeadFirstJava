// 这个例子是用来判断对象们是不是同一个堆里的东西
class FooTestDrive {
	
	public static void main(String[] args){
		Foo a = new Foo();
		Foo b = new Foo();
		Foo c = a;
		int x = 3;
		byte y = 3;
		
		if (a == b){
			System.out.println("a = b");
		}
		if (c == a){
			System.out.println("c = a");	
		}
		if (c == b){
			System.out.println("c = b");
		}
		if (x == y){
			System.out.println("x = y");
		}
		
	}
}

