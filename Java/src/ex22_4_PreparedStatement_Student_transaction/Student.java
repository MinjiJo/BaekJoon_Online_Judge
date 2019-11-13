package ex22_4_PreparedStatement_Student_transaction;

public class Student {
	private int no;
	private String name;
	private int kor;
	private int math;
	private int eng;
	private int tot;
	private float avg;
	private String grade;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTot() {
		return tot = kor + math + eng;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public float getAvg() {
		return avg = tot / 3;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s",
				getNo(), getName(), getKor(), getMath(),
				getEng(), getTot(), getAvg(), getGrade());
	}
}
