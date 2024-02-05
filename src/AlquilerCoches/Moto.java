package AlquilerCoches;

import java.util.Arrays;

public class Moto extends Vehiculo{

    private int [] disponibilidadMoto;
    private int motor;

    public Moto(double precio, String modelo, String color,double año, int motor) {
        super(precio, modelo, color,año);
        this.motor=motor;
    }

    public Moto() {

    }

    /*public Moto(int motor){
        super(precio, modelo, color,año);
        motor=4.5;
    }*/
    public int[] getDisponibilidadMoto() {
        return disponibilidadMoto;
    }
    public void setDisponibilidadMoto(int[] disponibilidadMoto) {
        this.disponibilidadMoto = disponibilidadMoto;
    }
    public int getMotor() {
        return motor;
    }
    public void setMotor(int otroMotor) {
        otroMotor = 2400;
    }
    public double mediaReservas() {
        return 0;
    }

    @Override
    public String toString() {
        return "La Moto con el modelo " + modelo + " tiene la siguiente disponibilidad " +
                Arrays.toString(disponibilidadMoto) + ", motor " + motor + ", " +
                precio + " y su precio.";
    }

}
