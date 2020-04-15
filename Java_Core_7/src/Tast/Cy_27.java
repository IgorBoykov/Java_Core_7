package Tast;

public class Cy_27 extends Plane implements possibilitable {

	public int MaxSpeed;
	public String Color;
	public PlaneControl PlaneControl = new PlaneControl();

	public Cy_27(int width, int height, int mass, int maxSpeed, String color) {
		super(width, height, mass);
		MaxSpeed = maxSpeed;
		Color = color;
	}

	public int getMaxSpeed() {
		return MaxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		MaxSpeed = maxSpeed;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public PlaneControl getPlaneControl() {
		return PlaneControl;
	}

	public void setPlaneControl(PlaneControl planeControl) {
		PlaneControl = planeControl;
	}

	@Override
	public String toString() {
		return "Cy_27 [MaxSpeed=" + MaxSpeed + ", Color=" + Color + ", toString()=" + super.toString() + "]";
	}

	public void MoveUp(Integer km) {
		PlaneControl.up(km);
	}

	public void MoveDown(Integer km) {
		PlaneControl.down(km);
	}

	public void MoveLeft(Integer km) {
		PlaneControl.left(km);
	}

	public void MoveRight(Integer km) {
		PlaneControl.right(km);
	}

	@Override
	public void Turbo() {
		int t = (int) (Math.random() * 100) + getMaxSpeed();
		System.out.println("TurboSpeed " + t);
	}

	@Override
	public void Stels() {
		int s = (int) (Math.random() * 60);
		System.out.println("Cy-27 не видно прот€гом " + s + " хв");

	}

	@Override
	public void Strike() {
		int b = (int) (Math.random() * 100);
		System.out.println("—у-27 скидуЇ " + b + " €дерних боЇголовок");

	}

}
