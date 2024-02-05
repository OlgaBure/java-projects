package Ajedrez;
public class Movimiento {
    private Posicion posInicial;
    private Posicion posFinal;

    public Movimiento(){
    }
    public Movimiento(Posicion posInicial, Posicion posFinal){
        this.posInicial=posInicial;
        this.posFinal=posFinal;
    }
    public boolean esVertical(){
        return posInicial.getColumna()== posFinal.getColumna();
    }
    public boolean esHorizontal(){
        return posInicial.getFila()== posFinal.getFila();
    }
    public boolean esDiagonal(){
        return Math.abs(saltoVertical())==Math.abs(saltoHorizontal());
    }
    public int saltoHorizontal(){//diferencia de filas
        return posFinal.getFila()- posInicial.getFila();
    }
    public int saltoVertical(){// diferencia de columnas
        return posFinal.getColumna()- posInicial.getColumna();
    }

}
