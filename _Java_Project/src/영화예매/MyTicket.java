package 영화예매;

import java.util.List;
/*
<사용자 메뉴>
1. 예매하기 	
	1) 영화 선택
	2) 날짜, 시간 정하기
	3) 인원 수 
	4) 좌석 선택(인원 만큼) 
	5) 결제(등급별 할인)
2. 예매 확인
3. 예매 취소
*/

public class MyTicket { //내가 선택한 영화 정보
	private String name; //영화 이름
	private String date; //날짜
	private String time; //시간
	private List<String> seat; //좌석
	private int price; //가격
	private int people; //인원
	
	public MyTicket(String name, String date, String time, List<String> seat, int price, int people) {
		this.name=name;
		this.date=date;
		this.time=time;
		this.seat=seat;
		this.price=price;
		this.people=people;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<String> getSeat() {
		return seat;
	}

	public void setSeat(List<String> seat) {
		this.seat = seat;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}
	
}

