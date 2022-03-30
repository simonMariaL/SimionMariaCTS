package clase;

public class Tramvai extends MijlocTransport{
    private String numeVatman;

    public Tramvai(String numar, String numeVatman) {
        super(numar);
        this.numeVatman=numeVatman;
    }

    public String getNumeVatman() {
        return numeVatman;
    }

    public void setNumeVatman(String numeVatman) {
        this.numeVatman = numeVatman;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("numeVatman='").append(numeVatman).append('\'');
        sb.append("numar='").append(getNumar()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

