package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends AplicantReader{


   protected EleviReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {


                scanner.useDelimiter(",|\n");
            List<Aplicant> elevi = new ArrayList<Aplicant>();

            while (scanner.hasNext()) {
                Elev elev= new Elev();
                readAplicant(scanner, elev);
                int clasa = scanner.nextInt();
                String tutore = scanner.next();
                elev.setClasa(clasa);
                elev.setTutore(tutore);
                elevi.add(elev);
            }

            scanner.close();
            return elevi;
    }
}
