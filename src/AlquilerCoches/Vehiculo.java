package AlquilerCoches;
public abstract class Vehiculo {
    public double precio;
    public String modelo;
    public String color;
    public double año;

    public Vehiculo(double precio, String modelo, String color, double año){
       this.modelo= modelo;
        this.color=color;
        this.año=año;
        this.precio=precio;
    }

    public Vehiculo() {

    }

    public double getPrecio() {
        return precio;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public double getAño(){
        return año;
    }
    public void setPrecio(double precio){
        precio=34.000;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setAño(double año){
        this.año=año;
    }
    public abstract double mediaReservas();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "precio=" + precio +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", año=" + año +
                '}';
    }
}
