package 영화예매;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieReservation {
	   private int rows = 5; // 예매할 좌석의 행 수
	   private int cols = 10; // 예매할 좌석의 열 수
	   private int[][] seats = new int[rows][cols]; // 좌석 배열
	   private ArrayList<String> ticketingSeats = new ArrayList<>(); // 예매한 좌석 저장
	   private int people;
	   
	   void selectMovieSeats(Scanner scan) { //좌석 예매 프로그램
	      int end = 1;
	      System.out.println("=== 인원수 선택 ===");
	      people = scan.nextInt();
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
	         System.out.print("예매할 좌석의 행 번호를 입력하세요 (1행 - " + rows + "행) >> ");
	         int row = scan.nextInt();
	         System.out.print("예매할 좌석의 열 번호를 입력하세요 (1번 - " + cols + "번) >> ");
	         int col = scan.nextInt();
	         
	         // 좌석 예매 확인 및 처리
	         if (row >= 1 && row <= rows && col >= 1 && col <= cols) {
	            if (seats[row - 1][col - 1] == 0) {
	               seats[row - 1][col - 1] = 1; // 좌석 예매 처리
	               c = (char)(c+row-1);
	               ticketingSeats.add(String.valueOf(c)+col);
	               System.out.printf("선택하신 좌석은 [%s%02d] 입니다.%n", String.valueOf(c),col);
	               end++;
	            } else {
	               System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
	            }
	         } else {
	            System.out.println("올바른 좌석 번호를 입력해주세요.");
	         }
	         
	      }
	      System.out.println("예매가 완료되었습니다.");
	   }
	   void printTicketing() { //좌석 출력
	      Collections.sort(ticketingSeats);
	      System.out.print("예매하신 좌석은 => ");
	      for (String  seats : ticketingSeats) {
	         System.out.printf("[%s]", seats);
	      }
	      System.out.println(" 입니다.");
	   }
	   
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int[][] getSeats() {
		return seats;
	}

	public void setSeats(int[][] seats) {
		this.seats = seats;
	}

	public ArrayList<String> getTicketingSeats() {
		return ticketingSeats;
	}

	public void setTicketingSeats(ArrayList<String> ticketingSeats) {
		this.ticketingSeats = ticketingSeats;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	

}