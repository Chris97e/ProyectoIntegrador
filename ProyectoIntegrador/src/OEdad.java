import java.util.Comparator;

public class OEdad implements Comparator<Personas> {

	//Comparar personas
	public int compare(Personas o1, Personas o2) {
		
		return o2.getEdad()-o1.getEdad();
	}

}
