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
			lista.add(new Personas(nombre[0],nombre[1],Long.parseLong(dato[0]),Integer.parseInt(dato[1]),Integer.parseInt(dato[2]),Integer.parseInt(color[0]),Integer.parseInt(color[1]),Integer.parseInt(color[2])));
		}
		
		
		
		
		
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 1; j < lista.size(); j++) {
				Personas uno = (Personas) lista.get(j-1);
				Personas dos = (Personas) lista.get(j);
				if(uno.getEdad()>dos.getEdad()){
					lista.set(j-1, dos);
					lista.set(j, uno);
					
				}
			}
			
		}
		
		for (int i = 0; i < lista.size(); i++) {
			app.println(((Personas)lista.get(i)).getEdad());
			
		}
		
		
		
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
