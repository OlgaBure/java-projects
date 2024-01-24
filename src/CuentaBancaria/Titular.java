package CuentaBancaria;

public class Titular {
    private Titular titularCuenta;
    private  String correo;
    private  String nombre;

    public Titular(){

    }
    public Titular(Titular titularCuenta, String correo, String nombre){
        this.nombre = nombre;
        this.correo = correo;
        this.titularCuenta = titularCuenta;
    }

    public Titular getTitularCuenta() {
        return titularCuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Titular de la Cuenta = " + titularCuenta + ",correo' " + correo + '\'' +
                ", nombre '" + nombre + '.';
    }
}
