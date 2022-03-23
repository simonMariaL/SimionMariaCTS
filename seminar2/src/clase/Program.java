package clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		List<Aplicant> listaAngajati;
		Reader reader= new AngajatiReader("angajati.txt");
		try {
			listaAngajati = reader.readAplicanti("angajati.txt");
			for(Aplicant aplicant:listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
