package kadai_014;

public class Car_Chapter14 {
	private int gear = 0;
	private int speed = 0;
	
	public Car_Chapter14 (int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void gearChange (int afterGear) {
		if ((afterGear > 5) || (afterGear < 1)) {
			this.speed = 10;
			System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
			return;
		}
			this.speed = afterGear * 10;
			
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
	}
	
	public void run () {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
