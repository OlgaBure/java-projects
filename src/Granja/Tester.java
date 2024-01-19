package Granja;

import java.util.Scanner;
public class Tester {
    //Crear objetos, llamar al toString ayudara a que lo ponga todo.

    public static Animal creaAnimal(){
        Scanner read = new Scanner(System.in);
        Animal aux = null;
        int opcion;
        do{
            System.out.println("Elige: 0.Oveja 1.Vaca 2.Gallina 3.Vaca 4.Cerdo");
            opcion=read.nextInt();
        }while (opcion != 1 && opcion != 2);

        System.out.println("Introduce: nombre, edad, peso");
        read.nextLine();
        String nombre = read.nextLine();

        int edad = read.nextInt();
        float peso = read.nextFloat();
        if(opcion == 1)
            //System.out.println();//pedir leche
            aux = new Vaca(nombre, edad, peso);
        else{
            //System.out.println();//pedir huevos
            aux = new Gallina (nombre, edad, peso);
        }
        return aux;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Gallina gallina = new Gallina();
        Cerdo cerdo = new Cerdo();
        Vaca vaca = new Vaca();
        Oveja oveja = new Oveja();
        Granja granja = new Granja();
        Animal animal = new Animal();
        Animal otro= creaAnimal();
        System.out.println(otro);
        System.out.println(granja);
    }
}



        /*Animal animal;
        animal = creaAnimal();
        System.out.println(animal);
       /*Gallina gallina = new Gallina();
        Oveja oveja = new Oveja(String nombre, int peso, int edad, int metrosaLana);//instanciar una clase, ejemplar de clase
        Cerdo cerdo = new Cerdo();
        System.out.println("Nuestra oveja se llama " + oveja.getNombre() + " y da " + oveja.getMetrosLana() + " metros de lana al trimesre." );
        Animal animal = new Animal();
        Granja granja = new Granja();*/
        //codigo de Gema de la clase
           /* Gallina random = new Gallina();
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, edad y peso");
        String nombre = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        Gallina especial= new Gallina(nombre, edad, peso);
        System.out.println(random.toString());
        System.out.println(especial.toString());
        System.out.println("Después de un año....");
        random.setEdad(random.getEdad()+1);
        random.setPeso(random.getPeso()+0.5f);
        especial.setEdad(especial.getEdad()+1);
        especial.setPeso(especial.getPeso()+0.75f);
        System.out.println(random.getPeso());
        System.out.println(especial.getPeso());
        especial.huevosDia(2,3);
        System.out.println(especial);*/
        /*
        //POO herencia
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, edad y peso");
        String nombre = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        Gallina especial= new Gallina(nombre, edad, peso);
        System.out.println(especial.toString());
        Gallina random = new Gallina();
        System.out.println(random);*/

