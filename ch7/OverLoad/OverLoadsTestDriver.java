public class OverLoadsTestDriver {
	
	public static void main (String args[]) {

		OverLoads mOverLoadsTest = new OverLoads();

		System.out.println(mOverLoadsTest.addNums(1, 2));

		System.out.println(mOverLoadsTest.addNums(1.0, 2.0));
				
		mOverLoadsTest.setUniqueID("Tzontlilic");	
		System.out.println(mOverLoadsTest.uniqueID);
		mOverLoadsTest.setUniqueID(123);

		System.out.println(mOverLoadsTest.uniqueID);
	}
}
