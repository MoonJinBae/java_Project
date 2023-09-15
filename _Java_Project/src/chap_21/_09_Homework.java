package chap_21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class _09_Homework {
	public static void main(String[] args) throws IOException{
		/* 여행사 상품이 있습니다.
		 * 여행 비용. 15세 이상은 100만원, 그 미만은 50만원 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 때
		 * 1. 비용계산, 2. 고객명단 검색 => 출력
		 * 고객의 클래스를 생성하고 ArrayList로 고객 관리
		 * 
		 * 예) 고객 정보 => 고객 명단
		 * - 이름 : 이순신, 나이 : 40, 비용 : 100
		 * - 이름 : 김유신, 나이 : 20, 비용 : 100
		 * - 이름 : 홍길동, 나이 : 10, 비용 : 50
		 * 총 여행비용 : 250
		 * 
		 * 20대 이상 고객 명단 => 이름순으로 정렬(가나다 순)
		 * - 이름 : 김유신, 나이 : 20, 비용 : 100
		 * - 이름 : 이순신, 나이 : 40, 비용 : 100
		 * - 이름 : 홍길동, 나이 : 10, 비용 : 50
		 */
		Scanner scan = new Scanner(System.in);
		
		CustomerManager c = new CustomerManager();
		
		int menu = 0;
		do {
			System.out.println("--------패키지 여행 고객관리--------");
			System.out.println("1. 고객등록 |2. 고객조회 |3. 총비용계산");
			System.out.println("4. 20세 이상 고객조회 |5. 종료");
			System.out.println("메뉴 입력");
			try {
				menu = scan.nextInt();
			} catch (InputMismatchException e) {
				scan = new Scanner(System.in);
			}
			switch (menu) {
			case 1: 
				c.addCustomer(scan);
				break;
			case 2: 
				c.printCustomer(scan);
				break;
			case 3: 
				c.printPackageHistory();
				break;
			case 4: 
				c.print20YearOlder();
				break;
			case 5: 
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못된 메뉴 입니다.");
				break;
			}
		} while (menu != 5);
	}
}

class Customer implements Comparable<Customer> { // 고객정보 클래스
	// 멤버변수 이름, 나이, 비용
	private String name;
	private int age;
	private int price;
	// 생성자
	public Customer() {}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		price = (age >= 15) ? 100 : 50;
//		if (age >= 15) {
//			price = 100;
//		} else {
//			price = 50;
//		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price; 
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "고객명(" + name + "), 나이(" + age + "세), 패키지가격(" + price +"만원)";
	}
	public void printCustomerRoster() {
		System.out.printf("고갱명(%s), 나이(%d세), 패키지가격(%d만원)", name, age, price);
		System.out.println();
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}
class CustomerManager { // 매니저 클래스
	
	List<Customer> c = new ArrayList<>();
	
	// 고객 추가
	public void addCustomer(Scanner scan) {
		System.out.println("고객명 입력 >>");
		String name = scan.next();
		System.out.println("나이 입력 >>");
		int age = scan.nextInt();
		c.add(new Customer(name, age));
	}
	// 20세 이상 고갱명단
	public void print20YearOlder() {
//		c.sort(new Comparator<Customer>() {
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				// 이름순으로 정렬
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		Collections.sort(c);
		
		// for문으로 출력
		for (Customer tmp : c) {
			if (tmp.getAge() >= 20) {
				System.out.println(tmp);
			}
		}
		// 스트림을 이용한 출력
		c.stream().filter(n -> n.getAge() >= 20).sorted().forEach(System.out::print);
	}
	
	// 총 여행 비용
	public void printPackageHistory() {
		c.sort(new Comparator<Customer>() {
			@Override // 이름순으로 정렬
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (Customer cus : c) {
			cus.printCustomerRoster();
		}
		int sumPrice = c.stream().mapToInt(n -> n.getPrice()).sum();
		System.out.println("=>> 총 여행 비용(" + sumPrice + "만원)");
	}
	
	// 고객 조회
	public void printCustomer(Scanner scan) {
		c.sort(new Comparator<Customer>() {
			@Override // 이름순으로 정렬
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		int cnt = 0;
		System.out.println("고객명 입력 >>");
		String name = scan.next();
		for (Customer cus : c) {
			if (cus.getName().equals(name)) {
				System.out.println(cus.toString());
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("등록되지 않은 고객입니다.");
		}
	}

}
