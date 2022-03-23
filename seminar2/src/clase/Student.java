package clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}
	public Student() {
		super();
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Student{");
		sb.append(super.toString());
		sb.append(", facultate='").append(facultate).append('\'');
		sb.append(", anStudii=").append(anStudii);
		sb.append('}');
		return sb.toString();
	}
}
