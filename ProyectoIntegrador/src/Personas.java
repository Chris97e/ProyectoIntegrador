import processing.core.PApplet;

public class Personas {
	
	

	private String nombre, apellido;
	private long cédula;
	private int  edad, peso, r, g, b;
	private PApplet app;
	
	public Personas(String nombre, String apellido, long cédula, int edad, int peso, int r, int g, int b, PApplet app) {
		super();
		this.nombre = nombre;
		this.app=app;
		this.apellido = apellido;
		this.cédula = cédula;
		this.edad = edad;
		this.peso = peso;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	
	
	public void pintar(int x, int y){
	
		app.textSize(15);
		app.fill(r,g,b);
		app.text(nombre,x,y);
		app.text(apellido,x,y);
		app.text(cédula,x,y);
		app.text(edad,x,y);
		app.text(peso,x,y);
		app.noFill();
		
		
	}
	
	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personas other = (Personas) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public long getCédula() {
		return cédula;
	}



	public void setCédula(long cédula) {
		this.cédula = cédula;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	public int getR() {
		return r;
	}



	public void setR(int r) {
		this.r = r;
	}



	public int getG() {
		return g;
	}



	public void setG(int g) {
		this.g = g;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}
	
	
	

}
