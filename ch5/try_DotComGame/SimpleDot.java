class SimpleDot {
	
	private String result = "miss";
	private int mBlood ;
	private int[] mLocationArray;

	public void setLocationCells(int[] location) {
		// 输入：用户设定的战舰所在位置部署			
		// 输出：空
		mLocationArray = location;
		mBlood = location.length;
		
	}

	public String checkYourSelf(int num) {
		// 输入：用户的射击值
		// 输出：一个表示射击结果的字符
		
		for(int i = 0; i <= mBlood; i++) {
			if(mLocationArray[i] == num) {
				result = "hit";	
				mLocationArray[i] = -1;
				mBlood -= 1;
				break;
			}	
		}
	
		if(mBlood < 1) {
			result = "kill";	
		}
			
		return result;

	}
}
