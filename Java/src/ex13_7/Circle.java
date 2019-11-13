package ex13_7;
class Circle {
	int radius;			//������
	Circle(int radius){
		this.radius = radius;
	}
	
	public String toString() {
		return "radius=" + radius;
	}
	
	public boolean equals(Object arg0) {
		/*obj�� null�� �ƴϰ� obj�� Circle�� ����ȯ �������� üũ�մϴ�.
		 ������ �����ϸ� arg0�� Circle�� ����ȯ�ϰ�
		 ����ȯ�� obj�� radius���� ���� ��ü�� radius���� ���ؼ� ������
		 true �ƴϸ� false�� �����մϴ�.		 
		 */
		
		if(arg0 != null && arg0 instanceof Circle) {
			return this.radius == ((Circle) arg0).radius;
		}else {
			return false;
		}
		
	   	}
}
