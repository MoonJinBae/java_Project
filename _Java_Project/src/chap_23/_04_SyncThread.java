package chap_23;

import java.io.IOException;

class Bank {
	private int money = 10000;
	
	
	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	// 입금 메서드(동기화)
	public synchronized void saveMoney(int save) {
		int m = this.money;
		try {
			Thread.sleep(1000); 
		} catch (Exception e)	{
			e.printStackTrace();
		}
		setMoney(m + save);
	}
	// 출금 메서드(동기화)
	public synchronized void minusMoney(int minus) {
		int m = getMoney();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setMoney(m - minus);
	}
}

class Park extends Thread {
	@Override
	public void run() {
		System.out.println("start save");
		_04_SyncThread.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000)" + _04_SyncThread.myBank.getMoney());
	}
	
}

class ParkWife extends Thread {

	@Override
	public void run() {
		System.out.println("start minus");
		_04_SyncThread.myBank.minusMoney(5000);
		System.out.println("minusMoney(5000)" + _04_SyncThread.myBank.getMoney());
	}
	
}

public class _04_SyncThread {
	
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException{
		/* critical section은 2개 이상의 쓰레드가 동시에 접근 가능한 영역
		 * 동시에 여러개의 쓰레드가 접근하게 되면 문제가 생길 수 있음
		 * 세마포어(semaphore) 기법을 사용하여 한 순간에 오직 하나의 쓰레드만 사용가능
		 * 한 순간에 세마포어를 얻은 쓰레드만 접근가능 나머지는 대기상태가 됨.
		 * 
		 * 동기화 키워드 : synchronized
		 * 동기화가 필요한 메서드 앞에 선언
		 */
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();
		
	}

}
