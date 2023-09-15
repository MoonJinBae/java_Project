package battingBall;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BattingBallManager {
	
	private List<Player> pitcher = new ArrayList<>(); // 투수
	private List<Player> hitter = new ArrayList<>(); // 타자
	private int strike; // 스트라이크 저장
	private int ball; // 볼 저장
	private int hits; // 안타 저장
	private int pitcherCourse; // 투수 코스
	private int hitterCourse; // 타자 코스
	
	void addPitcher() { // 투수 등록
		int power = (int)(Math.random()*10)+1;
		int contact = (int)(Math.random()*10)+1;
		pitcher.add(new Player("투수",power, contact));
	}
	void addHitter() { // 타자 등록
		int power = (int)(Math.random()*10)+1;
		int contact = (int)(Math.random()*10)+1;
		hitter.add(new Player("타자", power, contact));
	}
	void play(Scanner scan) {
		while (hits < 4) {
			int pitcherCourse = (int)(Math.random()*5)+1;
			this.pitcherCourse = pitcherCourse; // 투수 코스 저장
			System.out.println("투수코스" + pitcherCourse);
			System.out.println("========================");
			System.out.println("1.왼쪽높은공  | 2.오른쪽높은공");
			System.out.println("-------------------------");
			System.out.println("3.왼쪽낮은공  | 4.오른쪽낮은공");
			System.out.println("5.Ball");
			System.out.println("========================");
			System.out.println("코스 선택 >>");
			int hitterCourse = scan.nextInt();
			this.hitterCourse = hitterCourse; // 타자 코스 선택
			if (pitcher.get(0).getPower() < hitter.get(0).getPower()
					&& pitcher.get(0).getContact() < hitter.get(0).getContact()) {
				switch (this.pitcherCourse) {
				case 1:
					if (hitterCourse == 1 && hitter.get(0).getPower() == 10) {
						System.out.println("홈~~런~~~!!");
						System.out.println("==WIN==");
						return;
					} else if (hitterCourse == 1 && hitter.get(0).getPower() < 10) {
						System.out.println("3루타~!!");
						hits += 3;
						break;
					} else if (hitterCourse == 2) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 2:
					if (hitterCourse == 2 && hitter.get(0).getPower() == 10) {
						System.out.println("홈~~런~~~!!");
						System.out.println("==WIN==");
						return;
					} else if (hitterCourse == 2 && hitter.get(0).getPower() < 10) {
						System.out.println("3루타~!!");
						hits += 3;
						break;
					} else if (hitterCourse == 1) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 3:
					if (hitterCourse == 3 && hitter.get(0).getPower() == 10) {
						System.out.println("홈~~런~~~!!");
						System.out.println("==WIN==");
						return;
					} else if (hitterCourse == 3 && hitter.get(0).getPower() < 10) {
						System.out.println("3루타~!!");
						hits += 3;
						break;
					} else if (hitterCourse == 4) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 4:
					if (hitterCourse == 4 && hitter.get(0).getPower() == 10) {
						System.out.println("홈~~런~~~!!");
						System.out.println("==WIN==");
						return;
					} else if (hitterCourse == 4 && hitter.get(0).getPower() < 10) {
						System.out.println("3루타~!!");
						hits += 3;
						break;
					} else if (hitterCourse == 3) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 5:
					if (hitterCourse == 5) {
						ball++;
						System.out.println("볼을 골라냈습니다~!! [" + ball + "ball]");
						if (ball == 4) {
							System.out.println("볼넷~~!! ==WIN==");
							return;
						}
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]");
						if (strike == 3) {
							System.out.println("OUT~~!! ==LOSE==");
							return;
						}
						break;
					}
				}
			}
			if (pitcher.get(0).getPower() < hitter.get(0).getPower()
					&& pitcher.get(0).getContact() > hitter.get(0).getContact()) {
				switch (this.pitcherCourse) {
				case 1:
					if (hitterCourse == 1) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else if (hitterCourse == 2) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 2:
					if (hitterCourse == 2) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else if (hitterCourse == 1) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 3:
					if (hitterCourse == 3) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else if (hitterCourse == 4) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 4:
					if (hitterCourse == 4) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else if (hitterCourse == 3) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 5:
					if (hitterCourse == 5) {
						ball++;
						System.out.println("볼을 골라냈습니다~!! [" + ball + "ball]");
						if (ball == 4) {
							System.out.println("볼넷~~!! ==WIN==");
							return;
						}
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]");
						if (strike == 3) {
							System.out.println("OUT~~!! ==LOSE==");
							return;
						}
						break;
					}
				}
			}
			if (pitcher.get(0).getPower() > hitter.get(0).getPower()
					&& pitcher.get(0).getContact() < hitter.get(0).getContact()) {
				switch (this.pitcherCourse) {
				case 1:
					if (hitterCourse == 1) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else if (hitterCourse == 2) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 2:
					if (hitterCourse == 2) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else if (hitterCourse == 1) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 3:
					if (hitterCourse == 3) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else if (hitterCourse == 4) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 4:
					if (hitterCourse == 4) {
						System.out.println("2루타~!!");
						hits += 2;
						break;
					} else if (hitterCourse == 3) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 5:
					if (hitterCourse == 5) {
						ball++;
						System.out.println("볼을 골라냈습니다~!! [" + ball + "ball]");
						if (ball == 4) {
							System.out.println("볼넷~~!! ==WIN==");
							return;
						}
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]");
						if (strike == 3) {
							System.out.println("OUT~~!! ==LOSE==");
							return;
						}
						break;
					}
				}
			}
			if (pitcher.get(0).getPower() > hitter.get(0).getPower()
					&& pitcher.get(0).getContact() > hitter.get(0).getContact()) {
				switch (this.pitcherCourse) {
				case 1:
					if (hitterCourse == 1) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 2:
					if (hitterCourse == 2) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 3:
					if (hitterCourse == 3) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 4:
					if (hitterCourse == 4) {
						System.out.println("안타~!!");
						hits += 1;
						break;
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]"); 
					if (strike == 3) {
						System.out.println("OUT~~!! ==LOSE==");
						return;
					}
					break;
					}
				case 5:
					if (hitterCourse == 5) {
						ball++;
						System.out.println("볼을 골라냈습니다~!! [" + ball + "ball]");
						if (ball == 4) {
							System.out.println("볼넷~~!! ==WIN==");
							return;
						}
					} else {
						strike++;
						System.out.println("strike~~!! [" + strike + "strike]");
						if (strike == 3) {
							System.out.println("OUT~~!! ==LOSE==");
							return;
						}
						break;
					}
				}
			}
			System.out.println();
		}
		System.out.println("===WIN===");
	}
	
	void printPhysical() {
		System.out.println("투수 정보");
		for (Player p : pitcher) {
			System.out.println(p);
		}
		System.out.println("타자 정보");
		for (Player h : hitter) {
			System.out.println(h);
		}
	}
	
	public List<Player> getPitcher() {
		return pitcher;
	}
	public void setPitcher(List<Player> pitcher) {
		this.pitcher = pitcher;
	}
	public List<Player> getHitter() {
		return hitter;
	}
	public void setHitter(List<Player> hitter) {
		this.hitter = hitter;
	}
	public int getStrike() {
		return strike;
	}
	public void setStrike(int strike) {
		this.strike = strike;
	}
	public int getBall() {
		return ball;
	}
	public void setBall(int ball) {
		this.ball = ball;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getPitcherCourse() {
		return pitcherCourse;
	}
	public void setPitcherCourse(int pitcherCourse) {
		this.pitcherCourse = pitcherCourse;
	}
	public int getHitterCourse() {
		return hitterCourse;
	}
	public void setHitterCourse(int hitterCourse) {
		this.hitterCourse = hitterCourse;
	}
	
	
}
