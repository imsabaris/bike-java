package org.bike;

public class Ktm implements Bike  {

	@Override
	public void cost() {
		System.out.println("2,00,000");
		
	}

	@Override
	public void speed() {
		System.out.println("160Km/hr");
		
	}

	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}
}
