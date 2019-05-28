class DotCom {
	private int mBlood = 3;
	private int[] mPosition = new int[3];
	private int mStart; // 设定舰头
	
	public void setPosition() {
		mStart = (int) (7 * Math.random());// 最后就是 789
		int i = 0;
		while(i < 3){
			mPosition[i] = mStart + i; 
			i += 1;
		}
	}
	public boolean Shot(int shotNum){
		for(int i = 0; i < 3; i ++){
			if(mPosition[i] == shotNum){
				mBlood -= 1;	
				mPosition[i] = -1;
				return true;
			}
		}
		return false;
	}
	public void getBlood() {
		System.out.print("boold: ");
		System.out.println(mBlood);
	}
	public boolean isDead() {
		if (mBlood <= 0){
			return true;	
		}	
		else{
			return false;	
		}
	}
}

