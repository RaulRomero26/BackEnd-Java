package practicaComic;

public class SuperChica extends Thread{
    public void run(){
        try {
            Thread.sleep(50000);
            System.out.println("Super Chica: ¿Otra?");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
