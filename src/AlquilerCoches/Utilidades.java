package AlquilerCoches;

public class Utilidades {

    public static final String [] modelo = {"Audi","BMW","Porshe","Maserati","Mercedes","KIA"};

    public static final String [] color = {"Blanco","Rojo","Negro","Azul","GreyNardo","VerdeOliva","Silver"};
    public static String getModeloAleatorio(){
        return Utilidades.modelo[(int)(Math.random()*Utilidades.modelo.length)];
    }
    public static String getColorAleatorio(){
        return Utilidades.color[(int)(Math.random()*Utilidades.color.length)];
    }
    }

