package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader{

    protected AngajatiReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {


            scanner.useDelimiter(",");
            List<Aplicant> angajati = new ArrayList<Aplicant>();

            while (scanner.hasNext()) {
               Angajat angajat= new Angajat();
               readAplicant(scanner, angajat);
                int salariu = scanner.nextInt();
                String ocupatie = scanner.next();
                angajat.setSalariu(salariu);
                angajat.setOcupatie(ocupatie);
                angajati.add(angajat);
            }
            scanner.close();
            return angajati;


    }
}
