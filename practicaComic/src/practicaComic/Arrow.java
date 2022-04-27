package practicaComic;

public class Arrow extends  Thread{
    public void run(){
        try {
            Thread.sleep(15000);
            System.out.println("Arrow: ¿Ya evacuarón el planeta?");
            Thread.sleep(10000);
            System.out.println("Arrow: Aun no es hora");
            Thread.sleep(5000);
            System.out.println("Arrow continua peleando...");
            Thread.sleep(50000);
            System.out.println("Arrow: Este es mi destino Barry");
            Thread.sleep(10000);
            System.out.println("Arrow: Tu amigo mio eres el mejor de todos, renuncie a mi vida por ti y kara");
            Thread.sleep(10000);
            System.out.println("Arrow: Necesito que ustedes dos se comprometan a salvarnos ahora");
            Thread.sleep(5000);
            System.out.println("Arrow: Mia no olvides buscar a tu madre, encuentra a william y dile que también lo amo");
            Thread.sleep(5000);
            System.out.println("Arrow: Te amo Mia, llevame en tu corazón de acuerdo.");
            Thread.sleep(5000);
            System.out.println("Arrow: es hora...");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
