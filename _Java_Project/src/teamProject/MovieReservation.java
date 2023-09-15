package teamProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieReservation {
	private int qty;
    private int people = 0;
    private int child = 0;
	private int rates = 12000;
	
	private int rows = 5; // 예매할 좌석의 행 수
	private int cols = 10; // 예매할 좌석의 열 수
	private int[][] seats = new int[rows][cols]; // 좌석 배열
	
	private List<String> ticketingSeats = new ArrayList<>(); // 예매한 좌석 저장
	
	private String selectMovie; // 선택한 영화
	private String selectTime; // 선택한 시간표
	private List<Movie> movieInfo = new ArrayList<>(); // 상영 영화 목록
	private List<String> reservations = new ArrayList<>(); // 영화 예매내역 저장
	
	void addMovie() {
		movieInfo.add(new Movie("엘리멘탈", addDay(), addTime()));
		movieInfo.add(new Movie("인디아나존스", addDay(), addTime()));
		movieInfo.add(new Movie("범죄도시3", addDay(), addTime()));
		movieInfo.add(new Movie("플래쉬", addDay(), addTime()));
		movieInfo.add(new Movie("스파이더맨", addDay(), addTime()));
		movieInfo.add(new Movie("가디언즈오브갤럭시", addDay(), addTime()));
	}
	List<String> addDay() {
		List<String> day = new ArrayList<>();
		day.add("7월 1일");
		day.add("7월 2일");
		day.add("7월 3일");
		day.add("7월 4일");
		day.add("7월 5일");
		day.add("7월 6일");
		day.add("7월 7일");
		return day;
	}
	List<String> addTime() {
		List<String> time = new ArrayList<>();
		time.add("00시 10분");
		time.add("08시 00분");
		time.add("10시 30분");
		time.add("13시 00분");
		time.add("16시 30분");
		time.add("19시 00분");
		time.add("22시 30분");
		time.add("24시 00분");
		return time;
	}
	
	void selectMovieSeats(Scanner scan) {
		this.qty += people;
		System.out.println("== 인원수 선택 ==");
		people = scan.nextInt();
		String seatsNumber = ""; // 좌석번호 문자열로 붙여서 한번에 저장(예약별로 저장하기 위해서)
		int end = 1;
		while (end <= people) {
			// 좌석 배치 출력
			System.out.println("==== 좌석 선택 ====");
			char c = 'A'; // 좌석 행 알페벳 순으로 표시
			for (int i = 0; i < rows; i++) {
				System.out.printf("[%d행]",i+1);
				for (int j = 0; j < cols; j++) {
					if (seats[i][j] == 0) {
						System.out.printf("[%s%02d]",c,j+1); // 빈 좌석 표시
					} else {
						System.out.printf("[%3s]","---"); // 예약된 좌석 표시
					}
				}
				c++;
				System.out.println();
			}
			c = 'A';
			// 좌석 예약
			System.out.print("예매할 좌석의 행 번호를 입력하세요 (1행 - " + rows + "행)\n☞");
			int row = scan.nextInt();
			System.out.print("예매할 좌석의 열 번호를 입력하세요 (1번 - " + cols + "번)\n☞");
			int col = scan.nextInt();
			
			// 좌석 예매 확인 및 처리
			if (row >= 1 && row <= rows && col >= 1 && col <= cols) {
				if (seats[row - 1][col - 1] == 0) {
					seats[row - 1][col - 1] = 1; // 좌석 예매 처리
					c = (char)(c+row-1);
					seatsNumber += "[" +String.valueOf(c)+col + "]";
					System.out.printf("선택하신 좌석은 [%s%02d] 입니다.%n", String.valueOf(c),col);
					end++;
				} else {
					System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
				}
			} else {
				System.out.println("올바른 좌석 번호를 입력해주세요.");
			}
		}
		ticketingSeats.add(seatsNumber); // 좌석번호 문자열로 붙여서 한번에 저장(예약별로 저장하기 위해서)
		System.out.println("예매가 완료되었습니다.");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}

	// 결제 기능
	public void payments(Scanner scan) {
		// 등급별 할인율 (VIP => 10%, GOLD => 5%, 일반Silver => 0%)
		// 기본요금 12000원
		this.qty -= child;
		int total = rates * qty;
		if (qty == 0) {
			System.out.println("결제하실 금액이 없습니다.(영화를 선택해 주세요)");
			return;
		}
		System.out.println("== 결제 하기 ==");
		System.out.println("일반요금[12000원], 5세이하[무료]");
		System.out.println("5세이하 인원 >>");
		child = scan.nextInt();
		System.out.println("멤버쉽 카드가 있으시면 제시해 주세요.");
		System.out.println("==== 할인율 ====");
		System.out.println("1.[VIP]회원 => 10%, |2.[GOLD]회원 => 5% |3. 멤버쉽카드 없음\n☞");
		int grade = scan.nextInt();
		switch (grade) {
		case 1 :
			System.out.println("[VIP] 고객님 결제하실 금액은 " + (total -(total * 0.1)) + "원 입니다.");
			break;
		case 2 :
			System.out.println("[GOLD] 고객님 결제하실 금액은 " + (total - (total * 0.05)) + "원 입니다.");
			break;
		case 3 :
			System.out.println("고객님 결제하실 금액은 " + total + "원 입니다.");
			break;
		default:System.out.println("잘못된 메뉴 입니다.");
			break;
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
	// 영화 선택
	public void selectMovie(Scanner scan) {
		System.out.println("=== 영화 목록 ===");
		for (int i = 0; i < movieInfo.size(); i++) { // 영화 목록 출력
			System.out.printf("%s.[%s] ", i+1, movieInfo.get(i).getMovieName());
		}
		System.out.println();
		System.out.print("=== 영화 선택 ===\n☞");
		int select = scan.nextInt();
		selectMovie = movieInfo.get(select - 1).getMovieName(); // 선택한 영화 저장
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		for (int i = 0; i < movieInfo.get(select - 1).getMovieDay().size(); i++) { // 영화 상영일 출력
			System.out.println((i+1) + ". " + movieInfo.get(select - 1).getMovieDay().get(i));
		}
		System.out.println("=== 상영일 선택 ===\n☞");
		select = scan.nextInt();
		selectTime = " (" + movieInfo.get(select - 1).getMovieDay().get(select - 1); // 선택한 상영일 저장
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
		for (int i = 0; i < movieInfo.get(select - 1).getMovieTime().size(); i++) { // 영화 시간표 출력
			System.out.println((i+1) +". " + movieInfo.get(select - 1).getMovieTime().get(i));
		}
		System.out.println("=== 시간 선택 ===\n☞");
		select = scan.nextInt();
		selectTime += " " + movieInfo.get(select - 1).getMovieTime().get(select - 1) + ")"; // 선택한 시간 저장
		reservations.add(selectMovie + selectTime);
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
	// 예매내역 출력
	void printTicketing() { 
		int index = -1;
		System.out.println("=== 예매 내역 ===");
		for (int i = 0; i < reservations.size(); i++) {
			System.out.println(reservations.get(i));
			Collections.sort(ticketingSeats);
			System.out.print("예매하신 좌석은 => ");
			System.out.println(ticketingSeats.get(i));
			index++;
		}
		if (index == -1) {
			System.out.println("예매하신 내역이 없습니다.");
			return;
		}
		System.out.println(" 입니다.");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}

	// 예매 취소
	public void deletMovie(Scanner scan) {
		System.out.println("=== 예매 취소 ===");
		for (int i = 0; i < reservations.size(); i++) {
			System.out.println((i+1) + ". " + reservations.get(i));
		}
		System.out.print("취소할 영화를 선택하세요 >>");
		int select = scan.nextInt();
		System.out.println("취소 하시겠습니까? [ 네(y) | 아니오(아무키나 입력) ]");
		String y_n = scan.next();
		if (y_n.equalsIgnoreCase("y")) {
			System.out.println(reservations.get(select-1) + " 취소 완료");
			reservations.remove(select-1);
			ticketingSeats.remove(select-1);
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		} else {
			return;
		}
	}
	
	
	

}