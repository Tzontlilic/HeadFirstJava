public class AnimalList {

	private Animal [] mAnimalList = new Animal[5];
	private int nextIndex = 0;

	public void add(Animal a) {
		
		if (nextIndex < mAnimalList.length) {
		
			mAnimalList[nextIndex] = a;
			System.out.println("在第" + nextIndex + "位添加了一只动物");
			nextIndex++;
		}
	}

}
