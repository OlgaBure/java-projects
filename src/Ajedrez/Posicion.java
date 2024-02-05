package Ajedrez;

public class Posicion {
    private int fila;
    private int columna;

    public Posicion(){
    }
    public Posicion(int fila, int columna){
        this.fila=fila;
        this.columna=columna;
    }
    public int getFila(){
        return fila;
    }

    /**
     *
     * @param fila nueva
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * metodo que devuelve el valor de la fila dela posicion
     * @return
     */
    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    public String toString(){
        return toString().getClass().getSimpleName() + String.format("Fila " + fila + " columna " + columna +".");
    }
}
