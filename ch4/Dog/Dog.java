class Dog {
	int size;
	String name;

	void bark() {
		if(size > 60) {
			System.out.println("Woof, woff !!");
		}
		else if (size > 14) {
			System.out.println("Yip, yip !!");
		}
		else {
			System.out.println("Ji, ji");
		}
	}
}
