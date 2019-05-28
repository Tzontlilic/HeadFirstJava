class Puzzle4b {
	int var;

	public int doStuff(int factor) {
		if(var > 100) {
			return	var * factor;
		}
		else {
			return	var * ( 5 - factor) ;
		}
	}
}
