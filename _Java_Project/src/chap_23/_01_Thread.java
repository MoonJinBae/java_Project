package chap_23;

class MyThread extends Thread{
	// 반드시 run이라는 메서드를 구현해야 함

	@Override
	public void run() {
		// 0~200까지 반복해서 실행하는 구문을 수행
		for (int i = 0; i <= 200; i++) {
			System.out.println(i + "번째 " + getName());
		}
	}
	
}

public class _01_Thread {

	public static void main(String[] args) {
		/* Thread 구현시 2가지 방법
		 * 1. Thread 클래스 상속하여 만들기
		 * 2. Runnable 인터페이스를 구현하여 만들기
		 * 자바는 다중상속을 허용하지 않으므로 다른 클래스를 상속중인 경우 2번으로 구현
		 * Thread(쓰레드)
		 * - 실행중인 프로그램이 OS로부터 메모리를 할당 받아 process 상태가 됨
		 * - 하나의 process는 하나 이상의 Thread를 가지게 되고, 실제 작업을 수행하는 단위는 Thread 단위이다.
		 * - Thread가 실제 CPU가 작업을 처리하는 단위
		 * - multi-Thread는 여러 Thread가 동시에 수행되는 프로그램
		 * - CPU는 시간을 잘게 쪼개서 Thread들을 번갈아 수행하면서 사용자들은 동시에 처리하는 듯한 효과
		 * - Thread는 각각 자신만의 작업공간을 가짐(context)
		 * - 각 Thread사이의 공유하는 자원이 있을 수 있음.(자바에서는 static instance)
		 * - 여러 Thread가 공유하는 자원 중 경쟁이 발생하는 부분을 critical section(임계영역)
		 * - critical section에 대한 동기화(순차적 수행)를 구현하여 오류를 막음.
		 */
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread th = new MyThread();
		th.start();
		
		MyThread th2 = new MyThread();
		th2.start();
		
	}

}
