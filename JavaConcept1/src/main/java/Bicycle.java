
public class Bicycle {

	private int cadence;
	private int gear;
	private int speed;
	
	public Bicycle(int cadence, int gear, int speed) {
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
		System.out.println(speed);
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
}
