package Tast;

public abstract class Plane {

	public void Zapusk(int TimeToStart) {
		System.out.println("До зaпуску Су-27 зaлишилось " + TimeToStart);
	}

	public void Vzlit(double TimeForFly) {
		System.out.println("За повного баку Су-27 пролетить " + TimeForFly + " кілометрів");
	}

	public void Posadka() {
		System.out.println("Су-27 іде на посадку");
	}

	public int width;
	public int height;
	public int mass;

	public Plane(int width, int height, int mass) {
		super();
		this.width = width;
		this.height = height;
		this.mass = mass;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	@Override
	public String toString() {
		return "Plane [width=" + width + ", height=" + height + ", mass=" + mass + "]";
	}

}
