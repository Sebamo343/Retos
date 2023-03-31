package src;
import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombreJugador = c.nextLine();

        int dineroAcumulado = 0;
        int cantidadJuegos = 0;

        do {
            System.out.print("Ingrese su apuesta (debe ser 10000 o más para poder): ");
            int apuesta = c.nextInt();

            // Verificar si la apuesta es mayor o igual a 10000
            if (apuesta < 10000) {
                System.out.println("La apuesta mínima es de 10000. Vuelve a intentarlo.");
                continue;
            }

            

            // Generar un número aleatorio entre 0 y 1 (0 = cara, 1 = sello)
            int resultado = (int) (Math.random() * 2);

            // Pedirle al usuario que adivine cara o sello
            System.out.print("¿Cara o sello? (0 = cara, 1 = sello): ");
            int eleccionJugador = c.nextInt();

            // Verificar si la elección del jugador coincide con el resultado
            if (eleccionJugador == resultado) {
                int dineroGanado = apuesta;
                dineroAcumulado += dineroGanado;
                System.out.println("¡Felicidades, " + nombreJugador + "! Ganaste " + dineroGanado + " pesos.");
            } else {
                int dineroPerdido = apuesta;
                dineroAcumulado -= dineroPerdido;
                System.out.println("Lo siento, " + nombreJugador + ", perdiste " + dineroPerdido + " pesos.");
            }

            System.out.println("Dinero acumulado: " + dineroAcumulado + " pesos");
            System.out.println("Cantidad de juegos: " + cantidadJuegos);
        } while (dineroAcumulado > 0);

        System.out.println("¡Gracias por jugar, " + nombreJugador + "! Tu dinero final es: " + dineroAcumulado + " pesos.");
        
        c.close();
    }
    
}
