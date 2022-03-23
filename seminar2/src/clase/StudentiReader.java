package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader{
    protected StudentiReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {

        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();
        while (scanner.hasNext()) {
           Student student= new Student();
           readAplicant(scanner, student);
            int anStudii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            student.setAnStudii(anStudii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }
}
