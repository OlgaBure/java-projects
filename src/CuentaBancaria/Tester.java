package CuentaBancaria;
//        ◦ Modificar teléfono de un Contacto.
//        ◦ Cambiar correo electrónico de un Contacto.
//        ◦ CompararContacto indicando si dos contactos son iguales.
public class Tester {
    public static void main(String[] args) {
        GestorContactos gestorContactos = new GestorContactos();
        Titular titular = new Titular();
        CuentaAhorro cuentaAhorro = new CuentaAhorro("Pepe Idalgo", "ES345353453345",7.67, 450.55);
        CuentaCorriente cuentaCorriente = new CuentaCorriente();

        System.out.println();
    }
    //Practica6 que en su método main cree varias cuentas de
    //distinto tipo y trabaje con ellas.
}
