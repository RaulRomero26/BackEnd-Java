package practicaMona;

public class Umbrelatocat extends Mona{

    String accesorio;

    public Umbrelatocat(boolean cabello, boolean ropa, String nombre, String actividad, int numero, String accesorio ){
        super(cabello, ropa, nombre, actividad, numero);
        this.accesorio = accesorio;
    }

    public  void getDetalles(){
        System.out.println(this.getInfo()+"Accesorio: "+accesorio);
    }
}
