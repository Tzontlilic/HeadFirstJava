class ElectricGuitar {
	private String brand;
	int numOfPickups;//没有设置为private则可以通过外部直接访
	private boolean rockStarUsesIt;

	String getBrand() { // 封装
		return brand;
	}

	void setBrand(String aBrand) {
		brand = aBrand;
	}

	int getNumOfPickups() {
		return numOfPickups;
	}

	void setNumOfPickups(int Num) {
		numOfPickups = Num; 
	} 

	boolean getRockStarUsesIt() {
		return rockStarUsesIt;
	}
	
	void setRockStarUsesIt(boolean yesOrNo) {
		rockStarUsesIt = yesOrNo;
	}

}
