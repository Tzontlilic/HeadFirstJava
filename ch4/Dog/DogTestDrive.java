class DogTestDrive {
	
	public static void main(String[] args) {
		Dog dogOne = new Dog();
		dogOne.size = 70;
		Dog dogTwo = new Dog();
		dogTwo.size = 8;
		Dog dogThree = new Dog();
		dogThree.size = 35;

		dogOne.bark();
		dogTwo.bark();
		dogThree.bark();
	}
}
