import java.util.ArrayList;
public class SimpleDotCom {
	
	//private int numOfHits = 0;
	private ArrayList<Integer> locationCells = new ArrayList<Integer>() ;

	public void setLocationCells(ArrayList<Integer> locs) {
		locationCells = locs;	
	}


	public String checkYourself(String stringGuess) { //通过传入猜数来自检，如果能在战舰数组中找到猜数，那么就计作击中一次，并且将战舰数组被击中部分去除
		int guess = Integer.parseInt(stringGuess);	
		String result = "miss";
		
		int index = locationCells.indexOf(guess);
		if (index >= 0) {
			locationCells.remove(index);	// ArrayList中包含remove方法，能够动态处理数组
		
		
			if (locationCells.isEmpty()) {   //检查如果战舰数组为空则判为死亡
				result = "kill";	
			}
			else {
				result = "hit";	
			}
		}
		System.out.println(result);
		return result;
	}
}
