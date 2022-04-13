package clase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Autobuz implements Subject{
    private Set<Observer> observers;//ca sa nu avem duplicate folosim set
    private Integer nrLinie;

    public Autobuz(Integer nrLinie) {
        observers= new HashSet<Observer>();
        this.nrLinie = nrLinie;
    }

    @Override
    public void aboneazaObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dezaboneazaObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String mesaj) {
        for(Observer observer : observers){
            observer.primesteSms(mesaj);
        }

    }

    public void pleacaDeLaCapat(){
        notify("autobuzul cu numarul "+nrLinie+" pleaca de la capat");
    }
}
