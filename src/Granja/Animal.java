package Granja;

public class Animal {
    //--------------------atributos--------------------------------------
    protected String nombre;
    protected   int edad;
    protected float peso;
    //-------------------------constructores------------------------------
    public Animal(){
        /*nombre= Utilidades.nombres[(int)(Math.random()* Utilidades.nombres.length)];
        edad= (int)(Math.random()*9);
        peso=(float)(Math.random()*100+1;*/
        this(Utilidades.nombres[(int)(Math.random()*Utilidades.nombres.length)],(int)(Math.random()*9),(float)(Math.random()*100+1));
    }
    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    //------------------GETTER Y SETTER----------------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}
