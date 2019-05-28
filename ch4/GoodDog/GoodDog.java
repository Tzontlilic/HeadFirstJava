class GoodDog {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int s) {
		size = s; 
	}

	public void bark() {
		if (size > 60 ) {
			System.out.println("Woof, woof!");
		}
		else if(size > 14){
			System.out.println("Yiip, yiip ");	
		}
		else{
			System.out.println("Ji, ji");
		}
	}
}
