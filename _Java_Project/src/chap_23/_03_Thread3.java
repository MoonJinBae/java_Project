package chap_23;

class MyThread3 extends Thread {
	private int start;
	private int end;
	private int sum;
	
	public MyThread3() {}
	public MyThread3(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			sum += i;
		}
	}
}
public class _03_Thread3 {

	public static void main(String[] args) {
		// 1~50, 51~100까지의 합을 구하는 두개의 쓰레드를 만들어 그 결과를 확인
		
		// 두개의 쓰레드가 실행되고 난 후
		// Thread1의 합계 출력
		// Thread2의 합계 출력
		// Thread1 + Thread2 출력
		
		MyThread3 thr1 = new MyThread3(1, 50);
		thr1.start();
		MyThread3 thr2 = new MyThread3(51, 100);
		thr2.start();
		try {
			thr1.join(); // Thread-0번 끝나고
			thr2.join(); // Thread-1번
			Thread.sleep(1000); // 1초 기다렸다가 실행 1000/1
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(thr1.getName() + " 합계: " + thr1.getSum());
		System.out.println(thr2.getName() + " 합계: " + thr2.getSum());
		System.out.printf("%s, %s 합계 : %d", thr1.getName(),thr2.getName(),(thr1.getSum()+thr2.getSum()));
		
	}
}
