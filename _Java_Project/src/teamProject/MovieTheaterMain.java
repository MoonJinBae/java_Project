package teamProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieTheaterMain {
    public static void main(String[] args) {
    	
    	MovieReservation mr = new MovieReservation();
    	Scanner scan = new Scanner(System.in);
    	mr.printTicketing();
    	mr.addMovie();


    	int menu = 0;
    	do {
			System.out.println("___  ___               _         _____  _        _           _    _               \n"
					+ "|  \\/  |              (_)       |_   _|(_)      | |         | |  (_)              \n"
					+ "| .  . |  ___  __   __ _   ___    | |   _   ___ | | __  ___ | |_  _  _ __    __ _ \n"
					+ "| |\\/| | / _ \\ \\ \\ / /| | / _ \\   | |  | | / __|| |/ / / _ \\| __|| || '_ \\  / _` |\n"
					+ "| |  | || (_) | \\ V / | ||  __/   | |  | || (__ |   < |  __/| |_ | || | | || (_| |\n"
					+ "\\_|  |_/ \\___/   \\_/  |_| \\___|   \\_/  |_| \\___||_|\\_\\ \\___| \\__||_||_| |_| \\__, |\n"
					+ "                                                                             __/ |\n"
					+ "                                                                            |___/ ");
			System.out.println("1. 영화 선택 |2. 예매 내역 |3. 결제");
			System.out.println("4. 예매 취소 |5. 종료\n메뉴선택 >>");
			try {
				menu = scan.nextInt();
			} catch (InputMismatchException e) {
				scan = new Scanner(System.in);
			}
			switch (menu) {
			case 1:
				mr.selectMovie(scan);
				mr.selectMovieSeats(scan);
				break;
			case 2: 
				mr.printTicketing();
				break;
			case 3:
				mr.payments(scan);
				break;
			case 4:
				mr.deletMovie(scan);
				break;
			case 5:
				System.out.println("=== 종료 ===");
				break;
			default: System.out.println("잘못된 메뉴 입니다.");
				break;
			}
		} while (menu != 5);
    	
    	
    }
	
}
