package Hello;

public class student {
	int stunum;
	String name;
	int korean;
	int english;
	int math;
	int sum;
	int avg;
	public student() {
		
	}
	
	public student(int stunum, String name, int korean, int english, int math, int sum, int avg) {
		this.stunum = stunum;
		this.name = name;
		this.korean = korean;
		this.english = korean;
		this.math = math;
		this.sum += korean + english + math;
		this.avg = (korean + english +math)/3;
		
		
	}

	public int getStunum() {
		return stunum;
	}

	public void setStunum(int stunum) {
		this.stunum = stunum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	
}
