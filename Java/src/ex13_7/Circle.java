package ex13_7;
class Circle {
	int radius;			//반지름
	Circle(int radius){
		this.radius = radius;
	}
	
	public String toString() {
		return "radius=" + radius;
	}
	
	public boolean equals(Object arg0) {
		/*obj가 null이 아니고 obj를 Circle로 형변환 가능한지 체크합니다.
		 조건을 만족하면 arg0를 Circle로 형변환하고
		 형변환한 obj의 radius값과 현재 객체의 radius값을 비교해서 같으면
		 true 아니면 false를 리턴합니다.		 
		 */
		
		if(arg0 != null && arg0 instanceof Circle) {
			return this.radius == ((Circle) arg0).radius;
		}else {
			return false;
		}
		
	   	}
}
