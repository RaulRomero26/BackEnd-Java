package practicaMona;

public class Boxertocat extends Mona{


    String accesorio;
    String especial;

    public Boxertocat(boolean cabello, boolean ropa, String nombre, String actividad, int numero, String accesorio, String especial){
        super(cabello, ropa, nombre, actividad, numero);
        this.accesorio = accesorio;
        this.especial = especial;
    }

    public  void getDetalles(){
        System.out.println(this.getInfo()+"Accesorio: "+accesorio+" Especial: "+especial);
    }
}
