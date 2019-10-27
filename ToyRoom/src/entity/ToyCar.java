package entity;

import enums.AgeTypes;
import enums.CarTypes;
import enums.Size;
import enums.ToyTypes;

public class ToyCar extends Toy {

	private CarTypes carType;

	public ToyCar(ToyTypes toyType, double price, AgeTypes ageType, Size size, CarTypes carType) {
		super(toyType, price, ageType, size, carType);
		this.carType = carType;
	}

	public CarTypes getCarType() {
		return carType;
	}

	@Override
	public boolean equals(Object obj) {
		ToyCar car = (ToyCar) obj;
		return super.equals(obj) && car.carType.equals(carType);
	}

	@Override
	public int hashCode() {
		return super.hashCode() * 31 + carType.hashCode();
	}

	@Override
	public String toString() {
		return super.toString() + " type: " + this.carType;
	}
}
