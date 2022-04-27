package practicaComic;

public class Flash extends Thread {
    public void run(){
        try {
            Thread.sleep(10000);
            System.out.println("Flash: ¡Oliver Cuidado!");
            System.out.println("El Antimonitor lo transporta...");
            Thread.sleep(30000);
            System.out.println("Flash: ¡Oliver!");
            Thread.sleep(20000);
            System.out.println("Flash: ¿Flash?");
            Thread.sleep(25000);
            System.out.println("Flash: Oliver");
            Thread.sleep(10000);
            System.out.println("Flash: ¿De que estas hablando?");
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
