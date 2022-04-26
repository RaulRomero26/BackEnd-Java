package practicaMultiverse;

public class PeniParker extends  Spiderman implements  Poderes{
    String habilidadEspecial;
    public PeniParker(String nombre, String universo, String genero, String habilidadEspecial){

        super(nombre, universo, genero);
        this.habilidadEspecial = habilidadEspecial;
    }

    public void getDetalles(){
        System.out.println(getInfo()+" Especial: "+this.habilidadEspecial);
    }

    @Override
    public void lanzarRedes() {
        System.out.println("El traje robótico lanza las redes");
    }

    @Override
    public void treparMuros() {
        System.out.println("Escala con un Jetpack");
    }

    @Override
    public void sentidoAracnido() {
        System.out.println("El traje robot tiene sensores");
    }

    @Override
    public void poderEspecial() {
        System.out.println("Maneja un traje robótico");
    }

    public void encadenarAraques(){
        lanzarRedes();
        treparMuros();
        sentidoAracnido();
        poderEspecial();
    }
}
