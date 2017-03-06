import processing.core.PApplet;

public class Ejecutable extends PApplet {

	public Logica log;

	public static void main(String[] args) {

		PApplet.main("Ejecutable");
	}

	public void setup() {
	log = new Logica(this);	

	}

	public void settings() {
	size(1200,700);	

	}

	public void draw() {
	log.pantalla();	
	}

	public void keyPressed() {
    log.teclado();
	}
	
	public void mousePressed(){
	log.presionar();
	}

}
