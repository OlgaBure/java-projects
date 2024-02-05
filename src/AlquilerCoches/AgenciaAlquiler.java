package AlquilerCoches;

import java.util.Arrays;

public class AgenciaAlquiler {
    private String reservas;
    public Vehiculo [] listaVehiculos;
    public boolean disponible = false;

    public AgenciaAlquiler(String reservas, Vehiculo[] listaVehiculos){
        this.reservas = reservas;
        this.listaVehiculos= listaVehiculos;
    }

    public AgenciaAlquiler(){

    }

    public String getReservas() {
        return reservas;
    }

    public void setReservas(String reservas) {
        this.reservas = reservas;
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(Vehiculo[] listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    /*public int listaVehiculosDisponibles(int plazas){
        System.out.println("La lista de los vehiculos con " + plazas +
                " y la disponibilidad para hacer reserva son: ");
        boolean disponible = true;
        for (int i = 0; i < listaVehiculos.length; i++) {
            if(listaVehiculos[i] >=plazas){
                System.out.println(listaVehiculos[i].toString());
                disponible=false;
            }
        }
        return this.listaVehiculos.length
    }*/

    @Override
    public String toString() {
        return "AgenciaAlquiler tiene " +
                "reservas='" + reservas + '\'' +
                "y los vehiculos disponibles para alquiler = " + Arrays.toString(listaVehiculos) +
".";

    }
}
