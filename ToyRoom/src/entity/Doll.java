package entity;

import enums.AgeTypes;
import enums.DollTypes;
import enums.Size;
import enums.ToyTypes;

public class Doll extends Toy {

	private DollTypes dollType;

	public Doll(ToyTypes toyType, double price, AgeTypes ageType, Size size, DollTypes dollType) {
		super(toyType, price, ageType, size, dollType);
		this.dollType = dollType;
	}

	public DollTypes getDollType() {
		return dollType;
	}

	@Override
	public boolean equals(Object obj) {
		Doll doll = (Doll) obj;
		return super.equals(obj) && doll.dollType.equals(dollType);
	}

	@Override
	public int hashCode() {
		return super.hashCode() * 31 + dollType.hashCode();
	}

	@Override
	public String toString() {
		return super.toString() + " type: " + this.dollType;
	}

}
