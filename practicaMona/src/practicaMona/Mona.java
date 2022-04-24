package practicaMona;

public class Mona {
    boolean cabello, ropa;
    String nombre, actividad;
    int numero;

    public Mona(boolean cabello, boolean ropa, String nombre, String actividad, int numero){
        this.cabello = cabello;
        this.ropa = ropa;
        this.nombre = nombre;
        this.actividad = actividad;
        this.numero = numero;
    }

    public String getInfo(){
        return "Nombre: "+nombre+" Actividad: "+actividad+" Número: "+numero
                +" Cabello: "+cabello+" Ropa: "+ropa+" ";
    }
}
