package practicaHarry;

public class Main {
    public static void main(String[] args) {
        TomRiddle TomRiddle= new TomRiddle("Tom Marvolo Riddle","Slytherin","Masculino","Su propio cadaver","Ninguno");
        TomRiddle.getInfo();

        SeverusSnape SeverusSnape= new SeverusSnape("Severus Snape","Slytherin","Masculino","Lord Voldemort","Doe");
        SeverusSnape.getInfo();

        DracoMalfoy DracoMalfoy= new DracoMalfoy("Draco Lucius Malfoy","Slytherin","Masculino","Lord Voldemort","Ninguno");
        DracoMalfoy.getInfo();

        GinevraWeasley GinevraWeasley= new GinevraWeasley("Ginevra Molly Potter","Gryffindor","Femenino","Lord Voldemort","Horse");
        GinevraWeasley.getInfo();

        NevilleLongbottom NevilleLongbottom= new NevilleLongbottom("Neville Longbottom","Gryffindor","Masculino","Severus Snape","Non-corporeal");
        NevilleLongbottom.getInfo();
    }
}
