package entity;

import enums.AgeTypes;
import enums.BallTypes;
import enums.Size;
import enums.ToyTypes;

public class Ball extends Toy {

	private BallTypes ballType;

	public Ball(ToyTypes toyType, double price, AgeTypes ageType, Size size, BallTypes ballType) {
		super(toyType, price, ageType, size, ballType);
		this.ballType = ballType;
	}

	public BallTypes getBallType() {
		return ballType;
	}

	@Override
	public boolean equals(Object obj) {
		Ball ball = (Ball) obj;
		return super.equals(obj) && ball.ballType.equals(ballType);
	}

	@Override
	public int hashCode() {
		return super.hashCode() * 31 + ballType.hashCode();
	}

	@Override
	public String toString() {
		return super.toString() + " type: " + this.ballType;
	}
}
