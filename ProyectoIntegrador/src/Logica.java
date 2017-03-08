import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import processing.core.PApplet;

public class Logica {

	private int pantalla = 1;
	private PApplet app;
	ArrayList<Personas> lista = new ArrayList<Personas>();
	TreeSet<Personas> listas = new TreeSet<Personas>(new OEdad());
	ArrayList<Personas> backup = new ArrayList<Personas>();
	HashSet<Personas> sinOrden = new HashSet<Personas>();

	public Logica(PApplet app) {
		String[] nombres, datos, colores;
		this.app = app;

		nombres = app.loadStrings("data/nombres.txt");
		datos = app.loadStrings("data/datos.txt");
		colores = app.loadStrings("data/colores.txt");

		for (int i = 0; i < nombres.length; i++) {
			String[] nombre = nombres[i].split(":");
			String[] dato = datos[i].split("/");
			String[] color = colores[i].split("/");
			lista.add(new Personas(nombre[0], nombre[1], Long.parseLong(dato[0]), Integer.parseInt(dato[1]),
					Integer.parseInt(dato[2]), Integer.parseInt(color[0]), Integer.parseInt(color[1]),
					Integer.parseInt(color[2]), app));

		}
		backup.addAll(lista);
	}

	public void pantalla() {
		switch (pantalla) {

		case 0:
			app.background(255);

			break;

		case 1:
			app.background(0);
			for (int i = 0; i < lista.size(); i++) {
				Personas pe = lista.get(i);
				pe.pintar(50, 20 * i + 20);
			}

			Iterator<Personas> old = listas.iterator();
			int cualquiera = 0;
			while (old.hasNext()) {
				Personas algo = old.next();
				algo.pintar(50, 20 * cualquiera + 20);
				cualquiera++;
			}

			Iterator<Personas> sin = sinOrden.iterator();
			int cualquiera2 = 0;
			while (sin.hasNext()) {
				Personas algo = sin.next();
				algo.pintar(50, 20 * cualquiera2 + 20);
				cualquiera2++;
			}

			break;
		}
	}

	public void presionar() {

	}

	public void teclado() {
		
		// Se organiza en orden natural a través del nombre
		if (app.keyCode == '1') {
			lista.removeAll(backup);
			listas.removeAll(backup);
			sinOrden.removeAll(backup);
			lista.addAll(backup);
			Collections.sort(lista);
		}

		// Se organizará según su peso

		if (app.keyCode == '2') {
			lista.removeAll(backup);
			listas.removeAll(backup);
			sinOrden.removeAll(backup);
			lista.addAll(backup);
			OPeso peso = new OPeso();
			Collections.sort(lista, peso);
		}

		// Se organizará según su edad
		if (app.keyCode == '3') {
			listas.addAll(backup);
			lista.removeAll(backup);
			sinOrden.removeAll(backup);

		}

		// No ordenados sin repetidos (Según la igualdad base)
		if (app.keyCode == '4') {
			sinOrden.addAll(backup);
			lista.removeAll(backup);
			listas.removeAll(backup);
		}
		
	}

	public void organizarEdad() {
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 1; j < lista.size(); j++) {
				Personas uno = (Personas) lista.get(j - 1);
				Personas dos = (Personas) lista.get(j);
				if (uno.getEdad() > dos.getEdad()) {
					lista.set(j - 1, dos);
					lista.set(j, uno);

				}
			}

		}
	}

	public void avanceEdad() {
		for (int i = 0; i < lista.size(); i++) {
			PApplet.println(((Personas) lista.get(i)).getEdad());

		}
	}

}
