package CuentaBancaria;
public class CuentaAhorro extends CuentaCorriente{
    private String nombre;
    private String apellidos;
    private int edad;
    private Titular titularCuenta;
    private String numeroCuenta;
    private double interes;
    private double saldo;
    public CuentaAhorro(){}

    public CuentaAhorro(Titular titularCuenta, String numeroCuenta, double saldo, double interes) {
        super(titularCuenta, numeroCuenta);
        this.interes = interes;
        this.saldo = saldo;
    }

    public CuentaAhorro (Titular titularCuenta, String numeroCuenta){
        this(titularCuenta,numeroCuenta,15.3, 2.5);
    }

    public CuentaAhorro(String titular, String es345353453345, double saldo, double interes) {
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public Titular getTitularCuenta() {
        return titularCuenta;
    }

    @Override
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public  double getInteres(){
        return interes;
    }
    public  double getSaldo(){
        return saldo;
    }


    public void calcularInteres(){
        int contador = 0;
        contador ++;
        double total_Interes;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", titularCuenta=" + titularCuenta +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", interes=" + interes +
                ", saldo=" + saldo +
                '}';
    }
}
