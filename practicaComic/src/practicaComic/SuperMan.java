package practicaComic;

public class SuperMan extends Thread{
    public void run(){
        try {
            Thread.sleep(70000);
            System.out.println("Super Man: ¿Penitencia, por que?");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
