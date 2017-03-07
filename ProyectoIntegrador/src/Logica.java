import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {

	private int pantalla = 1;
	private PApplet app;
	ArrayList lista = new ArrayList<Personas>();

	public Logica(PApplet app) {
		String[] nombres, datos, colores;
		this.app=app;

		nombres = app.loadStrings("data/nombres.txt");
		datos = app.loadStrings("data/datos.txt");
		colores = app.loadStrings("data/colores.txt");	
		
		for (int i = 0; i < nombres.length; i++) {
			String[] nombre = nombres[i].split(":");
			String[] dato = datos[i].split("/");
			String[] color = colores[i].split("/");
			lista.add(new Personas(nombre[0],nombre[1],Integer.parseInt(dato[0]),Integer.parseInt(dato[1]),Integer.parseInt(dato[2]),Integer.parseInt(color[0]),Integer.parseInt(color[1]),Integer.parseInt(color[2])));
		}
		
		app.println(lista.size());
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
