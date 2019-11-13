package homework_190827_2;

interface Movable {
	// 절대 위치로 이동한다 
	public abstract void moveTo(int x, int y);  
	    
	// 상대 위치만큼 이동한다.
	public abstract void moveBy(int xOffset, int yOffset);
}
