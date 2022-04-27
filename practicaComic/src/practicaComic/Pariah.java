package practicaComic;

public class Pariah extends Thread{
    public void run(){
        try {
            Thread.sleep(65000);
            System.out.println("Pariah: Lo fui una vez ya no más, soy un simple hombre cumpliendo penitecnia");
            Thread.sleep(10000);
            System.out.println("Pariah: Libere al antimonitor de su encierro solo para volverme un Pariah");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
