package battingBall;

public class Player {
	private String name;
	private int power;
	private int contact; // 컨택 능력
	
	public Player(String name, int power, int contact) {
		this.name = name;
		this.power = power;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Player[" + name + "], power[" + power + "], contact[" + contact + "]";
	}
	
	
}
