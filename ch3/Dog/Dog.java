class Dog {
	String name;
	public static void main(String[] args) {
		Dog myDog1 = new Dog();
		myDog1.name = "Dog1";
		myDog1.bark();

		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = myDog1;
		
		myDogs[0].name = "Dog2";
		myDogs[1].name = "Dog3";

		System.out.print("The last dog's name is:");
		System.out.println(myDogs[2].name);

		for (int i = 0; i < 3; i ++) {
			myDogs[i].bark();
		}

	}

	public void bark() {
		System.out.println(name + " : woff, woff !");
	}

	public void eat() {
		System.out.println(name + " : eat, eat !");
	}

	public void chaseCat() {
		System.out.println(name + " : wow, wow !");
	}
}
