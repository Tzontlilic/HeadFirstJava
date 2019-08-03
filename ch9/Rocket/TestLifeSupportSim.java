import java.util.*;

public class TestLifeSupportSim {
	
	public static void main (String args[]) {
		
		ArrayList aList = new ArrayList();

		V2Radiator v2 = new V2Radiator(aList);
		V3Radiator v3 = new V3Radiator(aList);

		for (int z = 0; z < 20; z++) {
			
			RatentionBot ret = new RatentionBot(aList);
		}
		System.out.println(aList);
	}
} 
