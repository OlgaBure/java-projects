package Ajedrez;

public class Torre extends Pieza{

    public Torre(){
        super();
    }
    public Torre(String color){
        super();
    }
    public boolean validarMovimiento(Movimiento movimiento){
        boolean respuesta = false;
        if(movimiento.esHorizontal()||movimiento.esVertical()||movimiento.esDiagonal()){
            respuesta=true;
        }
        return respuesta;
    }
    public boolean pintarPieza(){
        bool=false;
        if(){
            System.out.println("&#x2656;");
        }else{
            System.out.println("&#x265c;");
        }
        return true;
    }
}
