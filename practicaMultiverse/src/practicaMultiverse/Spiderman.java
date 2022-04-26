package practicaMultiverse;

public class Spiderman {

    String nombre,universo,genero;

    Spiderman(String nombre, String universo, String genero){
        this.nombre = nombre;
        this.universo = universo;
        this.genero = genero;
    }

    public String getInfo(){
        return"Nombre: "+nombre+" Universo: "+universo+" Género: "+genero;
    }
}
