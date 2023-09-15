package 영화예매;

import java.util.ArrayList;

public class 영화 {
	private String name; //이름
	private ArrayList<Date> dateList=new ArrayList<>();//번호, 날짜가 들어있는 객체
	private int cnt=1; //날짜 번호
	
	public 영화() {}

	public 영화(String name) { //영화 추가
		this.name = name;
	}
	
	public void insertDate(String date) { //상영중인 영화에 날짜 추가
		this.dateList.add(new Date(cnt, date));
		cnt++;
	}
	
	public void printDateList() { //날짜리스트 출력
		for(Date tmp: dateList) {
			System.out.println(tmp.getNum()+". "+tmp.getDate());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Date> getDateList() {
		return dateList;
	}

	public void setDateList(ArrayList<Date> dateList) {
		this.dateList = dateList;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}