import java.util.Comparator;

public class OPeso implements Comparator <Personas>{


	//Comparador de peso
	
	public int compare(Personas o1, Personas o2) {
		
		return o1.getPeso()-o2.getPeso();
	}

}
