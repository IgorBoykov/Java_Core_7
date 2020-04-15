package Tast;

public class Main {

	public static void main(String[] args) {

		Cy_27 c = new Cy_27(10, 15, 1500, 800, "grey");
		System.out.println(c);
		c.Zapusk((int) (Math.random() * 68 + 20));
		c.Vzlit(Math.random() * 1000);
		c.MoveUp((int) (Math.random() * 100));
		c.MoveDown((int) (Math.random() * 100));
		c.MoveLeft((int) (Math.random() * 100));
		c.MoveRight((int) (Math.random() * 100));
		c.Stels();
		c.Strike();
		c.Turbo();
		c.Posadka();

	}

}
