package Ajedrez;
//padre de las piezas
public abstract class Pieza {
    private String color;
    protected String nombre;

    public Pieza() {
        nombre= this.getClass().getSimpleName();
        color="Blanco";
    }
    public Pieza(String color) {
        nombre= this.getClass().getSimpleName();
        this.color = color;
    }
    public boolean validarMovimiento(Movimiento movimiento){
        boolean respuesta = false;
        if(movimiento.esHorizontal()||movimiento.esVertical()||movimiento.esDiagonal()){
            respuesta=true;
        }
        return respuesta;
    }
    @Override
    public String toString() {
        return Character.toString(nombre.charAt(0))+color.charAt(0) + " ";
    }
}

