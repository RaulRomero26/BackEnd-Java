package practicaMona;

public class Terracottocat extends  Mona{
    boolean movimeinto;

    public Terracottocat(boolean cabello, boolean ropa, String nombre, String actividad, int numero, boolean movimeinto ){
        super(cabello, ropa, nombre, actividad, numero);
        this.movimeinto = movimeinto;
    }

    public  void getDetalles(){
        System.out.println(this.getInfo()+"Movimiento: "+movimeinto);
    }
}
