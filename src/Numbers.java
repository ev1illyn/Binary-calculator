import java.util.Scanner;

public abstract class Numbers implements Interface {
	Scanner in = new Scanner(System.in);
	private double number = 0;

	public Numbers() {
		System.out.println("Número:");
		setNumber(in.nextDouble());
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

}
