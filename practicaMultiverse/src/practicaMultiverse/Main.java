package practicaMultiverse;

public class Main {
    public static void main(String[] args) {

        MilesMorales MilesMorales = new MilesMorales("Miles Gonzalo Morales", "Tierra 616", "Maculino","Controlar la electricidad");
        MilesMorales.getDetalles();
        MilesMorales.encadenarAraques();

        PeniParker PeniParker = new PeniParker("Peni Parker", "Tierra 14512", "Femenino","Cuebnta con un traje robot SP//DR");
        PeniParker.getDetalles();
        PeniParker.encadenarAraques();

        CyndiMoon CyndiMoon = new CyndiMoon("Cyndi Moon", "Tierra 616", "Femenino","Posee unas garras retractiles");
        CyndiMoon.getDetalles();
        CyndiMoon.encadenarAraques();
        }
    }
