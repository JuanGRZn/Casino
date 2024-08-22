import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Juan Nadres Garzon Malagon//
        //22-08-2024//

        int cantidad = 0, opcion;
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        do {
            System.out.println(" BIENVENIDO AL JUEGO APUESTA Y GANA");
            System.out.println(" 1. Jugar");
            System.out.println(" 2. Salir del juego");
            //System.out.println(" 3. Calcular total");//
            System.out.println("Elige una opcion");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                    int dinero = 0;
                    System.out.println(" Cantidad que quiere apostar ");
                    cantidad = teclado.nextInt();
                    int x = aleatorio.nextInt(1, 4);
                    System.out.println(x);
                    if ( x == 1 ){
                        dinero = cantidad * 2;
                        System.out.println("Multiplicaste tu dinero. Dinero actual= " + dinero);
                    }
                    else if ( x == 2) {
                        dinero = cantidad / 2;
                        System.out.println("Perdiste la mitad de tu dinero. Dinero actual= " + dinero);
                    }
                    else if ( x == 3 ) {
                        dinero = cantidad - cantidad;
                        System.out.println("Perdiste todo tu dinero. Dinero actual= " + dinero) ;
                    }

                    break;

                case 2:
                    System.out.println("Adios");
                    break;

            }
        } while (opcion !=3);

    }
}