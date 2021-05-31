package com.training.oops;

public class Car implements IVehicle{

	@Override
	public void steering() {
		System.out.println("Power Steering");		
	}

	@Override
	public void brakes() {
		System.out.println("Disk Brakes");
		
	}

	@Override
	public void acc() {
		System.out.println("Accelerator");
		
	}

	@Override
	public void clutch() {
		System.out.println("Clutch");
		
	}

	@Override
	public int gears() {
		System.out.println("Manual gears");
		return 0;
	}

}
