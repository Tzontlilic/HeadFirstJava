class ElectricGuitarTestDrive {

	public static void main(String[] args) {
		String output1;
		boolean output2;
		ElectricGuitar mGuitar1 = new ElectricGuitar();
		mGuitar1.setBrand("my first guitar");
		mGuitar1.setRockStarUsesIt(true);
		mGuitar1.numOfPickups = 5;

		System.out.println(mGuitar1.getBrand());
		System.out.println(mGuitar1.getRockStarUsesIt());
		System.out.println(mGuitar1.numOfPickups);

		
	}
}
