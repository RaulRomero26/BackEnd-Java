package practicaMona;

public class Dinotocat extends Mona{

    String color;

    public Dinotocat(boolean cabello, boolean ropa, String nombre, String actividad, int numero, String color ){
        super(cabello, ropa, nombre, actividad, numero);
        this.color = color;
    }

    public  void getDetalles() {
        System.out.println(this.getInfo() + " Color: " + color);
    }
}
