package TiendaCoches;
public class Coche {
    public int Coche;
    public String color;
    public String modelo;
    int kilometros [] = new int[15000];

    private Coche(){

    }
    private Coche(int Coche, String color, String modelo, int kilometros){
        this.Coche=Coche;
        this.color = color;
        this.modelo=modelo;

    }



}
