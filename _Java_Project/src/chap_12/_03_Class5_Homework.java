package chap_12;

public class _03_Class5_Homework {

	public static void main(String[] args) {
		/* Tv 클래스 생성
		 * - pwoer (on / off)
		 * - ch (up : 1씩 증가 / down : 1씩 감소)
		 * - ch 은 20까지(20이 넘어가면 다시 0번으로 순환구조)
		 * - vol (up : 1씩 증가 / down : 1씩 감소)
		 * - vol은 10까지(10이 max, 0이면 음소거라고 출력)
		 */
		Tv t = new Tv();
		t.power();
		t.chUp();
		t.chUp();
		t.setCh(20);
		t.chUp();
		t.chDown();
		t.chDown();
		t.setCh(0);
		t.chDown();
		t.chDown();
		t.power();
		t.volUp();
		t.volDown();
		t.power();
		t.volUp();
		t.volUp();
		t.setVol(9);
		t.volUp();
		t.volDown();
		t.volDown();
		t.setVol(1);
		t.volDown();
		
	}

}

// 클래스 생성 위치
// 멤버변수의 기본값은 별도 값을 주지 않더라도 기본셋팅 0 / null
class Tv {
	private boolean power;
	private int ch; 
	private int vol;
	
	public void power() {
		this.power = !power;
		if (power) { // 전원이 true면 실행
			System.out.println("전원 ON");
		}
		else { // true가 아니면(false) 실행
			System.out.println("전원 OFF");
		}
	}
	public void chUp() {
		if (power) {
				this.ch++;
				if (ch == 21) {
					ch = 0;
				}
				System.out.println("[Ch+] " + ch);
		}
	}
	public void chDown() {
		if (power) {
			this.ch--;
			if (ch < 0) {
				ch = 20;
			}
			System.out.println("[Ch-] " + ch);
		}
	}
	public void volUp() {
		int max = 10;
		int min = 0;
		if (power && min <= vol && vol < max) {
			this.vol++;
			if (vol == max) {
				System.out.println("[Volume] MAX");
			}
			else {
				System.out.println("[Volume+] " + vol);
			}
		}
	}
	public void volDown() {
		int max = 10;
		int min = 0;
		if (power && min < vol && vol <= max) {
			this.vol--;
			if (vol == min) {
				System.out.println("[Volume] MUTE");
			}
			else {
				System.out.println("[Volume-] " + vol);
			}
		}
		
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
}