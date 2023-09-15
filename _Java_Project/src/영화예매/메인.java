package 영화예매;

import java.util.ArrayList;
import java.util.Scanner;

public class 메인 {
	
	public static void main(String[] args) {
		ArrayList<MyTicket> myList = new ArrayList<>(); //나의 예매 목록
		Scanner scan=new Scanner(System.in);
		예매매니저 mg=new 예매매니저();
		int menu=0;
		
		System.out.println("___  ___               _         _____  _        _           _    _               \r\n"
				+ "|  \\/  |              (_)       |_   _|(_)      | |         | |  (_)              \r\n"
				+ "| .  . |  ___  __   __ _   ___    | |   _   ___ | | __  ___ | |_  _  _ __    __ _ \r\n"
				+ "| |\\/| | / _ \\ \\ \\ / /| | / _ \\   | |  | | / __|| |/ / / _ \\| __|| || '_ \\  / _` |\r\n"
				+ "| |  | || (_) | \\ V / | ||  __/   | |  | || (__ |   < |  __/| |_ | || | | || (_| |\r\n"
				+ "\\_|  |_/ \\___/   \\_/  |_| \\___|   \\_/  |_| \\___||_|\\_\\ \\___| \\__||_||_| |_| \\__, |\r\n"
				+ "                                                                             __/ |\r\n"
				+ "                                                                            |___/ ");
				
		
		// 메뉴 출력
		while(menu!=5) {
			System.out.println("--메뉴--");
			System.out.println("1.예매하기 | 2.예매정보보기 | 3.예매한 영화정보보기 | 4.예매취소 | 5.종료");
			System.out.println("메뉴 선택 >> ");
			menu=scan.nextInt(); //메뉴 선택
			switch(menu) {
			case 1:
				mg.ticketing(scan, myList); //티케팅
				mg.ticket(myList); //내 예매목록에 추가
				break;
			case 2:
				mg.printAllTicket(myList); //예매 목록의 정보 전부 출력
				break;
			case 3:
				mg.printTicket(myList,scan); //예매한 영화 중 하나의 세부정보 출력
				break;
			case 4:
				mg.printAllTicket(myList);
				mg.cancelTicket(scan,myList); //예매 취소
				break;
			case 5:
				System.out.println("예매 시스템을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

	
}