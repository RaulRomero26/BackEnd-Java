package practicaHarry;

public class NevilleLongbottom {
    private String name, house, gender, boggart, patronus;

    public NevilleLongbottom(String name,String house,String gender,String boggart,String patronus){
        this.name = name;
        this.house = house;
        this.gender = gender;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public void getInfo(){
        System.out.println("El nombre del personaje es: "+name+ " de la casa: "+house+", su genero es: "+gender+
                ", su boggart es: "+boggart+", su patronus es: "+patronus);
    }

}
