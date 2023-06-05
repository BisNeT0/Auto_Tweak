package com.autotweak.model.entities;

import com.autotweak.model.entities.enums.TypeCar;

public class Car {
	private TypeCar typeCar;
	
	private String color;
	private int breaks;
	private int steeringWheel;
	private int exhaust;
	private int seat;
	private int shiftKnob;
	private double budget;
	
	public Car() {}

	public Car(TypeCar typeCar, String color, int breaks, int steeringWheel, int exhaust, int seat,
			int shiftKnob,double budget) {
		super();
		this.typeCar = typeCar;
		this.color = color;
		this.breaks = breaks;
		this.steeringWheel = steeringWheel;
		this.exhaust = exhaust;
		this.seat = seat;
		this.shiftKnob = shiftKnob;
		this.budget = budget;
	}


	public TypeCar getTypeCar() {
		return typeCar;
	}

	public void setTypeCar(TypeCar typeCar) {
		this.typeCar = typeCar;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBreaks() {
		return breaks;
	}

	public void setBreaks(int breaks) {
		this.breaks = breaks;
	}

	public int getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(int steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public int getExhaust() {
		return exhaust;
	}

	public void setExhaust(int exhaust) {
		this.exhaust = exhaust;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getShiftKnob() {
		return shiftKnob;
	}

	public void setShiftKnob(int shiftKnob) {
		this.shiftKnob = shiftKnob;
	}
	
	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return	
				"TIPO: "+typeCar+"\n" 
				+"COR: "+color +"\n" 
				+"FREIO: "+breaks+"\n" 
				+"DIREÇÃO: "+steeringWheel +"\n" 
				+"ESCAPAMENTO: "+exhaust +"\n" 
				+"BANCO: "+seat +"\n" 
				+"CAMBIO: "+shiftKnob +"\n\n\n" 
				+"ORÇAMENTO: "+budget+"\n\n\n\n";
				
	}

	
	
	
}
