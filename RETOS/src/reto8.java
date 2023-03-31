package src;
import java.util.Random;
import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        int numeroAdivinar;
        int numeroUsuario;
        int intentos = 0;

        Scanner c = new Scanner(System.in);

        Random random = new Random();
        numeroAdivinar = random.nextInt(100) + 1;


        // Pedir al usuario que adivine el número
        while (intentos < 10) {
            intentos++;
            System.out.print("Introduce un número del 1 al 100: ");
             numeroUsuario = c.nextInt();

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break;
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("El número a adivinar es menor.");
            }
        }

        // Si no se adivinó el número, mostrar el número a adivinar
        if (intentos == 10) {
            System.out.println("Lo siento, no lograste adivinar el número. El número era " + numeroAdivinar + ".");
        }
        c.close();
    }
}