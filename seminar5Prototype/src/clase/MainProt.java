package clase;

public class MainProt {
    public static void main(String[] args) {
        Autobuz a1=new Autobuz("B22ABC", "Dorel");
        Tramvai t1=new Tramvai("12334", "Gigel");

        try{
            MijlocTransport a2= a1.copiaza();
            MijlocTransport t2=t1.copiaza();

            System.out.println("Original autobuz: "+a1);
            System.out.println("Original tramvai: "+t1);

            System.out.println("Copie autobuz: "+a2);
            System.out.println("Copie tramvai: "+t2);
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
