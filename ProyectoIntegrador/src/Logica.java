import processing.core.PApplet;

public class Logica {

	private int pantalla = 1;
	private PApplet app;

	public Logica(PApplet app) {
		this.app=app;

	}

	public void pantalla() {
		switch (pantalla) {

		case 0:
			app.background(255);

			break;

		case 1:
			app.background(0);
			break;
		}
	}

	public void teclado() {

	}

	public void presionar() {
		
	}

}
