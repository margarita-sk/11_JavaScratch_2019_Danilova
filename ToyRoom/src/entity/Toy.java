package entity;

import enums.AgeTypes;
import enums.Size;
import enums.ToyTypes;

public abstract class Toy {

	private ToyTypes toyType;
	private double price;
	private AgeTypes ageType;
	private Size size;

	public Toy(ToyTypes toyType, double price, AgeTypes ageType, Size size, Object obj) {
		super();
		this.toyType = toyType;
		this.price = price;
		this.ageType = ageType;
		this.size = size;
	}

	public ToyTypes getToyType() {
		return toyType;
	}

	public double getPrice() {
		return price;
	}

	public AgeTypes getAgeType() {
		return ageType;
	}

	public Size getSize() {
		return size;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Toy)) {
			return false;
		}
		Toy toyObj = (Toy) obj;
		if ((toyObj.ageType.equals(ageType)) && (toyObj.size.equals(size)) && (toyObj.toyType.equals(toyType))
				&& (Double.compare(toyObj.price, this.price) == 0)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + toyType.hashCode();
		result = (int) (31 * result + price);
		result = 31 * result + ageType.hashCode();
		result = 31 * result + size.hashCode();
		return result;
	}

	@Override
	public String toString() {
		String answer = "\n" + "Toy: " + this.toyType + " size: " + this.size + " price: " + this.price
				+ " for children from " + this.ageType.getMin() + " to " + this.ageType.getMax() + " years old";
		return answer;
	}

}
