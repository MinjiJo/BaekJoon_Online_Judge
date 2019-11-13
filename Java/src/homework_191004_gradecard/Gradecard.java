package homework_191004_gradecard;

public class Gradecard {
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
		return tot;
	}
	public void setTot(int tot) {
		this.tot = kor + math + eng;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = tot / 3;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
