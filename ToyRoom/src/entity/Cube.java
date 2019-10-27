package entity;

import enums.AgeTypes;
import enums.CubeTypes;
import enums.Size;
import enums.ToyTypes;

public class Cube extends Toy {

	private CubeTypes cubeType;

	public Cube(ToyTypes toyType, double price, AgeTypes ageType, Size size, CubeTypes cubeType) {
		super(toyType, price, ageType, size, cubeType);
		this.cubeType = cubeType;
	}

	public CubeTypes getCubeType() {
		return cubeType;
	}

	@Override
	public boolean equals(Object obj) {
		Cube cube = (Cube) obj;
		return super.equals(obj) && cube.cubeType.equals(cubeType);
	}

	@Override
	public int hashCode() {
		return super.hashCode() * 31 + cubeType.hashCode();
	}

	@Override
	public String toString() {
		return super.toString() + " type: " + this.cubeType;
	}
}
