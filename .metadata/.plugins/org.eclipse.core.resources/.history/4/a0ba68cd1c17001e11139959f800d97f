package 영화예매;

import java.util.ArrayList;

public class Date {
	private int num; //번호
	private String date; //날짜
	private ArrayList<Time> time =new ArrayList<>(); //시간
	private int cnt=1; //시간 번호
	
	public Date() {}
	
	public Date(int num, String date) { //기본 날짜 목록
		this.num=num;
		this.date=date;
		insertTime("AM 00:00", 12000);
		insertTime("AM 9:00",10000);
		insertTime("AM 11:00",15000);
		insertTime("PM 2:00",15000);
		insertTime("PM 5:00",15000);
		insertTime("PM 8:00",15000);
	}
	
	public void insertTime(String time, int price) { //시간대 추가
		getTime().add(new Time(cnt,time,price));
		cnt++;
	}
	
	public void printTimeList() { //시간대 목록 출력
		for(Time tmp: time) {
			System.out.print(tmp.getNum()+". ");
			for(String t: tmp.getTimeNprice().keySet()) {
				System.out.print(t+" -> ");
				System.out.println(tmp.getTimeNprice().get(t)+"원");
			}
		}
	}
	
	public void printDate() { //날짜 출력
		System.out.printf("<%s>",date);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ArrayList<Time> getTime() {
		return time;
	}

	public void setTime(ArrayList<Time> time) {
		this.time = time;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	
}
