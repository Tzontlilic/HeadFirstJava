class DotComTestDrive {

	public static void main(String[] args) {
		DotCom one = new DotCom();
		one.setPosition();
		
		while(true) {
			one.getBlood();
			int shotNum = (int)(9 * Math.random());
			if(one.Shot(shotNum)) {
				System.out.println("hit");	
			}
			else {
				System.out.println("miss");	
			}
			if(one.isDead()){
				System.out.println("kill");	
				break;
			}	
		}
	}
}
