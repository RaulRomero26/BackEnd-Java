package practicaMona;

public class NUXtocat extends  Mona{
    String accsesorios;

    public NUXtocat(boolean cabello, boolean ropa, String nombre, String actividad, int numero, String accesorios ){
        super(cabello, ropa, nombre, actividad, numero);
        this.accsesorios = accesorios;
    }

    public  void getDetalles() {
        System.out.println(this.getInfo() + "Accsesorios: " + accsesorios);
    }
}
