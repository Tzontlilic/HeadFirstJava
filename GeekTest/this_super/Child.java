public class Child extends Parent {
	
	public String str;

	Child() {
	
	}

	Child(int a) {
		
		str = "Child";
	}

	public void show() {
		
		System.out.println(str);
		super.show();
	}
}
