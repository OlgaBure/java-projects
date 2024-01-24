package CuentaBancaria;
public class CuentaCorriente {
    private String nombre;
    private String apellidos;
    private int edad;
    private Titular titularCuenta;
    private String numeroCuenta;
    private double saldo;

    public CuentaCorriente(Titular titularCuenta, String numeroCuenta) {
        this.titularCuenta = titularCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public CuentaCorriente(Titular titularCuenta, String numeroCuenta, double saldo) {
        this.titularCuenta = titularCuenta;
        this.numeroCuenta = numeroCuenta;
        saldo = 15.3;
    }
    public CuentaCorriente(){}

    public Titular getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(Titular titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void ingresar(double cantidad){//ingresamos la cantidad ala cuenta"cantidad"
        saldo=saldo+cantidad;
    }
    public void reintegro (double cantidad){
        setSaldo(saldo-cantidad);
    }
    //Tenga un método para que al imprimir la cuenta salga por pantalla el
    //número de cuenta y su saldo.
    public boolean compararCuentas(String otroNumeroCuenta){
       int resultado = this.numeroCuenta.compareTo(otroNumeroCuenta);
       return resultado == 0;
       /*boolean respuesta = false;
       if(resultado==0)
           respuesta = true;
       return respuesta;*/
        //operador ternario  return (resultado==0)?true:false;
    }
    public static boolean compararCuentas(String numeroCuenta1, String numeroCuenta2){
        int resultado = numeroCuenta1.compareTo(numeroCuenta2);
        boolean respuesta = false;
        if(resultado==0)
            respuesta = true;
        return respuesta;
    }
    //comparacion de cuentas con esIgual boolean
    public boolean esIgual(String otroNumeroCuenta){
        return  this.numeroCuenta.equals(otroNumeroCuenta);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "titularCuenta=" + titularCuenta +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

