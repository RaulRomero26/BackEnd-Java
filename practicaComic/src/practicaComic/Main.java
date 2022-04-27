package practicaComic;

public class Main {
    public static void main(String[] args) {
        Narrador Narrador=new Narrador();
        Narrador.start();

        Antimonitor Antimonitor=new Antimonitor();
        Antimonitor.start();

        Flash Flash=new Flash();
        Flash.start();

        Arrow Arrow=new Arrow();
        Arrow.start();

        SuperChica SuperChica=new SuperChica();
        SuperChica.start();

        Pariah Pariah=new Pariah();
        Pariah.start();

        SuperMan SuperMan=new SuperMan();
        SuperMan.start();
    }
}
