package AlquilerCoches;

import java.util.Arrays;

public class Coche extends Vehiculo {

    private int [] disponibilidadCoche;
    private int [] plazas;

    public Coche(double precio, String modelo, String color,double año, int[]plazas) {
        super(precio, modelo, color,año);
        this.plazas=plazas;
    }
    public Coche (){
        super();
        plazas = new int[6];
        for (int i = 0; i < plazas.length; i++) {
            plazas[i]=(int)(Math.random()*5);
        }
    }

    public double calcularPrecio() {
        //return (kilometros>5000)?precio*1.1*(precio-kilometros):precio;
        return (plazas.length >= 5) ? precio + 1000 : precio;
    }

    public int[] getDisponibilidadCoche() {
        return disponibilidadCoche;
    }

    public void setDisponibilidadCoche(int[] disponibilidadCoche) {
        this.disponibilidadCoche = disponibilidadCoche;
    }
    public int[] getPlazas() {
        return plazas;
    }
    public void setPlazas(int[] plazas) {
        this.plazas = plazas;
    }
    @Override
    public double mediaReservas() {
        double mediaReservas = 0;
        for (int i = 0; i < disponibilidadCoche.length; i++) {
            mediaReservas += disponibilidadCoche[i];
        }
        return mediaReservas;
    }
    public double calcularPrecioReserva(){
        return getPrecio()+ plazas.length;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+String.format(" con el modelo " + modelo + "\ncolor " + color +"\nmodelo " +
                modelo + "y año de fabricacion " + año + " esta disponible " + Arrays.toString(disponibilidadCoche));
    }

}
/*"Coche con el modelo " + modelo + " y color " + color + "tiene la siguiente disponibilidad "
                +Arrays.toString(disponibilidadCoche) + " y plazas "
                + Arrays.toString(plazas)+ " por " + precio + "$.";*/
