package practicaComic;

public class Antimonitor extends Thread{
    public void run(){
        try {
            Thread.sleep(5000);
            System.out.println("Antimonitor: Se perdió la batalla retiremonos y ahorremos recursos para las batallas que vendran");
            System.out.println("Antimonitor: Comienza a teletransportar a todos...");
            Thread.sleep(15000);
            System.out.println("Antimonitor: No del todo");
            Thread.sleep(25000);
            System.out.println("Antimonitor: Lucho hasta el ultimo aliento sabiendo que cada momento salvaba otra vida.");
            Thread.sleep(10000);
            System.out.println("Antimonitor: Su universo ya no existe, de 7.53 mil millones tres mil millones llegaron a la tierra 1");
            System.out.println("Antimonitor: Calcule que mil millones de vidas sobrevivieron gracias a su noble sacrificio...");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
