package clase;

public interface Subject {
    public void aboneazaObserver(Observer observer);
    public void dezaboneazaObserver(Observer observer);
    public void notify(String mesaj);
}
