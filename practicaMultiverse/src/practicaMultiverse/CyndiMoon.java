package practicaMultiverse;

public class CyndiMoon extends Spiderman implements  Poderes{
    String habilidadEspecial;
    public CyndiMoon(String nombre, String universo, String genero, String habilidadEspecial){

        super(nombre, universo, genero);
        this.habilidadEspecial = habilidadEspecial;
    }

    public void getDetalles(){
        System.out.println(getInfo()+" Especial: "+this.habilidadEspecial);
    }

    @Override
    public void lanzarRedes() {
        System.out.println("Lanza redes de telaraña naturales");
    }

    @Override
    public void treparMuros() {
        System.out.println("Puede escalar muros con facilidad");
    }

    @Override
    public void sentidoAracnido() {
        System.out.println("Tiene un hiper sentido aracnido conectado con el de peter");
    }

    @Override
    public void poderEspecial() {
        System.out.println("Posee unas garras retractiles, las usa para atacar");
    }

    public void encadenarAraques(){
        lanzarRedes();
        treparMuros();
        sentidoAracnido();
        poderEspecial();
    }
}
