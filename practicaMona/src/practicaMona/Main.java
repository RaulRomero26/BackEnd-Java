package practicaMona;

public class Main {
    public static void main(String[] args) {
        Umbrelatocat Umbrelatocat = new Umbrelatocat(false, false, "Umbrelatocat", "Caminar con Sombrilla", 140, "Sombrilla");
        Umbrelatocat.getDetalles();

        Boxertocat Boxertocat = new Boxertocat(false, false, "Boxertocat", "Boxear", 139, "Guantes de box", "esta pixelado");
        Boxertocat.getDetalles();

        Terracottocat Terracottocat = new Terracottocat(true, true, "Terracottocat", "Estar quieto", 147, false);
        Terracottocat.getDetalles();

        NUXtocat NUXtocat = new NUXtocat(false, false, "NUXtocat", "Usar la tecnología", 153, "Aparatos tecnológicos");
        NUXtocat.getDetalles();

        Dinotocat Dinotocat = new Dinotocat(false, true, "Dinotocat", "Molestar Insectos", 128, "Verde");
        Dinotocat.getDetalles();


        PrivateInvestocat PrivateInvestocat = new PrivateInvestocat(false, true, "Private Investocat", "Investigar Crimenes", 119, true, "Un maletin y una pipa");
        PrivateInvestocat.getDetalles();
    }
}
