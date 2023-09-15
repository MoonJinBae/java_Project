package studentManager;

public class School {
	
	private final String school = "Ezen"; // 학원명
	private String branch; // 지점
	private String subject; // 과목
	private String period; // 수강기간
	private String courseDate; // 강의요일
	private String time; // 강의시간
	private String teacher; // 선생님

	public School() {} // 기본생성자
	

	public School(String branch, String subject, String period, String courseDate, String time, String teacher) {
		super();
		this.branch = branch;
		this.subject = subject;
		this.period = period;
		this.courseDate = courseDate;
		this.time = time;
		this.teacher = teacher;
	}


	public String getSchool() {
		return school;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getCourseDate() {
		return courseDate;
	}

	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}

	@Override
	public String toString() {
		return "학원명[" + school + "], [지점명" + branch + "], [과목명" + subject + "], [수강기간" + period
				+ "], 수업요일[" + courseDate + "], 강의시간[" + time + "], 강사명[" + teacher + "]";
	}
	
   
}
