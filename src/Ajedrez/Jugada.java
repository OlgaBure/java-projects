package Ajedrez;

public class Jugada {
    /**
     * poner el mismo tipo en turno que en el color de mi pieza
     */
    private String turno;
    private boolean blanco = true;//false seria negro
    public String getTurno(){
        return turno;
    }
    public void setTurno(int elTurno) {//en parentesis parametros, setter devuelve
        this.turno = turno;
    }
    public Jugada(){

    }
    public Movimiento jugada(String jugada, Tablero tablero){
        return null;
    }
    public Movimiento movimientoJugada(String jugada){
        Movimiento movimiento = null;
        //*A3A4*
        int columnaInicial = jugada.charAt(0)-65;//A es el ASCII 65, 'H' es el 72
        int filaInicial = jugada.charAt(1)-49;//'1' es el ascii 49

        if(jugada.length()!=4){
            System.out.println("Error.LA jugada deberia ser del tipo:A2A3 (A...H, 1...8)");
        } else if (!(columnaInicial>=0 && columnaInicial<=7)) {
            System.out.println("Error. La columna y la fila tiene que ser entre 1 y 8");
        }else{//ole mi movimiento
            //mov=new Movimiento(new Position(filaInicial, columnaInicial), new Position());
            System.out.println();
        }
        return movimiento;
    }
}
