package 영화예매;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Time {
	private int num; //번호
	private HashMap<String, Integer> timeNprice=new HashMap<>(); //시간, 가격
	private ArrayList<String> seat; //좌석
	private MovieReservation m = new MovieReservation(); //좌석 예매
	
	public Time(int num, String time, Integer price) { //시간 생성자
		this.num=num;
		timeNprice.put(time, price);
		seat=m.getTicketingSeats();
	}
	
	public void printTime() { //시간 출력
		for(String tmp: getTimeNprice().keySet()) {
			System.out.print("<"+tmp+">");
		}
	}
	
	public void ticketSeat(Scanner scan) { //좌석 예매
		m.selectMovieSeats(scan);
	}
	
	public void printSeat() { //예매한 좌석 출력
		System.out.println("--예매한 좌석--");
		for(String tmp: seat) {
			System.out.print(tmp + " ");
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public HashMap<String, Integer> getTimeNprice() {
		return timeNprice;
	}

	public void setTimeNprice(HashMap<String, Integer> timeNprice) {
		this.timeNprice = timeNprice;
	}

	public ArrayList<String> getSeat() {
		return seat;
	}

	public void setSeat(ArrayList<String> seat) {
		this.seat = seat;
	}

	public MovieReservation getM() {
		return m;
	}

	public void setM(MovieReservation m) {
		this.m = m;
	}
}