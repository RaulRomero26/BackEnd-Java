package practicaMultiverse;

public class MilesMorales extends Spiderman implements Poderes{

    String habilidadEspecial;
   public MilesMorales(String nombre, String universo, String genero, String habilidadEspecial){

       super(nombre, universo, genero);
       this.habilidadEspecial = habilidadEspecial;
   }

   public void getDetalles(){
       System.out.println(getInfo()+" Especial: "+this.habilidadEspecial);
   }

    @Override
    public void lanzarRedes() {
        System.out.println("Lanza telaraña Eléctrica");
    }

    @Override
    public void treparMuros() {
        System.out.println("Trepa el muro para escapar");
    }

    @Override
    public void sentidoAracnido() {
        System.out.println("Utiliza el sentido aracnido para esquivar ataques");
    }

    @Override
    public void poderEspecial() {
        System.out.println("Electrifica sus telañaras, puede manejar la electricidad");
    }

    public void encadenarAraques(){
       lanzarRedes();
       treparMuros();
       sentidoAracnido();
       poderEspecial();
    }
}
