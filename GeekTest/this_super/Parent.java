public class Parent {
	
	public String str;

	Parent() {
		
		this(1);
	}

	Parent(int a) {
		
		this.str = "Patent";
		this.show();
	}

	public void show() {
		System.out.println(this.str);	
	}
}
