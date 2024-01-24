package Granja;
import java.util.Arrays;
public class Granja {
    public Animal [] listaAnimales;
    public Granja(){
        this(10);
    }

    public void media (){
        for (int i = 0; i < listaAnimales.length; i++) {
            System.out.println(listaAnimales[i] + " produce de media " + listaAnimales[i].media());
        }
    }
    @Override
    public String toString() {
        return "Granja{" +
                "listaAnimales=" + Arrays.toString(listaAnimales) +
                '}';
    }
    private Granja(int tamanyo){
       listaAnimales=new Animal[tamanyo];
        for(int i = 0; i < listaAnimales.length/2; i++) {
            int dado = (int)(Math.random()*5);
                switch (dado){
                    case 0:
                        listaAnimales[i] = new Gallina();
                        break;
                    case 1:
                        listaAnimales[i] = new Vaca();
                        break;
                    case 2:
                        listaAnimales[i] = new Oveja();
                        break;
                    case 3:
                        listaAnimales[i] = new Cerdo();
                        break;
                    default:
                        System.out.println();
                }
        }
    }
}
