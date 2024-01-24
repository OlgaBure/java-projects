package Figuras;

public class Punto {

    private double x; //atributos
    private double y;

//los constructores

    public Punto (){
        x = Math.random()*100; // x=10; constructor vlae para inicializar valores de atributos
        y = Math.random()*100;
    }
    public Punto (double otroX, double otroY){//parametros entre parentesis
        x = otroX; //referencia del objeto this
        y = otroY;
    }
     public double getX (){
        return x;
     }
    public double getY (){
        return y;
    }

    public double calcularDistanciaDesde(Punto otroPunto){
        return Math.sqrt(Math.pow(x-otroPunto.x,2)+ Math.pow(y-otroPunto.y,2));
    }
   @Override
    public String toString() { //metodo que convierte la cadena de codigo al texto
        return "Figuras.Punto{" + "x=" + x + ", y=" + y + '}'; // cambiar la vercion de tu padre //la vercion especifica del padre
    }
}
