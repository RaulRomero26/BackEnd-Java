package practicaMona;

public class PrivateInvestocat extends Mona{


    boolean blancoYNegro;
    String accesorios;

    public PrivateInvestocat(boolean cabello, boolean ropa, String nombre, String actividad, int numero, boolean blancoYNegro, String accesorios ){
        super(cabello, ropa, nombre, actividad, numero);
        this.blancoYNegro = blancoYNegro;
        this.accesorios = accesorios;
    }

    public  void getDetalles() {
        System.out.println(this.getInfo() + " Blanco y Negro: " + blancoYNegro+" Accesorios: "+accesorios);
    }
}
