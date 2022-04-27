package practicaComic;

public class Narrador extends Thread {
    public void run(){
        try {
            long inicio = System.currentTimeMillis();
            System.out.println("Narrador: En algun lugar en la Tierra 38...\n");
            Thread.sleep(35000);
            System.out.println("Narrador: Tierra 1 Ciudad Star...\n");
            Thread.sleep(85000);
            System.out.println("Narrador: Y asi arrow termina muriendo...");
            long fin = System.currentTimeMillis();
            double tiempo = (double) ((fin - inicio)/1000);
            System.out.println(tiempo +"s segundos");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
