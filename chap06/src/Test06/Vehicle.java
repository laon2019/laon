package Test06;

public class Vehicle {
	static String color;
	static int speed;

	Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	static void show() {
		System.out.println("color : " + color + ", speed : " + speed);
	}
}
